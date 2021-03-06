package com.twy.dao;

import com.twy.entity.Notification;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author: Tang
 * @createTime: 2021/10/14
 */
@Mapper
public interface WinNotificationServiceDao {
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
     * 保存手动录入的获奖信息
     *
     * @param userId
     * @param ranking
     * @param competitionId
     * @return
     */
    void updateWinRanking(@Param("userId") String userId, @Param("competitionId") String competitionId, @Param("ranking") Integer ranking);

    /**
     * 清除获奖信息
     *
     * @param competitionId
     * @return
     */
    void deleteWin(String competitionId);

    /**
     * 更新获奖通知内容
     *
     * @param notification
     * @return
     */
    void updateWinNotification(Notification notification);

}

