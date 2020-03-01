package com.young.consumer.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable String name) {
        return "hello " + name + "，this is first message,I received !";
    }
}
