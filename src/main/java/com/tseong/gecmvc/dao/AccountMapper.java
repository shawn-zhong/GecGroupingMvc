package com.tseong.gecmvc.dao;

import com.tseong.gecmvc.model.Account;

import java.util.List;

public interface AccountMapper {
    int deleteByPrimaryKey(Integer accountId);

    int insert(Account record);

    int insertSelective(Account record);

    Account selectByPrimaryKey(Integer accountId);

    Account selectByName(String name);

    List<Account> selectAll();

    int updateByPrimaryKeySelective(Account record);

    int updateByPrimaryKey(Account record);
}