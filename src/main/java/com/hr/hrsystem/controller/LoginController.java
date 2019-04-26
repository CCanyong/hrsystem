package com.hr.hrsystem.controller;

import com.hr.hrsystem.Util.ResultUtil;
import com.hr.hrsystem.entity.HR;
import com.hr.hrsystem.entity.Result;
import com.hr.hrsystem.service.HRService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class LoginController {

    @Autowired
    HRService hrService;

    @PostMapping("/login")
    public Result login(@RequestBody Map<String, String> map) {
        String account = map.get("account");
        String password = map.get("password");
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(account, password);
        try {
            SecurityUtils.getSubject().login(usernamePasswordToken);
        } catch (UnknownAccountException e) {
            return ResultUtil.getFailed();
        } catch (AuthenticationException e) {
            return ResultUtil.getFailed();
        }
        return ResultUtil.getSuccess();
    }

    @PostMapping("/register")
    public Result register(@RequestBody HR hr) {
        if (hrService.isExist(hr.getAccount()))
            return ResultUtil.getFailed(2);
        hrService.addHr(hr);
        return ResultUtil.getSuccess();
    }

    @GetMapping("/logout")
    public Result logout() {
        SecurityUtils.getSubject().logout();
        return ResultUtil.getSuccess();
    }

    @GetMapping("/get/now")
    public Result getUser() {
        HR hr = (HR) SecurityUtils.getSubject().getPrincipal();
        return ResultUtil.getSuccess(hr.getName());
    }
}
