package io.temporal.samples.springboot.updateaccount.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
public class UserAccount {

    private User user;

    private Account account;

    List<Role> roles = new ArrayList<>();

    public String getUserAccountMapping() {
        if(null == user && null == account)
            return "No mapping found";
        else if (null == user)
            return "No mapping found for the account: " + account.getAccountId() + ": " + account.getAccountName();
        else if (null == account)
            return "No mapping found for the user: " + user.getUserName();
        return "User " + user.getUserName() + " is mapped with the account " + account.getAccountId() + ":" + account.getAccountName();
    }
}
