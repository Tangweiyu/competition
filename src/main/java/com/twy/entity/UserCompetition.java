package com.twy.entity;

/**
 * @author: Tang
 * @createTime: 2021/10/14
 */
public class UserCompetition {
    private Competition competition;

    private User user;

    private Long date;

    private Integer winRanking;

    private String winLevelName;

    public Integer getWinRanking() {
        return winRanking;
    }

    public void setWinRanking(Integer winRanking) {
        this.winRanking = winRanking;
    }

    public String getWinLevelName() {
        return winLevelName;
    }

    public void setWinLevelName(String winLevelName) {
        this.winLevelName = winLevelName;
    }

    public Long getDate() {
        return date;
    }

    public void setDate(Long date) {
        this.date = date;
    }

    public Competition getCompetition() {
        return competition;
    }

    public void setCompetition(Competition competition) {
        this.competition = competition;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "UserCompetition{" +
                "competition=" + competition +
                ", user=" + user +
                ", date=" + date +
                ", winRanking=" + winRanking +
                ", winLevelName='" + winLevelName + '\'' +
                '}';
    }
}
