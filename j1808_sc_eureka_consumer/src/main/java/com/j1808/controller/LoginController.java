package com.j1808.controller;

import com.j1808.service.RemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
    @Autowired
    private RemoteService remoteService;
    @RequestMapping("/login")
    @ResponseBody
    public String login(@RequestParam("name") String name){
        String info = remoteService.getInfo(name);
        return info;
    }
}
