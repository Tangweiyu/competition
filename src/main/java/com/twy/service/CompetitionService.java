package com.twy.service;

import com.twy.entity.Competition;
import com.twy.entity.User;
import com.twy.entity.UserCompetition;

import java.util.List;

/**
 * @author: Tang
 * @createTime: 2021/10/14
 */
public interface CompetitionService {
    /**
     * 通过竞赛id查询比赛详情
     *
     * @param competitionId
     * @return
     */
    Competition findCompetitionById(String competitionId);

    /**
     * 查询所有比赛详情
     *
     * @return
     */
    List<Competition> findAllCompetition();

    /**
     * 根据比赛id获得比赛列表
     *
     * @param competitionId
     * @return
     */
    List<User> findUserByCompetitionId(String competitionId);

    /**
     * 根据当前用户id获得已参加列表
     *
     * @param userId
     * @return
     */
    List<UserCompetition> findCompetitionListByUserId(String userId);

    /**
     * 查询所有组队比赛列表
     *
     * @return
     */
    List<Competition> findAllTeamCompetition();

    /**
     * 通过竞赛id,查询报名该竞赛的用户列表
     *
     * @param competitionId
     * @return
     */
    List<User> findUserList(String competitionId);
}

