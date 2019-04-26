package com.hr.hrsystem.controller;


import com.hr.hrsystem.Util.ResultUtil;
import com.hr.hrsystem.entity.Result;
import com.hr.hrsystem.service.salaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/salary")
@ResponseBody
public class salaryController {
    @Autowired
    salaryService salaryService;

    @GetMapping("/get/{id}")
    public Result show(@PathVariable("id") Integer id) {
        salaryService.show(id);
        return ResultUtil.getSuccess();
    }

}
