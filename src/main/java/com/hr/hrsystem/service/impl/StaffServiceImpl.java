package com.hr.hrsystem.service.impl;

import com.hr.hrsystem.entity.Staff;
import com.hr.hrsystem.mapper.StaffMapper;
import com.hr.hrsystem.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * 处理与员工有关的业务
 */
@Service
public class StaffServiceImpl implements StaffService {

    @Autowired
    StaffMapper staffMapper;

    /**
     * 添加新员工
     *
     * @param staff 员工信息
     */
    @Override
    public void addStaff(Staff staff) {

        if (staff.getDate() != null) {
            staff.setJoinDate(new Date(staff.getDate()));
        }
        staffMapper.addStaff(staff);
    }

    @Override
    public void deleteStaff(String name) {
        staffMapper.deleteStaff(name);
    }

    @Override
    public List<Staff> getAllStaff() {
        return staffMapper.getAllStaff();
    }

    @Override
    public Staff getStaffByName(String name) {
        return staffMapper.getStaffByName(name);
    }
}
