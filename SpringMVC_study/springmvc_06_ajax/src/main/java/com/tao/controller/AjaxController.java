package com.tao.controller;

import com.tao.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController//其中的返回值，不会通过视图解析器解析
public class AjaxController {
    @RequestMapping("/a1")
    public String aaa(String name, HttpServletResponse response) throws IOException {
        System.out.println("a1:param:"+name);
        /*if("tao".equals(name)){
            response.getWriter().print("true");
        }else{
            response.getWriter().print("false");
        }*/
        return "hhh";
    }
    @RequestMapping("/a2")
    public List<User> a2(){
        List<User> userList = new ArrayList<User>();
        //添加数据
        userList.add(new User("lin_java",18,"男"));
        userList.add(new User("lin_UI",18,"女"));
        userList.add(new User("lin_Mysql",18,"男"));


        return userList; //由于@RestController注解，将list转成json格式返回
    }
    @RequestMapping("/a3")
    public String a3(String name,String pwd){
        String msg = "";
        if(name!=null){
            //从数据库中差admin
            if("admin".equals(name)){
                msg = "ok";
            }else{
                msg = "用户名有误";
            }
        }
        if(pwd!=null){
            if("123".equals(pwd)){
                msg = "ok";
            }else{
                msg = "密码有误";
            }
        }
        return msg;
    }
}
