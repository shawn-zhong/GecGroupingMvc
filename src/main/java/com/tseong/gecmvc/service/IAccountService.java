package com.tseong.gecmvc.service;

import com.tseong.gecmvc.model.Account;

import java.util.List;

public interface IAccountService {

    Account getAccountByName(String name);

    Account getAccountById(int id);

    List<Account> selectAll();

    int insertAccount(Account account);
}
