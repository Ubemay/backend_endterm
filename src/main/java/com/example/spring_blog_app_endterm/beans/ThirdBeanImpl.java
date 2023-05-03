package com.example.spring_blog_app_endterm.beans;

import org.springframework.stereotype.Component;

@Component
public class ThirdBeanImpl implements ThirdBean{

    private String data;

    @Override
    public String getData() {
        return this.data;
    }

    @Override
    public void setData(String date) {
        this.data = date;
    }
}
