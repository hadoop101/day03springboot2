package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyTestController {

    @RequestMapping("/mytest01")
    public String mytest01(){
        System.out.println("你调用了我的mytest01");
        return "成功";
    }
}
