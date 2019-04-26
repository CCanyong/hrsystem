package com.hr.hrsystem.entity;

import java.util.Date;

public class attend {

    private Integer id;
    private Date worktimes;
    private Integer leave;
    private Integer overtime;


    public Date getWorktimes() {
        return worktimes;
    }

    public void setWorktimes(Date worktimes) {
        this.worktimes = worktimes;
    }

    public Integer getLeave() {
        return leave;
    }

    public void setLeave(Integer leave) {
        this.leave = leave;
    }

    public Integer getOvertime() {
        return overtime;
    }

    public void setOvertime(Integer overtime) {
        this.overtime = overtime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
