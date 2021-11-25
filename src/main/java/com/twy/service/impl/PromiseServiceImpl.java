package com.twy.service.impl;

import com.twy.dao.PromiseDao;
import com.twy.entity.Promise;
import com.twy.entity.Role;
import com.twy.service.PromiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author: Tang
 * @createTime: 2021/10/14
 */
@Service
public class PromiseServiceImpl implements PromiseService {

    @Autowired
    private PromiseDao promiseDao;

    @Override
    public Set<Promise> getPromiseByRole(Set<Role> roles) {
        return promiseDao.getPromiseByRole(roles);
    }
}