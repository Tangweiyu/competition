package com.twy.dao;

import com.twy.entity.University;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: Tang
 * @createTime: 2021/10/14
 */
@Mapper
public interface UniversityDao {
    /**
     * 根据用户的学院id查询学校
     *
     * @param collegeId
     * @return
     */
    University findUniversityByCollegeId(String collegeId);
}