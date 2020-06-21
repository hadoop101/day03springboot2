package com.example.m3_springboot_devtools;

import com.example.m3_springboot_devtools.bean.Account;
import com.example.m3_springboot_devtools.dao.AccountDao;
import com.example.m3_springboot_devtools.service.AccountService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class M3SpringbootDevtoolsApplicationTests {

    @Autowired
    AccountService accountService = null;
    @Test
    void test01Service() {
        //AccountService acocuntService = new AccountServiceImpl();
        Account account = new Account(1003L,"tony",33D);
        accountService.saveAccount(account);

    }
    @Autowired
    AccountDao accountDao = null;
    @Test
    void test02Dao() {
        //AccountService acocuntService = new AccountServiceImpl();
        Account account = new Account(1002L,"rose",33D);
        accountDao.save(account);

    }

}
