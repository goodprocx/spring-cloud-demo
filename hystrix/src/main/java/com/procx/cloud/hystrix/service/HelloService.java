package com.procx.cloud.hystrix.service;

import com.procx.cloud.hystrix.rpc.FeignInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    @Autowired
    FeignInterface feign;

    public String hello1(){
        return feign.hello();
    }
}
