package com.twy.service.impl;

import com.twy.dao.AdviceDao;
import com.twy.entity.Advice;
import com.twy.service.AdviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: Tang
 * @createTime: 2021/10/14
 */
@Service
public class AdviceServiceImpl implements AdviceService {
    @Autowired
    private AdviceDao adviceDao;

    @Override
    public void insertAdvice(Advice advice) {
        adviceDao.insertAdvice(advice);
    }

    @Override
    public List<Advice> getAllAdvice(Integer adviceState) {
        return adviceDao.getAllAdvice(adviceState);
    }

    @Override
    public void updateAdvice(Advice advice) {
        adviceDao.updateAdvice(advice);
    }
}

