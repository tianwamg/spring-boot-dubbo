# spring-boot-dubbo
基于apache-dubbo构建微服务项目

## 项目说明
1. 注册中心分别采用zookeeper和nacos

## springboot版本
~~~
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>2.3.0.RELEASE</version>
    </parent>
~~~
## 依赖管理
~~~
    <dependencyManagement>
            <!-- Apache Dubbo  -->
            <dependency>
                <groupId>org.apache.dubbo</groupId>
                <artifactId>dubbo-dependencies-bom</artifactId>
                <version>2.7.7</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>

        </dependencies>
    </dependencyManagement>
~~~

## 项目结构
* dubbo-rpc-api
    - 统一api文档
* user-rpc-dubbo-provider(2)
    - 基于zookeeper注册中心的服务提供者
* user-rpc-dubbo-consumer
    - 基于zookeeper注册中心的服务消费者
* nacos-rpc-dubbo-provider
    - 基于nacos注册中心的服务提供者
* nacos-rpx-dubbo-consumer
    - 基于nacos注册中心的服务消费者
    
## 项目启动
* zookeeper注册中心
    - 首先启动zookeeper注册中心 ./zkServer.sh start
    - 启动服务提供者provider
    - 启动消费者
* nacos注册中心
    - 启动参考[地址](https://github.com/tianwamg/spring-cloud-alibaba)
    - 其余步骤同上
### 参考地址
* https://dubbo.apache.org/zh-cn/
* https://github.com/apache/dubbo
* https://dubbo.apache.org/zh-cn/docs/user/quick-start.html