package io.temporal.samples.springboot.uam.workflow;

import io.temporal.activity.ActivityOptions;
import io.temporal.samples.springboot.uam.activity.UserAccountMappingActivity;
import io.temporal.samples.springboot.updateaccount.model.UserAccount;
import io.temporal.samples.springboot.updateaccount.model.UserAccountMappingStatus;
import io.temporal.spring.boot.WorkflowImpl;
import io.temporal.workflow.Workflow;

import java.time.Duration;

@WorkflowImpl(taskQueues = "UserAccountMappingTaskQueue")
public class UserAccountMappingWorkflowImpl implements UserAccountMappingWorkflow {

    private UserAccountMappingActivity activity =
            Workflow.newActivityStub(
                    UserAccountMappingActivity.class,
                    ActivityOptions.newBuilder().setStartToCloseTimeout(Duration.ofSeconds(15)).build());

    @Override
    public void mapUserToAccount(UserAccount userAccount) {

        int i = 0;
        // Step 1: Perform validations
        activity.validateUser(userAccount.getUser());
        activity.validateAccount(userAccount.getAccount());
        // Step 2: Map only when the user is not mapped to the account.
        if(activity.validateUserAccountMapping(userAccount.getUser(), userAccount.getAccount() ) == UserAccountMappingStatus.NOT_MAPPED) {
            activity.mapUserToAccount(userAccount.getUser(), userAccount.getAccount());
            //step 3: create the roles.
            userAccount.getRoles().forEach(role ->
                    activity.createUserRole(userAccount.getUser(), role));
        }
    }
}
