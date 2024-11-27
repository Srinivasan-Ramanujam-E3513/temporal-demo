/*
 *  Copyright (c) 2020 Temporal Technologies, Inc. All Rights Reserved
 *
 *  Copyright 2012-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 *  Modifications copyright (C) 2017 Uber Technologies, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"). You may not
 *  use this file except in compliance with the License. A copy of the License is
 *  located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 *  or in the "license" file accompanying this file. This file is distributed on
 *  an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 *  express or implied. See the License for the specific language governing
 *  permissions and limitations under the License.
 */

package io.temporal.samples.springboot.uam.activity;

import io.temporal.activity.ActivityInterface;
import io.temporal.samples.springboot.updateaccount.model.Account;
import io.temporal.samples.springboot.updateaccount.model.Role;
import io.temporal.samples.springboot.updateaccount.model.User;
import io.temporal.samples.springboot.updateaccount.model.UserAccountMappingStatus;

@ActivityInterface
public interface UserAccountMappingActivity {

  void validateUser(User user);

  void validateAccount(Account account);

  UserAccountMappingStatus validateUserAccountMapping(User user, Account account);

  void mapUserToAccount(User user, Account account);

  void createUserRole(User user, Role role);


}
