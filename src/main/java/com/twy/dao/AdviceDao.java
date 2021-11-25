package com.twy.dao;

import com.twy.entity.Advice;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author: Tang
 * @createTime: 2021/10/14
 */
@Mapper
public interface AdviceDao {
    /**
     * 插入反馈建议
     *
     * @param advice
     */
    public void insertAdvice(Advice advice);

    /**
     * 获取所有的投诉建议
     *
     * @return
     */
    List<Advice> getAllAdvice(@Param("adviceState")Integer adviceState);

    /**
     * 插入反馈建议
     *
     * @param advice
     */
    void updateAdvice(Advice advice);
}

