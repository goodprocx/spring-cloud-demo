package com.procx.cloud.hystrix.controller;

import com.procx.cloud.hystrix.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping("feign")
    public String hello1(){
        return "hystrix "+helloService.hello1();
    }
}
