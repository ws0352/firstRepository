package com.zks.controller;

import com.zks.model.MyResult;
import com.zks.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.jws.soap.SOAPBinding;

/**
 * Created by 韦师兄
 * 2019-03-12 14:53
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @GetMapping("/login")
    @ResponseBody
    public MyResult login(@RequestBody User user){
        MyResult result = new MyResult();
        result.setCode(0);
        result.setMsg("登录成功！");
        return result;
    }
}
