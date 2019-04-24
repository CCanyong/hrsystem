package com.hr.hrsystem.controller;

import com.hr.hrsystem.Util.ResultUtil;
import com.hr.hrsystem.entity.Result;
import com.hr.hrsystem.entity.Staff;
import com.hr.hrsystem.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/staff")
@ResponseBody
public class ManageStaffInfoController {

    @Autowired
    StaffService staffService;

    @PostMapping("/add")
    public Result addStaff(@RequestBody Staff staff) {
        staffService.addStaff(staff);
        return ResultUtil.getSuccess();
    }

    @GetMapping("/delete/{name}")
    public Result delStaff(@PathVariable("name") String name) {
        staffService.deleteStaff(name);
        return ResultUtil.getSuccess();
    }

    @GetMapping("/get")
    public Result getAllStaff(){
        return ResultUtil.getSuccess(staffService.getAllStaff());
    }

    @GetMapping("/get/{name}")
    public Result getStaffByName(@PathVariable("name") String name){
        return ResultUtil.getSuccess(staffService.getStaffByName(name));
    }

}
