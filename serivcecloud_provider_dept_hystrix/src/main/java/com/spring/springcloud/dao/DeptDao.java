package com.spring.springcloud.dao;

import com.spring.springcloud.entity.Depts;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: zzq
 * @Description:
 * @Date: 2018/11/16 15:00
 */
@Mapper
public interface DeptDao {
    //添加
    public boolean addDept();
    //查询单个
    public Depts findById(Integer id);
    //查询全部
    public List<Depts> findAll();
}
