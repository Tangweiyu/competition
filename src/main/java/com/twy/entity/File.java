package com.twy.entity;

/**
 * @author: Tang
 * @createTime: 2021/10/14
 */
public class File {
    private String fileId;

    private String filePath;

    private String fileName;

    private Competition competition;

    private Notification notification;

    @Override
    public String toString() {
        return "File{" +
                "fileId='" + fileId + '\'' +
                ", filePath='" + filePath + '\'' +
                ", fileName='" + fileName + '\'' +
                ", competition=" + competition +
                ", notification=" + notification +
                '}';
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Competition getCompetition() {
        return competition;
    }

    public void setCompetition(Competition competition) {
        this.competition = competition;
    }

    public Notification getNotification() {
        return notification;
    }

    public void setNotification(Notification notification) {
        this.notification = notification;
    }
}

