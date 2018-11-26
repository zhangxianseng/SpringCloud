package com.Spring.springcloud.cfgbears;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: zzq
 * @Description:
 * @Date: 2018/11/19 10:59
 */
@Configuration
public class ConfigBean {
    @Bean
    @LoadBalanced//客户在访问的时候只带负载均衡
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @Bean
    public IRule myIRule() {
        //return new RetryRule();
        return new RandomRule();
    }
}
