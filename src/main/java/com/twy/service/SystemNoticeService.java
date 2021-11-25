package com.twy.service;

import com.twy.entity.Notification;

import java.util.List;

/**
 * @author: Tang
 * @createTime: 2021/10/14
 */
public interface SystemNoticeService {

    /**
     * 根据类型获取通知
     *
     * @param notificationType
     * @return
     */
    List<Notification> findNoticeByType(Integer notificationType);


    /**
     * 保存新的公告内容
     *
     * @param notification
     * @return
     */
    void insertNotice(Notification notification);

    /**
     * 删除公告
     *
     * @param notificationId
     * @return
     */
    void deleteNotificationById(String notificationId);

    /**
     * 更新公告
     *
     * @param notification
     * @return
     */
    void updateNotification(Notification notification);
}

