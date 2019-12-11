package com.springcloud;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Author: xieyongshan
 * @Date: 2019/8/27 14:42
 * @Description: todo
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
@EnableApolloConfig
@EnableSwagger2Doc
public class ZuulApp {

    public static void main(String[] args) {
        SpringApplication.run(ZuulApp.class,args);
    }

}
