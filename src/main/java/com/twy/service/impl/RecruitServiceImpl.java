package com.twy.service.impl;

import com.twy.dao.RecruitDao;
import com.twy.entity.Team;
import com.twy.entity.User;
import com.twy.entity.UserTeam;
import com.twy.service.RecruitService;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: Tang
 * @createTime: 2021/10/14
 */
@Service
public class RecruitServiceImpl implements RecruitService {
    @Autowired
    private RecruitDao recruitDao;

    @Override
    public List<Team> findAllTeamByState(Integer teamState) {
        User user = (User) SecurityUtils.getSubject().getPrincipal();
        List<Team> teams = recruitDao.findAllTeamByState(teamState, user.getUserId());
        return teams;
    }

    @Override
    public List<UserTeam> findAllUserTeam(String userId) {
        List<UserTeam> userTeams = recruitDao.findAllUserTeam(userId);
        return userTeams;
    }
}