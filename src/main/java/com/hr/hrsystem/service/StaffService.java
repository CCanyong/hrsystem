package com.hr.hrsystem.service;

import com.hr.hrsystem.entity.Staff;

import java.util.List;

public interface StaffService {

    void addStaff(Staff staff);

    void deleteStaff(int id);

    List<Staff> getAllStaff();

    Staff getStaffByName(String name);
}
