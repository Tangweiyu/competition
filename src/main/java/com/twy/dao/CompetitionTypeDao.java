package com.twy.dao;

import com.twy.entity.CompetitionType;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author: Tang
 * @createTime: 2021/10/14
 */
@Mapper
public interface CompetitionTypeDao {
    /**
     * 获取全部比赛类型
     *
     * @return
     */
    List<CompetitionType> findAllCompetitionType();
}