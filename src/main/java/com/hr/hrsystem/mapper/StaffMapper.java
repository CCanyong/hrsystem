package com.hr.hrsystem.mapper;

import com.hr.hrsystem.entity.Staff;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 操作员工数据表
 */
@Mapper
public interface StaffMapper {

    @Insert("INSERT INTO staff(name,department,position,tel,joinDate) VALUES(#{name},#{department},#{position},#{tel},#{joinDate})")
    void addStaff(Staff staff);

    @Delete("DELETE FROM staff WHERE id = #{id}")
    void deleteStaff(int id);

    @Select("SELECT * FROM staff")
    List<Staff> getAllStaff();

    @Select("SELECT * FROM staff WHERE name = #{name}")
    Staff getStaffByName(String name);
}
