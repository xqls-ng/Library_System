package com.library.dao;

import com.library.bean.ReaderCard;
import com.library.bean.ReaderInfo;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 小桥流水
 * @description 功能描述
 * @date 2022-02-13 3:26
 */
@Repository
public class ReaderCardDao {
    @Resource
    private SqlSessionTemplate sqlSessionTemplate;

    private final static String NAMESPACE = "com.library.dao.ReaderCardDao.";

    public int getIdMatchCount(final long readerId, final String password) {
        Map<String, Object> map = new HashMap<>();
        map.put("readerId", readerId);
        map.put("password", password);
        return sqlSessionTemplate.selectOne(NAMESPACE + "getIdMatchCount", map);
    }

    //需确认读者密码能否返回
    public ReaderCard findReaderByReaderId(final long readerId) {
        return sqlSessionTemplate.selectOne(NAMESPACE + "findReaderByReaderId", readerId);
    }

    public int resetPassword(final long readerId, final String newPassword) {
        Map<String, Object> map = new HashMap<>();
        map.put("readerId", readerId);
        map.put("password", newPassword);
        return sqlSessionTemplate.update(NAMESPACE + "resetPassword", map);
    }

    public int addReaderCard(final ReaderInfo readerInfo, final String password) {
        String username = readerInfo.getName();
        long readerId = readerInfo.getReaderId();
        Map<String, Object> map = new HashMap<>();
        map.put("readerId", readerId);
        map.put("username", username);
        map.put("password", password);
        return sqlSessionTemplate.insert(NAMESPACE + "addReaderCard", map);
    }

    public String getPassword(final long readerId) {
        return sqlSessionTemplate.selectOne(NAMESPACE + "getPassword", readerId);
    }

    public int deleteReaderCard(final long readerId) {
        return sqlSessionTemplate.delete(NAMESPACE + "deleteReaderCard", readerId);
    }
}

