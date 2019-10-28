package com.procx.cloud.feign.controller;

import com.procx.cloud.feign.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping("hello")
    public String hello(){
        return helloService.hello();
    }

    @GetMapping("hello1")
    public String hello1(){
        return helloService.hello1();
    }
}
