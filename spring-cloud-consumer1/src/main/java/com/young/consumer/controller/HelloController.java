package com.young.consumer.controller;

import com.young.consumer.service.HelloService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Copyright © 2020 YOUNG. All rights reserved.
 *
 * @Package com.young.producer.controller
 * @ClassName HelloController
 * @Description
 * @Author young
 * @Modify young
 * @Date 2020/2/29 23:27
 * @Version 1.0.0
 **/
@RestController
public class HelloController {
    @Resource
    private HelloService helloService;
    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable String name) {
        return helloService.hello(name);
    }
}
