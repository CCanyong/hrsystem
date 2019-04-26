package com.hr.hrsystem.mapper;

import com.hr.hrsystem.entity.HR;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface HrMapper {

    @Select("SELECT COUNT(*) FROM hr WHERE account=#{account}")
    Integer getHrNum(String account);

    @Select("SELECT * FROM hr WHERE account = #{account}")
    HR getHr(String account);

    @Insert("INSERT INTO hr(name,account,password) VALUES(#{name},#{account},#{password})")
    void addHr(HR hr);
}
