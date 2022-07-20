package com.atguigu.boot;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class worldController {

    @RequestMapping("/w")
    public String world66(){
        return "world";
    }
}
