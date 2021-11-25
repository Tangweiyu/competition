package com.twy.service.impl;

import com.twy.dao.CompetitionTypeDao;
import com.twy.entity.CompetitionType;
import com.twy.service.CompetitionTypeService;
import com.twy.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: Tang
 * @createTime: 2021/10/14
 */
@Service
public class CompetitionTypeServiceImpl implements CompetitionTypeService {
    @Autowired
    private RedisUtil redisUtil;
    @Autowired
    private CompetitionTypeDao competitionTypeDao;

    @Override
    public List<CompetitionType> findAllCompetitionType() {
        List<CompetitionType> competitionTypes;
        if(redisUtil.hasKey("competitionTypes")) {
            competitionTypes = (List<CompetitionType>) redisUtil.get("competitionTypes");
            System.out.println("Redis缓存取出的竞赛类型");
        }
        else{
            competitionTypes = competitionTypeDao.findAllCompetitionType();
            redisUtil.set("competitionTypes",competitionTypes);
            System.out.println("数据库取出的竞赛类型");
        }
        return competitionTypes;
    }
}
