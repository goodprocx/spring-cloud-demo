package com.procx.cloud.ribbon.consumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public String hello(){
        return "ribbon-consumer "+restTemplate.getForObject("http://ribbon-provider/hello",String.class);
    }
}
