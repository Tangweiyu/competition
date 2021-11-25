package com.twy.service;

import com.twy.entity.Team;
import com.twy.entity.UserTeam;

import java.util.List;

/**
 * @author: Tang
 * @createTime: 2021/10/14
 */
public interface RecruitService {

    /**
     * 根据队伍状态获取队伍列表
     *
     * @param teamState
     * @return
     */
    public List<Team> findAllTeamByState(Integer teamState);

    /**
     * 查询该用户的所有加入的队伍列表
     *
     * @param userId
     * @return
     */
    List<UserTeam> findAllUserTeam(String userId);
}
