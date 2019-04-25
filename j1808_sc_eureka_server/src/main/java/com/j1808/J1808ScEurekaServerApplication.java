package com.j1808;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer   //标志此服务为注册中心
public class J1808ScEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(J1808ScEurekaServerApplication.class, args);
    }

}
