package com.tao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/H")
public class HelloController {
    @RequestMapping("/h1")
    public String hello(Model model){
        //调用业务层
        //向模型中添加数据，可以在jsp页面中取出并渲染
        //封装数据
        model.addAttribute("msg","Hello,SpringMVCAnnotation!");
        return "hello";//会被视图解析器处理
    }
}
