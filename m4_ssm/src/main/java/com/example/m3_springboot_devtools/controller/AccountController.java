package com.example.m3_springboot_devtools.controller;

import com.example.m3_springboot_devtools.bean.Account;
import com.example.m3_springboot_devtools.dao.AccountDao;
import com.example.m3_springboot_devtools.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    //前后端分离
    @Autowired
    AccountService accountService = null;
    @RequestMapping("/save")
    Account save(@RequestBody  Account account) {
        //AccountService acocuntService = new AccountServiceImpl();
        //Account account = new Account(1003L,"tony",33D);
        System.out.println(account);
        accountService.saveAccount(account);
        return account;
    }


}
