package com.atguigu.boot.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@ResponseBody
//@Controller

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String handle01(){
        return "Hello,Spring Boot 2!"+"你好";
    }
}
