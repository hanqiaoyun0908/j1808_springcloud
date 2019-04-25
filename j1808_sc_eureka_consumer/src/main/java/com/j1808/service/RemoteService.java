package com.j1808.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="eureka-provider")   //设定需要远程访问的服务名
public interface RemoteService {
    @RequestMapping("/hello")          //标识需要远程服务提供的访问接口
    public String getInfo(@RequestParam("name") String name);          //请求所携带的参数
}
