package com.twy.service;

import com.twy.entity.University;

/**
 * @author: Tang
 * @createTime: 2021/10/14
 */
public interface UniversityService {
    /**
     * 根据用户的学院id查询学校
     *
     * @param collegeId
     * @return
     */
    University findUniversityByCollegeId(String collegeId);
}