import mybatisUtils.MybatisUtils;

import org.apache.ibatis.session.SqlSession;

import pojo.user.User;

import java.io.IOException;
import java.util.List;

/**
 * @author Hoaer
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) throws IOException {
        final SqlSession session = MybatisUtils.getSqlSession();
        //SqlSession session = sqlSessionFactory.openSession(true);
        List<User> list = session.selectList("getUserList");
        list.forEach(System.out::println);
        final User user = list.get(1);
    }
}
