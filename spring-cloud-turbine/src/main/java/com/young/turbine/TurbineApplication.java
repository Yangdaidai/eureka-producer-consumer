package com.young.turbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * Copyright © 2020 YOUNG. All rights reserved.
 *
 * @Package com.young.turbine
 * @ClassName TurbineApplication
 * @Description
 * @Author young
 * @Modify young
 * @Date 2020/3/1 20:02
 * @Version 1.0.0
 **/
@EnableHystrixDashboard
@EnableTurbine
@SpringBootApplication
public class TurbineApplication {
    public static void main(String[] args) {
        SpringApplication.run(TurbineApplication.class, args);
    }
}
