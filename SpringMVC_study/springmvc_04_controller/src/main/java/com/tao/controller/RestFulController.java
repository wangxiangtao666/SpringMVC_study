package com.tao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RestFulController {
    //@RequestMapping("/add/{a}/{b}")
    //@RequestMapping(value="/add/{a}/{b}",method= RequestMethod.GET)
    @GetMapping(value={"/add/{a}/{b}","add2/{a}/{b}"})//对应上面的简单写法
    public String index1(@PathVariable int a, @PathVariable int b, Model model){
        int result = a+b;
        model.addAttribute("msg","结果1："+result);
        return "hello";
    }
    @PostMapping("/add/{a}/{b}")
    public String index2(@PathVariable int a, @PathVariable int b, Model model){
        int result = a+b;
        model.addAttribute("msg","结果2："+result);
        return "hello";
    }

}
