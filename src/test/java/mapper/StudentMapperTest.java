package mapper;

import mybatisUtils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.user.Student;
import java.util.Date;


/**
 * @author Hoaer
 * @version 1.0
 */
public class StudentMapperTest {
    @Test
    public void delectStudent(){
        final SqlSession sqlSession = MybatisUtils.getSqlSession();
        final StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        final int delectStudent = mapper.delectStudent(1);
        if (delectStudent>0){
            sqlSession.commit();
        }
        sqlSession.close();
    }
    @Test
    public void add(){
        final SqlSession sqlSession = MybatisUtils.getSqlSession();
        final StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        final Date date = new Date();
        final int add = mapper.add(new Student(1,"赵云",0,"英语",48.5,date));
        if(add>0){
            sqlSession.commit();
        }
        sqlSession.close();
    }
}
