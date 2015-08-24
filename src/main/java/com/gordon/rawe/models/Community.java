package com.gordon.rawe.models;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gordon on 2015/8/24.
 */
public class Community {

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }

    public Community() {
    }

    public Community(String name, List<Person> parteners) {
        this.name = name;
        this.parteners = parteners;
    }

    private String name = "";
    private List<Person> parteners = new ArrayList<Person>();

    public void add(Person p) {
        this.parteners.add(p);
    }

    public void addAll(List<Person> persons) {
        parteners.addAll(persons);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Person> getParteners() {
        return parteners;
    }

    public void setParteners(ArrayList<Person> parteners) {
        this.parteners = parteners;
    }
}
