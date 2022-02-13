package com.library.service;

import com.library.bean.ReaderInfo;
import com.library.dao.ReaderCardDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 小桥流水
 * @description 借阅卡信息服务
 * @date 2022-02-13 17:25
 */
@Service
public class ReaderCardService {
    @Autowired
    private ReaderCardDao readerCardDao;

    public boolean addReaderCard(ReaderInfo readerInfo, String password) {
        return readerCardDao.addReaderCard(readerInfo, password) > 0;
    }

    public boolean updatePassword(long readerId, String password) {
        return readerCardDao.resetPassword(readerId, password) > 0;
    }

    public boolean deleteReaderCard(long readerId) {
        return readerCardDao.deleteReaderCard(readerId) > 0;
    }
}
