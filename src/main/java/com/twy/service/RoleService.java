package com.twy.service;

import com.twy.entity.Role;

import java.util.Set;

/**
 * @author: Tang
 * @createTime: 2021/10/14
 */
public interface RoleService {

    /**
     * 通过adminid获取角色
     *
     * @param userId
     * @return
     */
    public Set<Role> getRoleByUserId(String userId);

}

