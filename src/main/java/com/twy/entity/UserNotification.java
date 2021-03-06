package com.twy.entity;

/**
 * @author: Tang
 * @createTime: 2021/10/14
 */
public class UserNotification {
    private Integer state;

    private String userId;

    private String notificationId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(String notificationId) {
        this.notificationId = notificationId == null ? null : notificationId.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "UserNotification{" +
                "state=" + state +
                ", userId='" + userId + '\'' +
                ", notificationId='" + notificationId + '\'' +
                '}';
    }
}