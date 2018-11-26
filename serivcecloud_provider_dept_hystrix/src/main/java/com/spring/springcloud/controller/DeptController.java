package com.spring.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.spring.springcloud.entity.Depts;
import com.spring.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zzq
 * @Description:
 * @Date: 2018/11/16 15:35
 */
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @RequestMapping(value="/depts/get/{id}",method = RequestMethod.GET)
    //一旦调用服务方法失败并抛出了错误信息后，会自动调用@HystrixCommand标注好的f allbackMethod调用类中的指定方法
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    public Depts get(@PathVariable("id") Integer id){
        Depts dept = deptService.get(id);
        if (null == dept) {
            throw new RuntimeException("该ID：" + id + "没有没有对应的信息");
        }
        return dept;
    }

    public Depts processHystrix_Get(@PathVariable("id") Integer id){
        Depts depts = new Depts();
        depts.setDid(id);
        depts.setName("该id：" + id + "没有没有对 应的信息,null--@HystrixCommand");
        depts.setDb_source("no this database in MySQL");
        return depts;
    }
}
