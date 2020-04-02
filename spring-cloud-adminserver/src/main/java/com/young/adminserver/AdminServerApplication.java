package com.young.adminserver;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Copyright © 2020 YOUNG. All rights reserved.
 *
 * @Package com.young.adminserver
 * @ClassName AdminServerApplication
 * @Description
 * @Author young
 * @Modify young
 * @Date 2020/3/1 20:02
 * @Version 1.0.0
 **/

@EnableAdminServer
@EnableDiscoveryClient
@SpringBootApplication
public class AdminServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdminServerApplication.class, args);
    }
}
