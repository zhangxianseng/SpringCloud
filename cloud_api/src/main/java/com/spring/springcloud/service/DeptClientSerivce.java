package com.spring.springcloud.service;

import com.spring.springcloud.entity.Depts;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @Author: zzq
 * @Description:
 * @Date: 2018/11/22 10:28
 */
@FeignClient(value = "dept",fallbackFactory=DeptClientServerFallBackFactory.class)
public interface DeptClientSerivce {

    @RequestMapping(value = "/depts/add", method = RequestMethod.POST)
    public boolean add(Depts dept) throws Exception;

    @RequestMapping(value = "/depts/get/{id}", method = RequestMethod.GET)
    public Depts get(@PathVariable("id") Integer id) throws Exception;

    @RequestMapping(value = "/depts/list", method = RequestMethod.GET)
    public List<Depts> list() throws Exception;
}
