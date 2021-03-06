package com.library.dao;

import com.library.bean.ReaderInfo;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 小桥流水
 * @description 功能描述
 * @date 2022-02-13 3:29
 */
@Repository
public class ReaderInfoDao {
    private final static String NAMESPACE = "com.library.dao.ReaderInfoDao.";
    @Resource
    private SqlSessionTemplate sqlSessionTemplate;

    public ArrayList<ReaderInfo> getAllReaderInfo() {
        List<ReaderInfo> result = sqlSessionTemplate.selectList(NAMESPACE + "getAllReaderInfo");
        return (ArrayList<ReaderInfo>) result;
    }

    public ReaderInfo findReaderInfoByReaderId(final long readerId) {
        return sqlSessionTemplate.selectOne(NAMESPACE + "findReaderInfoByReaderId", readerId);
    }

    public int deleteReaderInfo(final long readerId) {
        return sqlSessionTemplate.delete(NAMESPACE + "deleteReaderInfo", readerId);
    }

    public int editReaderInfo(final ReaderInfo readerInfo) {
        return sqlSessionTemplate.update(NAMESPACE + "editReaderInfo", readerInfo);
    }

    public int editReaderCard(final ReaderInfo readerInfo) {
        return sqlSessionTemplate.update(NAMESPACE + "editReaderCard", readerInfo);
    }

    public final long addReaderInfo(final ReaderInfo readerInfo) {
        if (sqlSessionTemplate.insert(NAMESPACE + "addReaderInfo", readerInfo) > 0) {
            return sqlSessionTemplate.selectOne(NAMESPACE + "getReaderId", readerInfo);
        } else {
            return -1;
        }
    }
}

