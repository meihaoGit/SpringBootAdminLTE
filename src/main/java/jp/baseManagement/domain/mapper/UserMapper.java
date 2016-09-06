package jp.baseManagement.domain.mapper;

import jp.baseManagement.domain.model.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by 3111266 on 2016/09/06.
 * jp.baseManagement.domain.mapper
 */

@Mapper
public interface UserMapper {
    void insert(User user);

    User select(int id);
}
