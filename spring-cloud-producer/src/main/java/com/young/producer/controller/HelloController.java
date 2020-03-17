package com.young.producer.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
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
@Slf4j
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(@RequestParam String name) {
        log.info("request two name is "+name);
//        try{
//            Thread.sleep(1000000);
//        }catch ( Exception e){
//            log.error(" hello two error",e);
//        }
        return "hello " + name + "，this is first message";
    }
}
