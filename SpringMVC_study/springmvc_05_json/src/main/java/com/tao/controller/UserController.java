package com.tao.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.tao.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class UserController {
    //@RequestMapping(value = "/j1",produces = "application/json;charset=utf-8")//设置响应体的文本类型和编码//可以使用配置文件
    @RequestMapping("/j1")
    @ResponseBody//使用这个注解就不会走视图解析器，直接返回字符串到页面
    public String json1() throws JsonProcessingException {
        //jackson ObjectMapper
        ObjectMapper mapper = new ObjectMapper();
        User user = new User("涛",2,"男");
        return mapper.writeValueAsString(user);
    }

    @RequestMapping("/j2")
    @ResponseBody
    public String json2() throws JsonProcessingException {
        //jackson ObjectMapper
        ObjectMapper mapper = new ObjectMapper();
        List<User> userList = new ArrayList<User>();
        User user1 = new User("涛1",2,"男");
        User user2 = new User("涛2",2,"男");
        User user3 = new User("涛3",2,"男");
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        return mapper.writeValueAsString(userList);
    }

    @RequestMapping("/j3")//使用传统java的方式改变日期格式
    @ResponseBody
    public String json3() throws JsonProcessingException {
        //jackson ObjectMapper
        ObjectMapper mapper = new ObjectMapper();
        Date date = new Date();
        //自定义日期格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //如果不定义格式，默认解析为一个时间戳，就是一个大数
        return mapper.writeValueAsString(sdf.format(date));
    }
    @RequestMapping("/j31")//定义解析日期格式
    @ResponseBody
    public String json31() throws JsonProcessingException {
        //jackson ObjectMapper
        ObjectMapper mapper = new ObjectMapper();
        //不使用时间戳的方式
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS,false);
        //自定义日期格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        mapper.setDateFormat(sdf);//设置解析日期格式
        Date date = new Date();
        return mapper.writeValueAsString(date);
    }

    @RequestMapping("/j4")
    @ResponseBody
    public String json6(){

        User user1 = new User("涛1",2,"男");
        User user2 = new User("涛2",2,"男");
        User user3 = new User("涛3",2,"男");

        List<User> userList = new ArrayList<User>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);

        System.out.println("*******Java对象 转 JSON字符串*******");
        String str1 = JSON.toJSONString(userList);
        System.out.println("JSON.toJSONString(list)==>"+str1);
        String str2 = JSON.toJSONString(user1);
        System.out.println("JSON.toJSONString(user1)==>"+str2);

        System.out.println("\n****** JSON字符串 转 Java对象*******");
        User jp_user1=JSON.parseObject(str2,User.class);
        System.out.println("JSON.parseObject(str2,User.class)==>"+jp_user1);

        System.out.println("\n****** Java对象 转 fast json中定义的JSON对象（相当于map） ******");
        JSONObject jsonObject1 = (JSONObject) JSON.toJSON(user2);
        System.out.println("(JSONObject) JSON.toJSON(user2)==>"+jsonObject1.getString("name"));

        System.out.println("\n****** fast json中定义的JSON对象 转 Java对象 ******");
        User to_java_user = JSON.toJavaObject(jsonObject1, User.class);
        System.out.println("JSON.toJavaObject(jsonObject1, User.class)==>"+to_java_user);

        return JSON.toJSONString(userList);
    }

}
