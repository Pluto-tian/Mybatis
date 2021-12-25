package mapper;

import pojo.user.Student;

import java.util.Date;

/**
 * @author Hoaer
 * @version 1.0
 */
public interface StudentMapper {
    int delectStudent(int id);
    int add(Student student);


}
