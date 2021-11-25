package com.twy.service;

import com.twy.entity.User;

import java.util.List;

/**
 * @author: Tang
 * @createTime: 2021/10/14
 */
public interface UserService {

    /**
     * 通过用户名，密码查询用户
     *
     * @param user
     * @return
     */
    User findByUsernameAndPassword(User user);

    /**
     * 通过用户名查询学院id
     *
     * @param userName
     * @return
     */
    String findCollegeIdByUserName(String userName);

    /**
     * 通过userName查询所有用户信息
     *
     * @param userName
     * @return
     */
    User findUserByUserName(String userName);


    /**
     * 修改用户密码
     *
     * @param user
     */
    void updatePassword(User user);

    /**
     * 通过userId查询所有用户信息
     *
     * @param userId
     * @return
     */
    User findUserByUserId(String userId);

    /**
     * 获得所有用户
     * @return
     */
    List<User> getAllUser();
}

