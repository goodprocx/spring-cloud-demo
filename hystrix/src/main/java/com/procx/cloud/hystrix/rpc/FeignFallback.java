package com.procx.cloud.hystrix.rpc;

import org.springframework.stereotype.Component;

@Component
public class FeignFallback implements FeignInterface{
    @Override
    public String hello() {
        return "执行降级函数";
    }
}
