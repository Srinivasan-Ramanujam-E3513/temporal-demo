package io.temporal.samples.springboot.uam.activity;

import io.temporal.samples.springboot.updateaccount.model.Account;
import io.temporal.samples.springboot.updateaccount.model.Role;
import io.temporal.samples.springboot.updateaccount.model.User;
import io.temporal.samples.springboot.updateaccount.model.UserAccountMappingStatus;
import io.temporal.spring.boot.ActivityImpl;
import org.springframework.stereotype.Component;

@Component
@ActivityImpl(taskQueues = "UserAccountMappingTaskQueue")
public class UserAccountMappingActivityImpl implements UserAccountMappingActivity {


  @Override
  public void validateUser(User user) {

  }

  @Override
  public void validateAccount(Account account) {

  }

  @Override
  public UserAccountMappingStatus validateUserAccountMapping(User user, Account account) {
    return UserAccountMappingStatus.NOT_MAPPED;

  }

  @Override
  public void mapUserToAccount(User user, Account account) {

  }

  @Override
  public void createUserRole(User user, Role role) {

  }
}
