package com.hr.hrsystem.mapper;

import com.hr.hrsystem.entity.attend;
import org.apache.ibatis.annotations.Select;

public interface attendMapper {

    @Select("select * from attendancesheet where s_id = #{id}")
    attend show(Integer id);
}
