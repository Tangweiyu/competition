package com.twy.entity;

/**
 * @author: Tang
 * @createTime: 2021/10/14
 */
public class CompetitionType {

    private String competitionTypeId;
    private String competitionTypeName;

    public String getCompetitionTypeId() {
        return competitionTypeId;
    }

    public void setCompetitionTypeId(String competitionTypeId) {
        this.competitionTypeId = competitionTypeId;
    }

    public String getCompetitionTypeName() {
        return competitionTypeName;
    }

    public void setCompetitionTypeName(String competitionTypeName) {
        this.competitionTypeName = competitionTypeName;
    }

    @Override
    public String toString() {
        return "CompetitionType{" +
                "competitionTypeId='" + competitionTypeId + '\'' +
                ", competitionTypeName='" + competitionTypeName + '\'' +
                '}';
    }
}