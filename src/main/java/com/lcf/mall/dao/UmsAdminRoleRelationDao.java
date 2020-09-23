package com.lcf.mall.dao;

import com.lcf.mall.mbg.model.UmsPermission;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/*
后台用户与角色管理自定义dao
 */
public interface UmsAdminRoleRelationDao {

    /*
    获取用户所有权限
     */
    List<UmsPermission> getPermissionList(@Param("adminId") Long adminId);
}
