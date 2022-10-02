package com.wjj.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
//@ResponseBody
//@Controller

@RestController
public class Helloword {

    @RequestMapping("/hello")
    public String hellowrd1(){
        return "Hello,Springboot,王俊杰";
    }
}
