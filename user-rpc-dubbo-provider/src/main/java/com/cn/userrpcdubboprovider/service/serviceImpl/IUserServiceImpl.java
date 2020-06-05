package com.cn.userrpcdubboprovider.service.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.cn.userrpcdubboprovider.service.IUserService;

@Service(interfaceClass = IUserService.class)
public class IUserServiceImpl implements IUserService {
    @Override
    public String getName(Integer id) {
        return "dubbo";
    }
}
