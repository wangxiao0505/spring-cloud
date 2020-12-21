package com.wx.service2.Controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("SERVICE-OBJCAT-1")
public interface Service1FeignClient {
    @RequestMapping("/hello")
    public String hello();
}
