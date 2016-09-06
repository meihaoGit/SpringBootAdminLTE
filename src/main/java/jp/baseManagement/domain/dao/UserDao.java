package jp.baseManagement.domain.dao;

import jp.baseManagement.domain.model.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by 3111266 on 2016/09/06.
 * jp.baseManagement.domain.dao
 */
public class UserDao {

    @Autowired
    private SqlSession sqlSession;

    public User selectUserById(long id) {
        return this.sqlSession.selectOne("selectUserById", id);
    }
}
