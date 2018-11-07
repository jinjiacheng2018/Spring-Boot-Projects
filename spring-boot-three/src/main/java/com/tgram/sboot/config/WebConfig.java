package com.tgram.sboot.config;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.filters.RemoteIpFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *<p> Description: 自定义过滤器配置类 </p>
 *<p> Copyright: Copyright(c) 2018/11/7 </p>
 *<p> Company: 7qb </p>
 *
 *@author JinJiacheng
 *@Version 1.0 2018/11/7 17:50
 */
@Configuration
public class WebConfig
{
    @Bean
    public RemoteIpFilter remoteIpFilter(){
        return new RemoteIpFilter();
    }

    @Bean
    public FilterRegistrationBean testFilterRegistration(){
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new MyFilter());
        registration.addUrlPatterns("/*");
        registration.addInitParameter("paramName","paramValue");
        registration.setName("MyFilter");
        registration.setOrder(1);
        return registration;
    }
    
    // 自定义过滤器
    public class MyFilter implements Filter
    {
        @Override
        public void init(FilterConfig filterConfig) throws ServletException
        {
            System.err.println("MyFilter init method...");
        }
        
        @Override
        public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
                throws IOException, ServletException
        {
            HttpServletRequest request = (HttpServletRequest) servletRequest;
            HttpServletResponse response = (HttpServletResponse) servletResponse;
            request.setCharacterEncoding("UTF-8");
            response.setContentType("text/html;charset=UTF-8");
            response.setCharacterEncoding("UTF-8");
            System.err.println("MyFilter doFilter method...");
            filterChain.doFilter(servletRequest, servletResponse);
        }
        
        @Override
        public void destroy()
        {
            System.err.println("MyFilter destory method...");
        }
    }
}
