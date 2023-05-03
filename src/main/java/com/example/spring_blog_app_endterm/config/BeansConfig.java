package com.example.spring_blog_app_endterm.config;

import com.example.spring_blog_app_endterm.beans.FirstBean;
import com.example.spring_blog_app_endterm.beans.ThirdBean;
import com.example.spring_blog_app_endterm.beans.ThirdBeanImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeansConfig {

    @Bean
    public FirstBean firstBean() {
        return new FirstBean();
    }

    @Bean FirstBean secondBean() {
        return new FirstBean("Rustambek", 21);
    }

    @Bean
    public ThirdBean thirdBean() {
        return new ThirdBeanImpl();
    }

}
