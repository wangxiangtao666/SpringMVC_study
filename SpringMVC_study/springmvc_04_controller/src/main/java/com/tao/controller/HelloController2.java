package com.tao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller//注册为组件，这个类被spring接管
//用这个注解的类中的所有方法，如果返回值是String类型，并且有具体的页面可以跳转，会被视图解析器解析
public class HelloController2 {
    @RequestMapping("h2")
    public String test(Model model){
        model.addAttribute("msg","hello2");
        return "hello";
    }
}
