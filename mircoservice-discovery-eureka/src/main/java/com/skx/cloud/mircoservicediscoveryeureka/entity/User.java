package com.skx.cloud.mircoservicediscoveryeureka.entity;


/**
 * 用户类
 */
public class User {


    private int id;   //用户Id

    private String username;  //用户名

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String password;   //用户密码
}
