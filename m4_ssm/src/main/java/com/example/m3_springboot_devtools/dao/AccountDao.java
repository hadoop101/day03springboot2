package com.example.m3_springboot_devtools.dao;

import com.example.m3_springboot_devtools.bean.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper //使用当前接口生成代理对象
public interface AccountDao  {
    //使用增删改查注解
    @Insert("insert into account_ values(#{id},#{account},#{money})")
    void save(Account account);
}
