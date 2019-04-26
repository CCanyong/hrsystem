package com.hr.hrsystem.entity;

import java.util.Date;

/**
 * 员工实体类
 */
public class Staff {

    private int id;

    private String name;

    private String department;

    private String position;

    private String tel;

    private String date;

    private Date joinDate;

    public Staff(String name, String department, String position, String tel, Date joinDate) {
        this.name = name;
        this.department = department;
        this.position = position;
        this.tel = tel;
        this.joinDate = joinDate;
    }

    public Staff() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
