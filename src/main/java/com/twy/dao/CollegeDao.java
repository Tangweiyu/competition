package com.twy.dao;

import com.twy.entity.College;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author: Tang
 * @createTime: 2021/10/14
 */
@Mapper
public interface CollegeDao {
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

