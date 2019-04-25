package com.j1808.controller;

import com.j1808.service.HystrixRemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @Autowired
    private HystrixRemoteService hystrixRemoteService;
    @RequestMapping("/login")
    public String index(@RequestParam("name")String name){
        String s = hystrixRemoteService.fatchInfo(name);
        return s;
    }
}
