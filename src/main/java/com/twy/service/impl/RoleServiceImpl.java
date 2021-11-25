package com.twy.service.impl;

import com.twy.dao.RoleDao;
import com.twy.entity.Role;
import com.twy.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author: Tang
 * @createTime: 2021/10/14
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDao roleDao;

    @Override
    public Set<Role> getRoleByUserId(String userId) {
        return roleDao.getRoleByUserId(userId);
    }
}