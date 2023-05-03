package com.example.spring_blog_app_endterm.beans;


public class FirstBean {

    private String name;
    private int age;


    public FirstBean() {
        System.out.println("Usting Default constructor of FirstBean class");
        this.name = "No name";
        this.age = 0;
    }

    public FirstBean(String name, int age) {
        System.out.println("Using constructor with parameters of FirstBean class");
        this.name = name;
        this.age = age;
    }

    public String getText() {
        return this.name + " " + this.age + " years old";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
