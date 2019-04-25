package com.j1808.j1808_sc_eureka_feign_hystrix.controller;

import com.j1808.j1808_sc_eureka_feign_hystrix.service.HystrixRemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HystrixController {
    @Autowired
    private HystrixRemoteService hystrixRemoteService;
    @RequestMapping("/login")
    public String login(@RequestParam("name")String name){
        String info = hystrixRemoteService.getInfo(name+"07");
        return info;
    }
}
