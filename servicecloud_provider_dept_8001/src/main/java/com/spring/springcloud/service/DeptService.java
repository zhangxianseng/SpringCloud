package com.spring.springcloud.service;

import com.spring.springcloud.entity.Depts;

import java.util.List;

/**
 * @Author: zzq
 * @Description:
 * @Date: 2018/11/16 15:18
 */
public interface DeptService {
    /**
     * 在这里为什么不和dao层的方法名相同,
     * 因为在写Controller层这些方法名更加符合Rest的风格
     */
    //新增
    public boolean add(Depts depts);
    //查询一个
    public Depts get(Integer id);
    //查询全部
    public List<Depts> list();

}
