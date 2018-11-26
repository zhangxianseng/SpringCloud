package com.spring.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: zzq
 * @Description:
 * @Date: 2018/11/16 15:55
 */
//本服务启动后好自动进行注册到Eureka服务中
@EnableEurekaClient
//服务发现
@EnableDiscoveryClient
@SpringBootApplication
public class DeptProvider8001 {
    public static void main(String[] args){
        SpringApplication.run(DeptProvider8001.class,args);
    }
}
