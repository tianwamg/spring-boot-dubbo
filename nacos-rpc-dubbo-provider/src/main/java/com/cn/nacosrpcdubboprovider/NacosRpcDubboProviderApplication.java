package com.cn.nacosrpcdubboprovider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class NacosRpcDubboProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosRpcDubboProviderApplication.class, args);
    }

}
