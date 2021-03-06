package com.twy.service.impl;

import com.twy.dao.ApplyDao;
import com.twy.dao.TeamDao;
import com.twy.entity.Apply;
import com.twy.entity.Team;
import com.twy.entity.User;
import com.twy.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Tang
 * @createTime: 2021/10/14
 */
@Service
public class TeamServiceImpl implements TeamService {
    @Autowired
    private TeamDao teamDao;
    @Autowired
    private ApplyDao applyDao;

    @Transactional(isolation = Isolation.REPEATABLE_READ, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    @Override
    public void insertTeam(Team team) {
        teamDao.insertTeam(team);
        //将自己增加到队伍中
        teamDao.insertUserTeam(team.getTeamId(), team.getCaptain().getUserId());
    }

    @Override
    public List<Team> findMyTeam(String userId) {
        List<Team> teams = teamDao.findMyTeam(userId);
        return teams;
    }

    @Override
    public List<User> findUsersByTeamIdAndNotNowUser(String teamId, String userId) {
        List<User> users = teamDao.findUsersByTeamIdAndNotNowUser(teamId, userId);
        return users;
    }

    @Override
    public void updateMyTeam(Team team) {
        teamDao.updateMyTeam(team);
    }

    @Transactional(isolation = Isolation.REPEATABLE_READ, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    @Override
    public void deleteTeamUser(String teamId, String userId) {
        teamDao.deleteTeamUser(teamId, userId);
        teamDao.updateTeamHeadcount(teamId);
    }

    @Transactional(isolation = Isolation.REPEATABLE_READ, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    @Override
    public void deleteTeam(String teamId) {
        //通过队伍id删除所有队员
        teamDao.deleteTeamUserByTeamId(teamId);
        //删除所有申请
        applyDao.deleteApplyByTeamId(teamId);
        teamDao.deleteTeam(teamId);
    }

    @Override
    public List<Team> findJoinTeam(String userId) {
        List<Team> teams = teamDao.findJoinTeam(userId);
        return teams;
    }

    @Transactional(isolation = Isolation.REPEATABLE_READ, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    @Override
    public void deleteTeamOneUser(String teamId, String userId) {
        teamDao.deleteTeamUser(teamId, userId);
        //获得当前队伍
        Team team = teamDao.findTeamById(teamId);
        //判断当前队伍状态,如果为已满人或已报名，修改队伍状态，反之不修改
        if (team.getTeamState() == 2 || team.getTeamState() == 3) {
            team.setTeamState(0);
        }
        //队伍人数减1
        team.setTeamHeadcount(team.getTeamHeadcount() - 1);
        teamDao.updateTeamStateAndHeadCount(team);
    }

    @Override
    public List<Apply> findAllMyTeamApply(List<Team> teams) {
        if (teams == null || teams.size() == 0) {
            return null;
        }
        List<Apply> applies = teamDao.findAllMyTeamApply(teams);
        return applies;
    }

    @Override
    public List<Apply> findAllMyHistoryTeamApply(List<Team> teams) {
        if (teams == null || teams.size() == 0) {
            return null;
        }
        //获取审批过的申请列表
        List<Apply> applies = teamDao.findAllMyDispose(teams);
        return applies;
    }

    @Override
    public void updateTeam(Team team) {
        teamDao.updateTeam(team);
    }

    @Override
    public Team findTeamByCaptainIdAndCompetitionId(String userId, String competitionId) {
        Team team = teamDao.findTeamByCaptainIdAndCompetitionId(userId, competitionId);
        return team;
    }

    @Override
    public void updateTeamCancelApply(String teamId) {
        teamDao.updateTeamCancelApply(teamId);
    }

    @Override
    public List<Team> findTeamByCompetitionIdAndRegistered(String competitionId) {
        List<Team> teams = teamDao.findTeamByCompetitionIdAndRegistered(competitionId);
        return teams;
    }

    @Override
    public List<User> findUserListByTeamIdAndCaptainId(String teamId, String captainId) {

        List<User> users = new ArrayList<User>();
        //获取队伍成员信息
        List<User> users1 = teamDao.findUserListByTeamId(teamId);
        System.out.println(users1);
        System.out.println(users1.size());
        for (User user : users1) {
            users.add(user);
        }
        return users;
    }
}

