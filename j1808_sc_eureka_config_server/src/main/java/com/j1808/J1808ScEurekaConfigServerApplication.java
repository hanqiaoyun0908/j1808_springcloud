package com.j1808;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class J1808ScEurekaConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(J1808ScEurekaConfigServerApplication.class, args);
    }

}
