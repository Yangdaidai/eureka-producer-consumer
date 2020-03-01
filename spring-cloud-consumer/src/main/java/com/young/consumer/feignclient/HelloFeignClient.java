package com.young.consumer.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Copyright © 2020 YOUNG. All rights reserved.
 *
 * @Package com.young.consumer.feignclient
 * @ClassName HelloFeignClient
 * @Description
 * @Author young
 * @Modify young
 * @Date 2020/2/29 23:51
 * @Version 1.0.0
 **/
@FeignClient(name = "spring-cloud-producer")
public interface HelloFeignClient {
    @RequestMapping(value = "/hello")
    String hello(@RequestParam(value = "name") String name);
}
