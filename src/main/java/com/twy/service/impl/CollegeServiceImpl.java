package com.twy.service.impl;

import com.twy.dao.CollegeDao;
import com.twy.entity.College;
import com.twy.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: Tang
 * @createTime: 2021/10/14
 */
@Service
public class CollegeServiceImpl implements CollegeService {
    @Autowired
    private CollegeDao collegeDao;

    @Override
    public College findCollegeByNameAndUniversityId(String collegeName, String universityId) {
        College college = collegeDao.findCollegeByNameAndUniversityId(collegeName, universityId);
        return college;
    }

    @Override
    public College findCollegeById(String collegeId) {
        College college = collegeDao.findCollegeById(collegeId);
        return college;
    }

    @Override
    public List<College> findCollegeByUniversityId(String universityId) {
        List<College> colleges = collegeDao.findCollegeByUniversityId(universityId);
        return colleges;
    }
}
