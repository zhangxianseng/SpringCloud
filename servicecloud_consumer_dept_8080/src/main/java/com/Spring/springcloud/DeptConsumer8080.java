package com.Spring.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: zzq
 * @Description:
 * @Date: 2018/11/19 14:27
 */
@SpringBootApplication
@EnableEurekaClient
public class DeptConsumer8080 {
    public static void main(String[] args){
        SpringApplication.run(DeptConsumer8080.class,args);
    }
}
