package com.procx.cloud.feign.rpc;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "ribbon-provider")
public interface FeignInterface {

    @RequestMapping(value = "hello",method = RequestMethod.GET)
    String hello();
}