package mapper;

import mybatisUtils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.user.User;
import java.util.Date;
import java.util.List;

/**
 * @author Hoaer
 * @version 1.0
 */
public class UserMapperTest {
    Date date = new Date();

    @Test
    public void GetUserList() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        final UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        final List<User> userList = mapper.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void DelectUser() {
        final SqlSession sqlSession = MybatisUtils.getSqlSession();
        final UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        final int delectUser = mapper.deleteUser(1);
        if (delectUser > 0) {
            sqlSession.commit();
        }
        sqlSession.close();
    }

    @Test
    public void add_User() {
        final SqlSession sqlSession = MybatisUtils.getSqlSession();
        final UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        final int user = mapper.add_User(new User(1, "路遥",
                "01aa15d1a", "1826487451", date));
        if (user > 0) {
            sqlSession.commit();
        }
        sqlSession.close();

    }

    @Test
    public void update() {

        final SqlSession sqlSession = MybatisUtils.getSqlSession();
        final UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        final int update = mapper.update(new User(1, "路遥",
                "01ada551154", "1826487451", date));
        if (update > 0) {
            sqlSession.commit();
        }
        sqlSession.close();
    }
}
