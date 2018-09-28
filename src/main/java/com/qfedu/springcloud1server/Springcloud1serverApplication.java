package com.qfedu.springcloud1server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //标记这是一个注册中心
public class Springcloud1serverApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springcloud1serverApplication.class, args);
    }
}
