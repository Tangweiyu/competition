package com.twy.dao;

import com.twy.entity.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.Set;

/**
 * @author: Tang
 * @createTime: 2021/10/14
 */
@Mapper
public interface RoleDao {

    /**
     * 通过userId获取user的角色
     *
     * @param userId
     * @return
     */
    public Set<Role> getRoleByUserId(String userId);

}
