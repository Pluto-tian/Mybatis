package mapper;

import mybatisUtils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.user.Student;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * @author Hoaer
 * @version 1.0
 */
public class StudentMapperTest {
    @Test
    public void deleteStudent(){
        final SqlSession sqlSession = MybatisUtils.getSqlSession();
        final StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        final int deleteStudent = mapper.deleteStudent(1);
        if (deleteStudent>0){
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
    @Test
    public void update(){
        final HashMap<String, Object> map = new HashMap<>();
        map.put("grade",28.9);
        map.put("id",5);
        final SqlSession sqlSession = MybatisUtils.getSqlSession();
        final StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        final int update = mapper.update(map);
        if (update>0){
            sqlSession.commit();
        }
        sqlSession.close();
    }
    @Test
    public void fuzzy_query(){
        final SqlSession sqlSession = MybatisUtils.getSqlSession();
        final StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        final List<Student> fuzzy_query = mapper.fuzzy_query("%张%");
        for (Student student : fuzzy_query) {
            System.out.println(student);
        }
        sqlSession.close();
    }
    @Test
    public void seletelimit(){
        final HashMap<String, Integer> map = new HashMap<>();
        map.put("startIndex",0);
        map.put("pageSize",4);
        final SqlSession sqlSession = MybatisUtils.getSqlSession();
        final StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        final List<Student> seletelimit = mapper.seletelimit(map);
        for (Student student : seletelimit) {
            System.out.println(student);
        }
    }
}
