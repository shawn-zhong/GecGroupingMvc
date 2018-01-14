package com.tseong.gecmvc.web;

import com.sun.deploy.net.HttpResponse;
import com.tseong.gecmvc.model.Account;
import com.tseong.gecmvc.model.Person;
import com.tseong.gecmvc.service.IAccountService;
import com.tseong.gecmvc.service.IPersonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("users")
public class DemoLogin {

    @Autowired
    private IAccountService accountService;

    private Logger logger = LoggerFactory.getLogger(DemoLogin.class);

    //@CrossOrigin(origins = "http://localhost:8066", maxAge = 18000)
    @RequestMapping(value="all", method = RequestMethod.GET)
    @ResponseBody
    List<Account> getAll() {

        logger.debug("hello logger debug");
        logger.info("hello logger info");
        logger.error("hello logger error");

        System.out.println("...getting ALL executing ...");
        List<Account> ret = accountService.selectAll();
        return ret;
    }

    @CrossOrigin
    @RequestMapping(value="name/{name}", method = RequestMethod.GET)
    @ResponseBody
    Account getByName(@PathVariable String name) {
        return accountService.getAccountByName(name);
    }

    //@CrossOrigin
    @RequestMapping(value="add", method = RequestMethod.POST)
    @ResponseBody
    Account add(@RequestBody  Account account) {

        System.out.println("Account parameter : " + account.getAccountName() +"," + account.getAccountPwd());

        if (accountService.getAccountByName(account.getAccountName()) != null) {
            return null;
        }

        Account acc = new Account(){};
        acc.setAccountId(null);
        acc.setAccountActive(1);
        acc.setAccountName(account.getAccountName());
        acc.setAccountPwd(account.getAccountPwd());

        accountService.insertAccount(acc);
        return accountService.getAccountByName(account.getAccountName());
    }

    //@CrossOrigin
    @RequestMapping(value="add2", method = RequestMethod.POST)
    @ResponseBody
    Account add2(@RequestBody String accountName, @RequestBody String accountPwd) {

        System.out.println("Account parameter : " + accountName +"," + accountPwd);

        if (accountService.getAccountByName(accountName) != null) {
            return null;
        }

        Account acc = new Account(){};
        acc.setAccountId(null);
        acc.setAccountActive(1);
        acc.setAccountName(accountName);
        acc.setAccountPwd(accountPwd);

        accountService.insertAccount(acc);
        return accountService.getAccountByName(accountName);
    }

    //@CrossOrigin(origins = "http://localhost:8066", allowCredentials="true")
    @RequestMapping(value = "login", method = RequestMethod.GET)
    @ResponseBody
    Object verifyLogin(HttpSession session, HttpServletResponse response) {

        //response.setHeader("Access-Control-Allow-Credentials", "true");

        Object object = session.getAttribute("loginer");
        System.out.println(object);
        return object == null ? Arrays.asList("未登陆"): object;
    }

    //@CrossOrigin(origins = "http://localhost:8066", allowCredentials="true")
    @RequestMapping(value = "login", method = RequestMethod.POST)
    @ResponseBody
    List<String> login(HttpSession session,  @RequestBody Account account) {
        System.out.println("Account parameter : " + account.toString());

        Optional<Account> acc = Optional.of(accountService.getAccountByName(account.getAccountName()));
        if (acc.isPresent()) {
            session.setAttribute("loginer", acc.get());
            return Arrays.asList("登陆成功");
        }

        return Arrays.asList("登陆失败");
    }


}
