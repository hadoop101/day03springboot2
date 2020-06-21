package com.example.m3_springboot_devtools.service.impl;

import com.example.m3_springboot_devtools.bean.Account;
import com.example.m3_springboot_devtools.service.AccountService;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
    @Override
    public void saveAccount(Account account) {
        System.out.println("保存："+account);
    }
}
