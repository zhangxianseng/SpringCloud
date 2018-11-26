package com.spring.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Author: zzq
 * @Description:
 * @Date: 2018/11/23 11:02
 */
@SpringBootApplication
@EnableZuulProxy
public class Zuul_9527 {
    public static void main(String[] args){
        SpringApplication.run(Zuul_9527.class,args);
    }
}
