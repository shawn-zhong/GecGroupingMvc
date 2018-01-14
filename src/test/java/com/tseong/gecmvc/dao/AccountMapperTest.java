package com.tseong.gecmvc.dao;

import com.tseong.gecmvc.model.Account;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/applicationContext.xml")
@Transactional
@Rollback(false)
public class AccountMapperTest {

    @Autowired
    private AccountMapper accountMapper;

    @Test
    public void testGetUserByName() {
        Account acc = accountMapper.selectByName("shawn");
        System.out.println(acc.getAccountName()+acc.getAccountPwd()+acc.getAccountPwd());
        assert(acc.getAccountId() == 1);

    }

    @Test
    @Rollback
    public void testAddUsers() {
        Account acc = new Account();
        acc.setAccountName("JUnit Account2");
        acc.setAccountPwd("Junit Account pwd2");
        acc.setAccountActive(0);
        acc.setAccountRemark("junit generated2");
        accountMapper.insertSelective(acc);

        Account accget = accountMapper.selectByName("JUnit Account2");
        System.out.println(accget.getAccountId() + accget.getAccountName()+accget.getAccountPwd()+accget.getAccountPwd());
        Assert.assertEquals("Junit Account pwd2", accget.getAccountPwd());
    }
}
