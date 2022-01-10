package com.tao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

// @Controller
// @RequestMapping("/H")
// public class HelloController3 {
//     @RequestMapping("/h1")
//     public String test1(Model model){
//         model.addAttribute("msg","hello31");
//         return "hello";
//     }
//     @RequestMapping("/h2")
//     public String test2(Model model){
//         model.addAttribute("msg","hello32");
//         return "hello";
//     }
// }
@Controller
public class HelloController3 {
    @RequestMapping("/H/h1")
    public String test1(Model model){
        model.addAttribute("msg","hello31");
        return "hello";
    }
    @RequestMapping("/H/h2")
    public String test2(Model model){
        model.addAttribute("msg","hello32");
        return "hello";
    }
}