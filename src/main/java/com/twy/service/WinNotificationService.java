package com.twy.service;

import com.twy.entity.Notification;

import java.util.List;

/**
 * @author: Tang
 * @createTime: 2021/10/14
 */
public interface WinNotificationService {
    /**
     * 获取所有获奖通知
     *
     * @param notificationType
     * @return
     */
    public List<Notification> findAllWinNotification(Integer notificationType);


    /**
     * 保存新获奖通知
     *
     * @param notification
     * @return
     */
    void insertWinNotification(Notification notification);

    /**
     * 删除获奖通知
     *
     * @param notificationId
     * @param competitionId
     * @return
     */
    void deleteWinNotificationById(String notificationId, String competitionId);

    /**
     * 修改获奖通知
     *
     * @param notification
     * @return
     */
    void updateWinNotification(Notification notification);
}

