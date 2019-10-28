package com.procx.cloud.feign.service;

import com.procx.cloud.feign.rpc.FeignInterface;
import com.procx.cloud.feign.rpc.HelloInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    @Autowired
    HelloInterface helloInterface;

    @Autowired
    FeignInterface feign;
    public String hello(){
        return "feign invoke "+helloInterface.hello();
    }

    public String hello1(){
        return "feign invoke1 "+feign.hello();
    }
}
