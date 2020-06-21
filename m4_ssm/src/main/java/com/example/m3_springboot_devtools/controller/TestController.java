package com.example.m3_springboot_devtools.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/test01")
    public String test01(){
        System.out.println("你调用了我的Test01方法");
        return "success";
    }
    @RequestMapping("/test02")
    public String test02(){
        System.out.println("你调用了我的Test02方法");
        return "success";
    }
}
