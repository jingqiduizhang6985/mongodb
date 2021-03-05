package com.study.mogodbdemo.entity;

import java.io.Serializable;

/**
 * 实体类
 */
public class User implements Serializable {
    private Integer id;
    private String name;
    private String idCard;
    private Cat cat;//用户养的猫

    public User(){}

    public User(Integer id,String name,String idCard){
        this.id = id;
        this.name = name;
        this.idCard = idCard;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", idCard='" + idCard + '\'' +
                ", cat=" + cat +
                '}';
    }
}
