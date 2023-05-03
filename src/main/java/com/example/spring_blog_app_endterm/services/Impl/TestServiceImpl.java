package com.example.spring_blog_app_endterm.services.Impl;

import com.example.spring_blog_app_endterm.services.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    private String testData;
    private int intTestData;

    @Override
    public String getTestData() {
        return "Some test data " + this.testData;
    }

    @Override
    public int getTestDataInt() {
        return this.intTestData;
    }

    @Override
    public void setTestData(String testData) {
        this.testData = testData;
    }

    @Override
    public void setTestDataInt(int a) {
        this.intTestData = a;
    }

    @Override
    public boolean auth(String email, String password) {
        return false;
    }
}
