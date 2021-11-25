package com.twy.dao;

import com.twy.entity.Promise;
import com.twy.entity.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.Set;

/**
 * @author: Tang
 * @createTime: 2021/10/14
 */
@Mapper
public interface PromiseDao {

    /**
     * 通过角色获取权限
     *
     * @param roles
     * @return
     */
    public Set<Promise> getPromiseByRole(Set<Role> roles);
}

