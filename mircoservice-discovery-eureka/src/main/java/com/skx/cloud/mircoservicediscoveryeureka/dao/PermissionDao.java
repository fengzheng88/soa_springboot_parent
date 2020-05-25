package com.skx.cloud.mircoservicediscoveryeureka.dao;

import com.skx.cloud.mircoservicediscoveryeureka.entity.Permission;

import java.util.List;

public interface PermissionDao {


    /**
     * 查询权限表
     */
    List<Permission> findPermission();

    List<Permission> findByAdminUserId(int userId);




}
