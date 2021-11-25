package com.twy.dao;

import com.twy.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author: Tang
 * @createTime: 2021/10/14
 */
@Mapper
public interface UserDao {

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
     * 通过userName修改密码
     *
     * @param user
     */
    void updateUserByUserName(User user);

    /**
     * 修改用户密码
     *
     * @param user
     */
    void updatePassword(User user);

    /**
     * 根据用户id获取用户信息
     *
     * @param captainId
     * @return
     */
    User findUserByUserId(String captainId);

    /**
     * 获得所有用户
     * @return
     */
    List<User> getAllUser();
}

