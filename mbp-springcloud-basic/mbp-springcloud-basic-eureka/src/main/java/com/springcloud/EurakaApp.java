package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: xieyongshan
 * @Date: 2019/8/22 10:49
 * @Description: todo
 */
@SpringBootApplication
@EnableEurekaServer
public class EurakaApp {
    public static void main(String[] args) {
        SpringApplication.run(EurakaApp.class,args);
    }

}
