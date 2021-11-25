package com.twy.service;

import com.twy.entity.Advice;

import java.util.List;

/**
 * @author: Tang
 * @createTime: 2021/10/14
 */
public interface AdviceService {
    /**
     * 插入反馈建议
     *
     * @param advice
     */
    public void insertAdvice(Advice advice);

    /**
     * 获取所有的投诉建议
     *
     * @param adviceState
     * @return
     */
    List<Advice> getAllAdvice(Integer adviceState);

    /**
     * 更新处理后的建议信息
     *
     * @param advice
     */
    void updateAdvice(Advice advice);
}

