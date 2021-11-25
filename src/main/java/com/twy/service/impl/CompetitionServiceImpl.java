package com.twy.service.impl;

import com.twy.dao.CompetitionDao;
import com.twy.dao.FileDao;
import com.twy.entity.Competition;
import com.twy.entity.User;
import com.twy.entity.UserCompetition;
import com.twy.service.CompetitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: Tang
 * @createTime: 2021/10/14
 */
@Service
public class CompetitionServiceImpl implements CompetitionService {
    @Autowired
    private CompetitionDao competitionDao;

    @Autowired
    private FileDao fileDao;

    @Override
    public Competition findCompetitionById(String competitionId) {
        Competition competition = competitionDao.findCompetitionById(competitionId);
        return competition;
    }

    @Override
    public List<Competition> findAllCompetition() {
        List<Competition> competitions = competitionDao.findAllCompetition();
        return competitions;
    }

    @Override
    public List<User> findUserByCompetitionId(String competitionId) {
        List<User> users = competitionDao.findUserByCompetitionId(competitionId);
        return users;
    }

    @Override
    public List<UserCompetition> findCompetitionListByUserId(String userId) {
        List<UserCompetition> competitions = competitionDao.findCompetitionListByUserId(userId);
        //获取组队赛已报名列表
        List<UserCompetition> competitions1 = competitionDao.findTeamCompetitionListByUserId(userId);
        System.out.println("------------" + competitions1);
        competitions.addAll(competitions1);
        return competitions;
    }

    @Override
    public List<Competition> findAllTeamCompetition() {
        List<Competition> competitions = competitionDao.findAllTeamCompetition();
        return competitions;
    }

    @Override
    public List<User> findUserList(String competitionId) {
        List<User> users = competitionDao.findUserList(competitionId);
        return users;
    }

}

