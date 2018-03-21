package com.yourcomany.demospringbootplugin.controller;

import com.yourcomany.demospringbootplugin.modle.Result;
import org.springframework.web.bind.annotation.*;

/**
 * Created by happyyangyuan at 2018/1/27
 * ad域登录
 */
@RestController
public class LoginController {

    @RequestMapping(path = "login", method = {RequestMethod.POST, RequestMethod.GET})
    public Result login(
            @RequestParam(required = true) String userName,
            @RequestParam(required = true) String pwd) {
        //todo 这里验证账号密码，并建立session
        return Result.success();
    }

    @PostMapping(path = "queryUser")
    public Result queryUser(String userName) {
        //todo 查询用户
        return Result.failure("用户不存在");
    }
}
