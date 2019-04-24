package com.hr.hrsystem;

import com.hr.hrsystem.entity.Staff;
import com.hr.hrsystem.mapper.StaffMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HrsystemApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Autowired
    StaffMapper staffMapper;

    @Test
    public void testAddStaff() {
        Staff staff = new Staff("ccy","hr","主管","15521145094",new Date());
        staffMapper.addStaff(staff);
    }
}
