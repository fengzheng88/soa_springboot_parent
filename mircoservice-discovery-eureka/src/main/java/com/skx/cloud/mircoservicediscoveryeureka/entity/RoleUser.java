package com.skx.cloud.mircoservicediscoveryeureka.entity;


/**
 * 用户角色类
 */
public class RoleUser {

     private  int id;  //用户角色Id
     private  int user_id; //用户Id
     private  int role_id; //角色Id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }
}
