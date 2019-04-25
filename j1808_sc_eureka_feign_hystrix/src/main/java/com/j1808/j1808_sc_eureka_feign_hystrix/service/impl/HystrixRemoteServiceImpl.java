package com.j1808.j1808_sc_eureka_feign_hystrix.service.impl;

import com.j1808.j1808_sc_eureka_feign_hystrix.service.HystrixRemoteService;
import org.springframework.stereotype.Service;

@Service
public class HystrixRemoteServiceImpl implements HystrixRemoteService {
    @Override
    public String getInfo(String name) {
        return "welcome to fegin and hystrix word";
    }
}
