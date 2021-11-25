package com.twy.service.impl;

import com.twy.dao.UserDao;
import com.twy.entity.User;
import com.twy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: Tang
 * @createTime: 2021/10/14
 */
@Service
public class UserServiceImpl implements UserService {
    //注意@Resource 与 @Autowired 区别
    @Autowired
    private UserDao userDao;

    @Override
    public User findByUsernameAndPassword(User user) {
        User u = userDao.findByUsernameAndPassword(user);
        return u;
    }

    @Override
    public String findCollegeIdByUserName(String userName) {
        String collegeId = userDao.findCollegeIdByUserName(userName);
        return collegeId;
    }

    @Override
    public User findUserByUserName(String userName) {
        User user = userDao.findUserByUserName(userName);
        return user;
    }

    @Override
    public void updatePassword(User user) {
        userDao.updatePassword(user);
    }

    @Override
    public User findUserByUserId(String userId) {
        User user = userDao.findUserByUserId(userId);
        return user;
    }

    @Override
    public List<User> getAllUser() {
        List<User> users = userDao.getAllUser();
        return users;
    }

}

