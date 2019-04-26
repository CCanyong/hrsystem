package com.hr.hrsystem.service;

import com.hr.hrsystem.entity.HR;

public interface HRService {

    HR getHr(String account);

    void addHr(HR hr);

    boolean isExist(String account);
}
