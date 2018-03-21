package com.yourcomany.demospringbootplugin.config;

import com.yourcomany.demospringbootplugin.util.ServletUtil;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Configuration
public class WebFilterConfig {

//    @Bean
//    @Order(0)
//    public CommonsRequestLoggingFilter requestLoggingFilter() {
//        CommonsRequestLoggingFilter loggingFilter = new CommonsRequestLoggingFilter();
//        loggingFilter.setIncludeClientInfo(true);
//        loggingFilter.setIncludeQueryString(true);
//        loggingFilter.setIncludePayload(true);
//        return loggingFilter;
//    }


    @Bean
    @Order(1)
    public FilterRegistrationBean logFilter() {
        final FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(new GenericFilterBean() {
            @Override
            public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
                HttpServletRequest httpServletRequest = (HttpServletRequest) request;
                if (!"/health".equals(httpServletRequest.getRequestURI())) {
                    //判断acurator的健康检查api，如果是，则不打印日志
                    System.out.println(ServletUtil.httpRequestToString(httpServletRequest));
                }
                chain.doFilter(request, response);
            }
        });
        return registrationBean;
    }

}
