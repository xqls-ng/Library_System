package com.library.service;

import com.library.bean.ReaderInfo;
import com.library.dao.ReaderInfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @author 小桥流水
 * @description 读者信息服务
 * @date 2022-02-13 17:48
 */
@Service
public class ReaderInfoService {
    @Autowired
    private ReaderInfoDao readerInfoDao;

    public ArrayList<ReaderInfo> readerInfos() {
        return readerInfoDao.getAllReaderInfo();
    }

    public boolean deleteReaderInfo(long readerId) {
        return readerInfoDao.deleteReaderInfo(readerId) > 0;
    }

    public ReaderInfo getReaderInfo(long readerId) {
        return readerInfoDao.findReaderInfoByReaderId(readerId);
    }

    public boolean editReaderInfo(ReaderInfo readerInfo) {
        return readerInfoDao.editReaderInfo(readerInfo) > 0;
    }

    public boolean editReaderCard(ReaderInfo readerInfo) {
        return readerInfoDao.editReaderCard(readerInfo) > 0;
    }

    public long addReaderInfo(ReaderInfo readerInfo) {
        return readerInfoDao.addReaderInfo(readerInfo);
    }
}
