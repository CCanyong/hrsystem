package com.hr.hrsystem.mapper;

import com.hr.hrsystem.entity.HR;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface HrMapper {

    @Select("SELECT COUNT(*) FROM hr WHERE account=#{account} AND password=#{password}")
    Integer getHrNum(HR hr);

    @Select("SELECT * FROM hr WHERE account = #{account}")
    HR getHr(String account);
}
