package com.twy.entity;

import java.util.List;

/**
 * @author: Tang
 * @createTime: 2021/10/14
 */
public class Win {
    private String winId;

    private Integer winRanking;

    private String winName;

    private List<User> users;

    private Competition competition;

    public String getWinId() {
        return winId;
    }

    public void setWinId(String winId) {
        this.winId = winId;
    }

    public Integer getWinRanking() {
        return winRanking;
    }

    public void setWinRanking(Integer winRanking) {
        this.winRanking = winRanking;
    }

    public String getWinName() {
        return winName;
    }

    public void setWinName(String winName) {
        this.winName = winName;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public Competition getCompetition() {
        return competition;
    }

    public void setCompetition(Competition competition) {
        this.competition = competition;
    }

    @Override
    public String toString() {
        return "Win{" +
                "winId='" + winId + '\'' +
                ", winRanking=" + winRanking +
                ", winName='" + winName + '\'' +
                ", users=" + users +
                ", competition=" + competition +
                '}';
    }
}

