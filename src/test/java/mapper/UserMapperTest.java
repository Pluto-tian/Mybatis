package mapper;

import mybatisUtils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.user.User;

import java.io.IOException;
import java.util.List;

/**
 * @author Hoaer
 * @version 1.0
 */
public class UserMapperTest {
    @Test
    public void UserMapper() throws IOException {
        final SqlSession sqlSession = MybatisUtils.getSqlSession();
        final UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        final List<User> userList = mapper.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }
    }
}
