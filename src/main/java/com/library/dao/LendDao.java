package com.library.dao;

import com.library.bean.Lend;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 小桥流水
 * @description 借阅数据持久层
 * @date 2022-02-13 3:25
 */
@Repository
public class LendDao {

    @Resource
    private SqlSessionTemplate sqlSessionTemplate;

    private final static String NAMESPACE = "com.library.dao.LendDao.";

    public int returnBookOne(final long bookId, long readerId) {
        Map<String, Object> map = new HashMap<>();
        map.put("bookId", bookId);
        map.put("readerId", readerId);
        return sqlSessionTemplate.update(NAMESPACE + "returnBookOne", map);
    }

    //更新图书剩余数量信息
    public int returnBookTwo(final long bookId) {
        return sqlSessionTemplate.update(NAMESPACE + "returnBookTwo", bookId);
    }

    public int lendBookOne(final long bookId, final long readerId) {
        Map<String, Object> map = new HashMap<>();
        map.put("bookId", bookId);
        map.put("readerId", readerId);
        return sqlSessionTemplate.insert(NAMESPACE + "lendBookOne", map);
    }

    //更新图书剩余数量信息
    public int lendBookTwo(final long bookId) {
        return sqlSessionTemplate.update(NAMESPACE + "lendBookTwo", bookId);
    }

    public ArrayList<Lend> lendList() {
        List<Lend> result = sqlSessionTemplate.selectList(NAMESPACE + "lendList");
        return (ArrayList<Lend>) result;
    }

    public ArrayList<Lend> myLendList(final long readerId) {
        List<Lend> result = sqlSessionTemplate.selectList(NAMESPACE + "myLendList", readerId);
        return (ArrayList<Lend>) result;
    }

    public int deleteLend(final long serNum) {
        return sqlSessionTemplate.delete(NAMESPACE + "deleteLend", serNum);
    }
}

