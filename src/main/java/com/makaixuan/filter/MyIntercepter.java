package com.makaixuan.filter;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * SoringMVC 拦截器
 */
public class MyIntercepter implements HandlerInterceptor {
    /************************
      拦截器和过滤器的区别：
      拦截器是AOP思想的具体应用
     ************************/

    /**
     * 前执行
     * @param request
     * @param response
     * @param handler
     * @return True:放行执行洗一个拦截 False：终止
     * @throws Exception
     */
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("======处理前=====");
        return true;
    }

    /**
     * 中执行
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
        System.out.println("======处理后=====");
    }

    /**
     * 后执行
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {
        System.out.println("======清理=====");
    }
}
