package com.twy.service.impl;

import com.twy.dao.FileDao;
import com.twy.entity.File;
import com.twy.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: Tang
 * @createTime: 2021/10/14
 */
@Service
public class FileServiceImpl implements FileService {
    @Autowired
    private FileDao fileDao;

    @Override
    public void insertFile(File file) {
        fileDao.insertFile(file);
    }

    @Override
    public List<File> findFileByCompetitionId(String competitionId) {
        List<File> files = fileDao.findFileByCompetitionId(competitionId);
        return files;
    }

    @Override
    public void deleteFileByCompetitionId(String CompetitionId) {
        fileDao.deleteFileByCompetitionId(CompetitionId);
    }

    @Override
    public File findFileById(String fileId) {
        File file = fileDao.findFileById(fileId);
        return file;
    }

    @Override
    public void deleteFileById(String fileId) {
        fileDao.deleteFileById(fileId);
    }

    @Override
    public List<File> findFileByNotificationId(String notificationId) {
        List<File> files = fileDao.findFileByNotificationId(notificationId);
        return files;
    }

}
