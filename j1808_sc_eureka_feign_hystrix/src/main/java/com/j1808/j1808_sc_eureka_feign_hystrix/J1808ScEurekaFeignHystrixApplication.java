package com.j1808.j1808_sc_eureka_feign_hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrix          //启动熔断器
public class J1808ScEurekaFeignHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(J1808ScEurekaFeignHystrixApplication.class, args);
    }

}
