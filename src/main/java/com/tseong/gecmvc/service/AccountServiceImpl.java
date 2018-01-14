package com.tseong.gecmvc.service;

import com.tseong.gecmvc.dao.AccountMapper;
import com.tseong.gecmvc.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements IAccountService {

    @Autowired
    AccountMapper accountMapper;

    public Account getAccountByName(String name) {
        return  accountMapper.selectByName(name);
    }

    public Account getAccountById(int id) {return  accountMapper.selectByPrimaryKey(id);}

    public List<Account> selectAll(){return  accountMapper.selectAll();}

    public int insertAccount(Account account){return  accountMapper.insertSelective(account); }
}
