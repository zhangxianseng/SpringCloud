package com.spring.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: zzq
 * @Description:
 * @Date: 2018/11/19 15:47
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServer7002 {
    public static void main(String[] args){
        SpringApplication.run(EurekaServer7002.class,args);
    }
}
