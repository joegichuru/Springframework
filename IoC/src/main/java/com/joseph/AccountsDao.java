package com.joseph;

import java.util.Map;

/**
 * Created by joseph on 7/1/17.
 */
public class AccountsDao {
    private Map<String,String> accounts;

    public Map<String, String> getAccounts() {
        return accounts;
    }

    public void setAccounts(Map<String, String> accounts) {
        this.accounts = accounts;
    }
}
