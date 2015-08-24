package com.gordon.rawe.models;

import com.alibaba.fastjson.JSON;

/**
 * Created by gordon on 2015/8/24.
 */
public class Person {

    public Person() {
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }

    String name = "";
    int age;
    String email = "";

    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
