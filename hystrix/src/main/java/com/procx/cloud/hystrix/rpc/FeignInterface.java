package com.procx.cloud.hystrix.rpc;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "ribbon-provider",fallback = FeignFallback.class)
public interface FeignInterface {

    @RequestMapping(value = "hello",method = RequestMethod.GET)
    String hello();
}
