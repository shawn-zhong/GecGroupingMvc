package com.tseong.gecmvc.model;

public class Account {
    private Integer accountId;

    private String accountName;

    private String accountPwd;

    private Integer accountActive;

    private String accountRemark;

    public Account(Integer accountId, String accountName, String accountPwd, Integer accountActive, String accountRemark) {
        this.accountId = accountId;
        this.accountName = accountName;
        this.accountPwd = accountPwd;
        this.accountActive = accountActive;
        this.accountRemark = accountRemark;
    }

    public Account() {
        super();
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName == null ? null : accountName.trim();
    }

    public String getAccountPwd() {
        return accountPwd;
    }

    public void setAccountPwd(String accountPwd) {
        this.accountPwd = accountPwd == null ? null : accountPwd.trim();
    }

    public Integer getAccountActive() {
        return accountActive;
    }

    public void setAccountActive(Integer accountActive) {
        this.accountActive = accountActive;
    }

    public String getAccountRemark() {
        return accountRemark;
    }

    public void setAccountRemark(String accountRemark) {
        this.accountRemark = accountRemark == null ? null : accountRemark.trim();
    }
}