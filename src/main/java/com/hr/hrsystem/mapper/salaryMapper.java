package com.hr.hrsystem.mapper;

import com.hr.hrsystem.entity.salary;
import org.apache.ibatis.annotations.Select;

public interface salaryMapper {
    @Select("select * from salary where s_id = #{id}")
    salary show(Integer id);
}
