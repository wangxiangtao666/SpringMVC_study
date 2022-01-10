package com.tao.controller;

import com.tao.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class GetParameterController {
    @GetMapping("/t1")
    public String test1(String name, Model model){
        //localhost:8080/user/t1?name=taotao
        //接收前端数据,通过匹配url中参数名和函数中参数名，必须相同
        System.out.println("接收的参数为："+name);
        //将数据显示到前端
        model.addAttribute("msg",name);
        //视图跳转
        return "hello";
    }
    @GetMapping("/t2")
    public String test2(@RequestParam("username") String name, Model model){
        //localhost:8080/user/t1?username=taotao
        //接收前端数据,通过匹配url中参数名和函数中另定义的参数名，所以url参数名和实际参数名可以不相同
        System.out.println("接收的参数为："+name);
        //将数据显示到前端
        model.addAttribute("msg",name);
        //视图跳转
        return "hello";
    }

    /**
     * 1.接收用户传递的参数，判断参数的名字是否在方法上，是直接赋值
     * 2.接收的参数是一个对象，匹配对象中的属性和参数名
     */

    @GetMapping("/t3")
    public String test3(User user, Model model){
        //localhost:8080/user/t1?name=taotao&id=1
        //接收前端数据,url参数名对应一个对象的属性，可以直接定义一个对象接收
        System.out.println("接收的参数为："+user);
        //将数据显示到前端
        model.addAttribute("msg","user");
        //视图跳转
        return "hello";
    }
}
