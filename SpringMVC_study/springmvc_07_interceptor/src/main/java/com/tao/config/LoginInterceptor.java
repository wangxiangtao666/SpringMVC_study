package com.tao.config;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if(request.getRequestURI().contains("goLogin"))
            return true;
        if(request.getRequestURI().contains("login"))
            return true;
        if(request.getRequestURI().contains("main")){
            if(request.getSession().getAttribute("username")!=null){
                return true;
            }
        }
        if(request.getRequestURI().contains("logout")){
            if(request.getSession().getAttribute("username")!=null){
                return true;
            }
        }
         request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request,response);
        return false;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
