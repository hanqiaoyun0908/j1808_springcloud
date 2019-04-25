package com.j1808.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {
    @Value("${hello}")
    String helloStr;
    @RequestMapping("/hello")
    public String readInfoFromGit(){
        return "hello:"+helloStr;
    }
}
