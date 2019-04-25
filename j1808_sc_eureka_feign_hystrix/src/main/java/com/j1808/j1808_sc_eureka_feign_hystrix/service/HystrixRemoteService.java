package com.j1808.j1808_sc_eureka_feign_hystrix.service;

import com.j1808.j1808_sc_eureka_feign_hystrix.service.impl.HystrixRemoteServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="eureka-provider",fallback = HystrixRemoteServiceImpl.class)   //当远程服务调用失败时实现
public interface HystrixRemoteService {
    @RequestMapping("/hello")
    public String getInfo(@RequestParam("name") String name);
}
