package com.tao.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class TestController {
    @RequestMapping("/a1")
    public String test(){
        System.out.println("执行了");
        return "ok";
    }

}
