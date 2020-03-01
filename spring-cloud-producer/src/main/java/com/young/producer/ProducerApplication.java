package com.young.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Copyright © 2020 YOUNG. All rights reserved.
 *
 * @Package PACKAGE_NAME
 * @ClassName com.young.producer.ProducerApplication
 * @Description 服务生产者
 * @Author young
 * @Modify young
 * @Date 2020/2/29 23:16
 * @Version 1.0.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class ProducerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProducerApplication.class, args);
    }
}
