package io.temporal.samples.springboot.uam.workflow;

import io.temporal.samples.springboot.updateaccount.model.UserAccount;
import io.temporal.workflow.WorkflowInterface;
import io.temporal.workflow.WorkflowMethod;

@WorkflowInterface
public interface UserAccountMappingWorkflow {

  @WorkflowMethod
  void mapUserToAccount(UserAccount userAccount);
}
