package com.cn.nacosrpcdubboconsumer.controller;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import userservice.IUserService;

@RestController
@RequestMapping("/hello")
public class helloController {

    @DubboReference
    IUserService iUserService;

    @GetMapping("/t")
    public String test(){
        String s= iUserService.getName(1);
        return s;
    }
}
