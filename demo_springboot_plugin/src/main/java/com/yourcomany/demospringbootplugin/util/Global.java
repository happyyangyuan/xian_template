package com.yourcomany.demospringbootplugin.util;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * 一个全局工具类
 * Created by happyyangyuan at 2018/1/28
 */
public class Global {

    /**
     * 获取当前请求session
     */
    public static HttpServletRequest getHttpServletRequest() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder
                .getRequestAttributes())
                .getRequest();
        return request;
    }

    /**
     * 获取当前请求session
     */
    public static HttpSession getHttpSession() {
        return getHttpServletRequest().getSession();
    }

    /**
     * 从servlet request内读取属性
     */
    public static <T> T getAttributeFromRequest(String name) {
        return (T) getHttpServletRequest().getAttribute(name);
    }
}
