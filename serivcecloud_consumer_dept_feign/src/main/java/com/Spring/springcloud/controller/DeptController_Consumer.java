package com.Spring.springcloud.controller;

import com.spring.springcloud.entity.Depts;
import com.spring.springcloud.service.DeptClientSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: zzq
 * @Description:
 * @Date: 2018/11/19 11:28
 */
@RestController
public class DeptController_Consumer {

    @Autowired
    private DeptClientSerivce service;


    @RequestMapping(value="/consumer/depts/add")
    public boolean add(Depts depts)throws Exception{
        return service.add(depts);
    }

    @RequestMapping(value="/consumer/depts/get/{id}")
    public Depts get(@PathVariable("id") Integer id)throws Exception{
        return service.get(id);
    }

    @RequestMapping(value="/consumer/depts/list")
    public List<Depts> list() throws Exception{
        return service.list();
    }

}
