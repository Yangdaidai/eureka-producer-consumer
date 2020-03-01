package com.young.consumer.service.serviceImpl;

import com.young.consumer.feignclient.HelloFeignClient;
import com.young.consumer.service.HelloService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Copyright © 2020 YOUNG. All rights reserved.
 *
 * @Package com.young.consumer.service.serviceImpl
 * @ClassName HelloServiceImpl
 * @Description
 * @Author young
 * @Modify young
 * @Date 2020/2/29 23:49
 * @Version 1.0.0
 **/
@Service
public class HelloServiceImpl implements HelloService {
    @Resource
    private HelloFeignClient helloFeignClient;

    @Override
    public String hello(String name) {
        return helloFeignClient.hello(name);
    }
}
