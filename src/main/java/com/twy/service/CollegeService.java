package com.twy.service;

import com.twy.entity.College;

import java.util.List;

/**
 * @author: Tang
 * @createTime: 2021/10/14
 */
public interface CollegeService {

    /**
     * 根据学院名和用户所在学校查询学院
     *
     * @param collegeName
     * @param universityId
     * @return
     */
    College findCollegeByNameAndUniversityId(String collegeName, String universityId);

    /**
     * 根据id查询学院
     *
     * @param collegeId
     * @return
     */
    College findCollegeById(String collegeId);

    /**
     * 根据学校id查询学院列表
     *
     * @param universityId
     * @return
     */
    List<College> findCollegeByUniversityId(String universityId);
}
