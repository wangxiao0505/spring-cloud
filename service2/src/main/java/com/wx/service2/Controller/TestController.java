package com.wx.service2.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private Service1FeignClient service1FeignClient;
    public String call(){
        String result = service1FeignClient.hello();
        return "b to a 访问结果--"+result;
    }
}
