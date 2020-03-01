package com.young.consumer.hystrix;

import com.young.consumer.feignclient.HelloFeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Copyright © 2020 YOUNG. All rights reserved.
 *
 * @Package com.young.consumer.hystrix
 * @ClassName HelloFeignHystrix
 * @Description
 * @Author young
 * @Modify young
 * @Date 2020/3/1 15:01
 * @Version 1.0.0
 **/
@Component
public class HelloFeignHystrix implements HelloFeignClient {
    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "hello " + name + ", this message send failed ";
    }
}
