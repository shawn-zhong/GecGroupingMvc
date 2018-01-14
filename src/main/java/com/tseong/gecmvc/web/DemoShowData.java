package com.tseong.gecmvc.web;

import com.tseong.gecmvc.model.Account;
import com.tseong.gecmvc.model.Person;
import com.tseong.gecmvc.service.IAccountService;
import com.tseong.gecmvc.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/Contacts")
public class DemoShowData {

    @Autowired
    private IPersonService personServiceImpl;

    @Autowired
    private IAccountService accountService;

    @RequestMapping(value = "/self/{id}", method = RequestMethod.GET)
    public String showData(@PathVariable("id") int userId, ModelMap model) {

        Person p = personServiceImpl.getPersonById(userId);

        model.addAttribute("personName", p.getpEname());
        model.addAttribute("mobile", p.getpMobile());

        return "data";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    @ResponseBody
    public Person showDataPost(@PathVariable("id") int userId, ModelMap model) {

        Person p = personServiceImpl.getPersonById(userId);

        model.addAttribute("personName", p.getpEname());
        model.addAttribute("mobile", p.getpMobile());

        return p;
    }


    //@CrossOrigin
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Person showData2(@PathVariable int id, ModelMap model) {


        Person p = personServiceImpl.getPersonById(id);
        model.addAttribute("personName", p.getpEname());
        model.addAttribute("mobile", p.getpMobile());

        return p;
    }

    @RequestMapping(value = "/account/{name}", method = RequestMethod.GET)
    @ResponseBody
    public Account getAccountByName(@PathVariable String name) {

        Account a = accountService.getAccountByName(name);
        return a;
    }

    @RequestMapping(value = "/accountid/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Account getAccountByName(@PathVariable int id) {

        Account a = accountService.getAccountById(id);
        return a;
    }

}
