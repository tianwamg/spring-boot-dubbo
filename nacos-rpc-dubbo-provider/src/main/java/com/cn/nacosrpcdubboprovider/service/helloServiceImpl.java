package com.cn.nacosrpcdubboprovider.service;

import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;
import userservice.IUserService;

@DubboService
public class helloServiceImpl implements IUserService {
    @Override
    public String getName(Integer id) {
        return "nacos hello";
    }
}
