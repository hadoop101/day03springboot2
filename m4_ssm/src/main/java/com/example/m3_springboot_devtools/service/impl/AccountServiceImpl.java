package com.example.m3_springboot_devtools.service.impl;

import com.example.m3_springboot_devtools.bean.Account;
import com.example.m3_springboot_devtools.dao.AccountDao;
import com.example.m3_springboot_devtools.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountDao accountDao;

    @Override
    public void saveAccount(Account account) {
        System.out.println("保存："+account);
        accountDao.save(account);
    }
}
