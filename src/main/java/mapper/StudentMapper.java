package mapper;

import pojo.user.Student;

import java.util.List;
import java.util.Map;

/**
 * @author Hoaer
 * @version 1.0
 */
public interface StudentMapper {
    int deleteStudent(int id);

    int add(Student student);

    int update(Map<String, Object> map);

    List<Student> fuzzy_query(String string);

    List<Student> seletelimit(Map<String,Integer> map);
}
