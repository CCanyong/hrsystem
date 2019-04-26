package com.hr.hrsystem.service.impl;

import com.hr.hrsystem.entity.attend;
import com.hr.hrsystem.mapper.attendMapper;
import com.hr.hrsystem.service.attendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public  class attendServiceimpl implements attendService {

    @Autowired
    attendMapper attendMapper;
    @Override
    public attend show(Integer id) {
        return attendMapper.show(id);
    }
}
