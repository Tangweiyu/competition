package com.twy.dao;

import com.twy.entity.Team;
import com.twy.entity.UserTeam;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author: Tang
 * @createTime: 2021/10/14
 */
@Mapper
public interface RecruitDao {
    /**
     * 根据队伍状态获取队伍列表
     *
     * @param teamState
     * @param captainId
     * @return
     */
    public List<Team> findAllTeamByState(@Param("teamState") Integer teamState, @Param("captainId") String captainId);

    /**
     * 查询该用户的所有加入的队伍列表
     *
     * @param userId
     * @return
     */
    List<UserTeam> findAllUserTeam(String userId);
}
