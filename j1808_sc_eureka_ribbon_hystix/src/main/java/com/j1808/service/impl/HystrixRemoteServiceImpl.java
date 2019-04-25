package com.j1808.service.impl;

import com.j1808.service.HystrixRemoteService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HystrixRemoteServiceImpl implements HystrixRemoteService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hystrixError")
    @Override
    public String fatchInfo(String name) {
        String forObject = restTemplate.getForObject("http://eureka-provider/hello?name=" + name, String.class);
        return forObject;
    }



    private String hystrixError(String name){
        return name+"welcome to ribbon hystix word!!";
    }
}
