package com.twy.service.impl;

import com.twy.dao.UniversityDao;
import com.twy.entity.University;
import com.twy.service.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: Tang
 * @createTime: 2021/10/14
 */
@Service
public class UniversityServiceImpl implements UniversityService {
    @Autowired
    private UniversityDao universityDao;

    @Override
    public University findUniversityByCollegeId(String collegeId) {
        University university = universityDao.findUniversityByCollegeId(collegeId);
        return university;
    }
}
