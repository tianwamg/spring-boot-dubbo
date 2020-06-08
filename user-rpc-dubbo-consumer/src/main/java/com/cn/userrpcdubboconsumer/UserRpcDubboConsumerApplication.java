package com.cn.userrpcdubboconsumer;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class UserRpcDubboConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserRpcDubboConsumerApplication.class, args);
    }

}
