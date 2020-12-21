package com.wx.service1.Controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Value("${server.port}")
    private String port;

    @HystrixCommand(fallbackMethod = "callback")
    @RequestMapping("/hello")
    public String hello(){
        try{
            Thread.sleep(5000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }

//        return "success!";
        return "hello  port:"+port;
    }

    String callback(){
        return "服务器繁忙！";
    }
}
