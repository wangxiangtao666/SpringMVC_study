package com.tao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;    
@Controller
public class LoginController {
    @PostMapping("/login")
    public String loginTest(@RequestParam("username") String name, Model model){
        //获取参数
        // 提交方式是post,不会再url路径中显示，请求参数和方法参数直接匹配，RestFul必须从路径中获取（应该是这样）
        System.out.println(name);
        model.addAttribute("msg",name);
        return "hello";
    }

}
