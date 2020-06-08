package com.cn.userrpcdubboconsumer.controller;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import userservice.IUserService;

@RestController
public class userController {

    @DubboReference
    IUserService iUserService;

    @GetMapping("/test")
    public String test(){
        String s=iUserService.getName(1);
        return s;
    }
}
