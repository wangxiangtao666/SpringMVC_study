package com.tao.config;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Interceptor implements HandlerInterceptor {
    //拦截器是AOP思想的应用，用来加强方法


    //return true;//执行下一个拦截器，放行
    //return false;//不执行下一个拦截器，被拦截，可以转发或者重定向到别的页面
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("===============处理前====================");
        return true;
    }
    //一般用来写拦截日志
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("===============处理后====================");
    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("===============清理====================");
    }
}
