package com.twy.service.impl;

import com.twy.dao.CollegeDao;
import com.twy.dao.CompetitionDao;
import com.twy.dao.FileDao;
import com.twy.dao.NotificationDao;
import com.twy.entity.Competition;
import com.twy.entity.Notification;
import com.twy.service.NotificationService;
import com.twy.utils.CompetitionNotificationVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author: Tang
 * @createTime: 2021/10/14
 */
@Service
public class NotificationServiceImpl implements NotificationService {
    @Autowired
    private NotificationDao notificationDao;
    @Autowired
    private CompetitionDao competitionDao;
    @Autowired
    private CollegeDao collegeDao;
    @Autowired
    private FileDao fileDao;

    @Override
    public List<Notification> findNotificationByType(Integer notificationType) {
        List<Notification> notifications = notificationDao.findNotificationByType(notificationType);
        return notifications;
    }

    @Override
    public List<Notification> findSystemNoticeByTypeAndState(Integer notificationType, Integer notificationState) {
        List<Notification> notifications = notificationDao.findSystemNoticeByTypeAndState(notificationType, notificationState);
        return notifications;
    }

    @Transactional(isolation = Isolation.REPEATABLE_READ, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    @Override
    public void insertCompetitionAndNotification(Competition competition, Notification notification) {
        competitionDao.insertCompetition(competition);
        notificationDao.insertNotification(notification);
    }


    @Override
    public Notification findDataByNotificationId(String notificationId) {
        Notification notification = notificationDao.findDataByNotificationId(notificationId);
        return notification;
    }

    @Transactional(isolation = Isolation.REPEATABLE_READ, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    @Override
    public void deleteNotificationById(String notificationId, String competitionId) {
        //删通知
        notificationDao.deleteNotificationById(notificationId);
        //删竞赛文件
        fileDao.deleteFileByCompetitionId(competitionId);
        //删竞赛
        competitionDao.deleteCompetitionById(competitionId);

    }

    @Transactional(isolation = Isolation.REPEATABLE_READ, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    @Override
    public void updateNotification(CompetitionNotificationVO competitionNotificationVO) {
        notificationDao.updateNotification(competitionNotificationVO);
        competitionDao.updateCompetition(competitionNotificationVO);
    }
}
