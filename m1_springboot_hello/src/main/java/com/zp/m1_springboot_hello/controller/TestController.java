package com.zp.m1_springboot_hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/test01")
    public String test01(){
        System.out.println("你调用了我的Test01方法");
        return "success";
    }
}
