package com.home.demo.controller;

import com.home.demo.annotation.MyUserParam;
import com.home.demo.vo.UserVO;
import com.mvc.annotation.RequestMapping;
import com.mvc.annotation.RequestParam;
import com.mvc.annotation.ResponseBody;
import com.mvc.http.RequestMethod;
import org.springframework.stereotype.Controller;

import java.util.Date;

/**
 * @author GTsung
 * @date 2021/10/18
 */
@Controller
@RequestMapping(path = "/user")
public class UserController {

    //http://localhost:7979/user/redirect
    @RequestMapping(path = "/redirect", method = RequestMethod.GET)
    public String redirect() {
        return "redirect:http://silently9527.cn";
    }

    //http://localhost:7979/user/get?userId=123
    @ResponseBody
    @RequestMapping(path = "/get", method = RequestMethod.GET)
    public UserVO get(@RequestParam(name = "userId") Long userId) {
        UserVO userVo = new UserVO();
        userVo.setName(userId + "_silently9527");
        userVo.setAge(25);
        userVo.setBirthday(new Date());
        return userVo;
    }

    //http://localhost:7979/user/build?user=silently9527,123
    @ResponseBody
    @RequestMapping(path = "/build", method = RequestMethod.GET)
    public UserVO build(@MyUserParam(name = "user") UserVO vo) {
        return vo;
    }

}
