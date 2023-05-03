package com.example.spring_blog_app_endterm.services;

public interface TestService {

    String getTestData();
    int getTestDataInt();
    void setTestData(String testData);
    void setTestDataInt(int a);

    boolean auth(String email, String password);
}
