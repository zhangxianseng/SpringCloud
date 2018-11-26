package com.Spring.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author: zzq
 * @Description:
 * @Date: 2018/11/19 14:27
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages={"com.spring.springcloud"})
@ComponentScan("com.spring.springcloud")
public class DeptConsumer_feign {
    public static void main(String[] args){
        SpringApplication.run(DeptConsumer_feign.class,args);
    }
}
