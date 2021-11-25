package com.twy.entity;

/**
 * @author: Tang
 * @createTime: 2021/10/14
 */
public class UserTeam {
    private String userId;

    private String teamId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId == null ? null : teamId.trim();
    }

    @Override
    public String toString() {
        return "UserTeam{" +
                "userId='" + userId + '\'' +
                ", teamId='" + teamId + '\'' +
                '}';
    }
}