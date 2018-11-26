package com.spring.springcloud.controller;

import com.spring.springcloud.entity.Depts;
import com.spring.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: zzq
 * @Description:
 * @Date: 2018/11/16 15:35
 */
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/depts/discovery",method = RequestMethod.GET)
    public Object discovery(){
        //进行盘点Eureka有多少个微服务，后续工作有很多个，如订单
        List<String> services = client.getServices();
        System.out.println("------ " + services);
        //就在这个盘点Eureka的微服务中取寻找MICROSESPRINGCLOUD-DEPT
        List<ServiceInstance> instances = client.getInstances("MICROSESPRINGCLOUD-DEPT");

        for (ServiceInstance serviceInstance : instances) {
            System.out.println("微服务的ID:" + serviceInstance.getServiceId());
            System.out.println("主机名称:" + serviceInstance.getHost());
            System.out.println("端口:" + serviceInstance.getPort());
            System.out.println("地址:" + serviceInstance.getUri());
        }

        return this.client;
    }

    @RequestMapping(value = "/depts/add",method = RequestMethod.POST)
    public boolean add(@RequestBody Depts depts){
        return deptService.add(depts);
    }

    @RequestMapping(value = ("/depts/get/{id}"),method = RequestMethod.GET)
    public Depts get(@PathVariable("id") Integer id){
        return deptService.get(id);
    }

    //查询所有
    @RequestMapping(value = "/depts/list", method = RequestMethod.GET)
    public List<Depts> list() throws Exception {
        return deptService.list();
    }
}
