package com.twy.service;

import com.twy.entity.Promise;
import com.twy.entity.Role;

import java.util.Set;

/**
 * @author: Tang
 * @createTime: 2021/10/14
 */
public interface PromiseService {

    /**
     * 通过角色获取权限
     *
     * @param roles
     * @return
     */
    public Set<Promise> getPromiseByRole(Set<Role> roles);
}

