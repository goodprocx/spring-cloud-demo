package com.procx.cloud.ribbon.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String hello(){
        return "hello,ribbon";
    }
}
