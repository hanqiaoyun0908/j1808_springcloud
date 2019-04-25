package com.j1808;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient     //标识此服务为消费者
@EnableFeignClients            //以feign实现调用的负载均衡
public class J1808ScEurekaConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(J1808ScEurekaConsumerApplication.class, args);
    }

}
