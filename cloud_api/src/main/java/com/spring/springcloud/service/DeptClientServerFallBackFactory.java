package com.spring.springcloud.service;

import com.spring.springcloud.entity.Depts;
import org.springframework.stereotype.Component;
import feign.hystrix.FallbackFactory;

import java.util.List;

/**
 * @Author: zzq
 * @Description:
 * @Date: 2018/11/22 17:16
 */
@Component
public class DeptClientServerFallBackFactory implements FallbackFactory<DeptClientSerivce> {
    @Override
    public DeptClientSerivce create(Throwable throwable) {
        return new DeptClientSerivce(){
            @Override
            public boolean add(Depts dept) throws Exception {
                return false;
            }

            @Override
            public Depts get(Integer id) throws Exception {
                long longValue = id.longValue();
                return new  Depts().setDid(longValue).setName("11111当前id:"+id+"没有对应的信息,null- @HystrixCommand").setDb_source("NO  this  dbSource in  mysql");
            }

            @Override
            public List<Depts> list() throws Exception {
                return null;
            }
        };
    }
}
