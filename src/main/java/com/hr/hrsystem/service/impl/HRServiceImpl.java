package com.hr.hrsystem.service.impl;

import com.hr.hrsystem.entity.HR;
import com.hr.hrsystem.mapper.HrMapper;
import com.hr.hrsystem.service.HRService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 处理与员工有关的业务
 */
@Service
public class HRServiceImpl implements HRService {
    @Autowired
    HrMapper hrMapper;

    @Override
    public boolean checkLogin(HR hr) {
        return !(hrMapper.getHrNum(hr) == 0);
    }

    @Override
    public HR getHr(String account) {
        return hrMapper.getHr(account);
    }
}
