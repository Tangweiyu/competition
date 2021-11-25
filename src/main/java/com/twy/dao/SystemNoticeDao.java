package com.twy.dao;

import com.twy.entity.Notification;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author: Tang
 * @createTime: 2021/10/14
 */
@Mapper
public interface SystemNoticeDao {
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
     * 更新公告
     *
     * @param notification
     * @return
     */
    void updateNotification(Notification notification);
}

