package com.twy.service;

import com.twy.entity.CompetitionType;

import java.util.List;

/**
 * @author: Tang
 * @createTime: 2021/10/14
 */
public interface CompetitionTypeService {
    /**
     * 获取全部比赛类型
     *
     * @return
     */
    List<CompetitionType> findAllCompetitionType();
}
