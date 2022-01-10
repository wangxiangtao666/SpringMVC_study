package com.tao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/main")
    public String main(){
        return "main";
    }
    @RequestMapping("/goLogin")
    public String goLogin(){
        return "login";
    }
    @RequestMapping("/login")
    public String login(HttpServletRequest request,String username, String password){
        request.getSession().setAttribute("username",username);
        return "main";

    }
    @RequestMapping("/logout")
    public String logout(HttpServletRequest request){
        request.getSession().removeAttribute("username");
        return "login";
    }

}
