package com.spring.springcloud.service.impl;

import com.spring.springcloud.dao.DeptDao;
import com.spring.springcloud.entity.Depts;
import com.spring.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: zzq
 * @Description:
 * @Date: 2018/11/16 15:23
 */
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao detdao;
    @Override
    public boolean add(Depts depts) {
        return detdao.addDept();
    }

    @Override
    public Depts get(Integer id) {
        return detdao.findById(id);
    }

    @Override
    public List<Depts> list() {
        return detdao.findAll();
    }
}
