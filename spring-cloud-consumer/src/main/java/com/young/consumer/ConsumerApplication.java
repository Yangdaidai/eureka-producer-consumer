package com.young.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Copyright © 2020 YOUNG. All rights reserved.
 *
 * @Package PACKAGE_NAME
 * @ClassName com.young.producer.ProducerApplication
 * @Description 服务消费者
 * @Author young
 * @Modify young
 * @Date 2020/2/29 23:16
 * @Version 1.0.0
 **/
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }
}
