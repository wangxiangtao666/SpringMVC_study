package com.tao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class ForwardAndRedirectController {
    @RequestMapping("/re")
    public void testReqaAndResp(HttpServletRequest req, HttpServletResponse resp){
        HttpSession session =req.getSession();
        System.out.println(session.getId());
    }
    @RequestMapping("/for/f1")
    public String testF1(Model model){
        model.addAttribute("msg","zhuanfa1");
        //默认使用转发
        return "hello";//需要使用视图解析器
    }
    @RequestMapping("/for/f2")
    public String testF2(Model model){
        //转发
        model.addAttribute("msg","zhuanfa1");
        return "/WEB-INF/jsp/hello.jsp";//不能定义视图解析器，不然会再加前后缀
    }
    @RequestMapping("for/f3")
    public String testF3(Model model){
        //转发
        model.addAttribute("msg","zhuanfa1");
        return "forward:/WEB-INF/jsp/hello.jsp";//不能定义视图解析器，不然会再加前后缀
    }
    @RequestMapping("/redirect")
    public String testR1(){
        //重定向
        return "redirect:/index.jsp";//视图解析器定不定义不影响，框架会直接重定向

    }
}
