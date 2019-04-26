package com.hr.hrsystem.service.impl;

import com.hr.hrsystem.entity.salary;
import com.hr.hrsystem.mapper.salaryMapper;
import com.hr.hrsystem.service.salaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class salaryServiceimpl implements salaryService {
    @Autowired
    salaryMapper salaryMapper;


    @Override
    public salary show(Integer id) {
        return  salaryMapper.show(id);
    }
}
