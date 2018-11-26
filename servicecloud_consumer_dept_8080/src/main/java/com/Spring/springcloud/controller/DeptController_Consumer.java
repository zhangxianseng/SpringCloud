package com.Spring.springcloud.controller;

import com.spring.springcloud.entity.Depts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Author: zzq
 * @Description:
 * @Date: 2018/11/19 11:28
 */
@RestController
public class DeptController_Consumer {

    //private static final String REST_URL_PREFIX = "http://localhost:8001";
    private static final String REST_URL_PREFIX = "http://dept";//MICROSERIVCECLOUD-DEPT对外曝光微服务的 名称


    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value="/consumer/depts/add")
    public boolean add(Depts depts){
        return restTemplate.postForObject(REST_URL_PREFIX + "/depts/add",depts,Boolean.class);
    }

    @RequestMapping(value="/consumer/depts/get/{id}")
    public Depts add(@PathVariable("id") Integer id){
        return restTemplate.getForObject(REST_URL_PREFIX + "/depts/get/" + id,Depts.class);
    }

    @RequestMapping(value="/consumer/depts/list")
    public List<Depts> add(){
        return restTemplate.getForObject(REST_URL_PREFIX + "/depts/list",List.class);
    }

    @RequestMapping(value="/consumer/depts/discovery")
    public Object discovery(){
        return restTemplate.getForObject(REST_URL_PREFIX + "depts/discovery",Object.class);
    }
}
