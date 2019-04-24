package com.hr.hrsystem.service;

import com.hr.hrsystem.entity.HR;

public interface HRService {

    boolean checkLogin(HR hr);

    HR getHr(String account);
}
