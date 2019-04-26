package com.hr.hrsystem.entity;

public class salary {

    private Integer id;

    private double base;

    private double overtime;

    private double baoxiao;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getOvertime() {
        return overtime;
    }

    public void setOvertime(double overtime) {
        this.overtime = overtime;
    }

    public double getBaoxiao() {
        return baoxiao;
    }

    public void setBaoxiao(double baoxiao) {
        this.baoxiao = baoxiao;
    }

    public salary() {
    }
}
