package com.example.m3_springboot_devtools.dao;

import com.example.m3_springboot_devtools.bean.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountDao  extends JpaRepository<Account,Long>{

}
