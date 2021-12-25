package mapper;

import pojo.user.User;

import java.util.List;

/**
 * @author Hoaer
 * @version 1.0
 */
public interface UserMapper {
    /**
     *getUserList 查询
     * deleteUser 删除
     * add_User 添加
     * update 更新
     */
    List<User> getUserList();
    int deleteUser(int id);
    int add_User(User user);
    int update(User user);
}
