package com.study.mogodbdemo.entity;

import java.io.Serializable;

public class UserParam implements Serializable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
