package pojo.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

import java.util.Date;

/**
 * @author Hoaer
 * @version 1.0
 */
@Alias("student")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private int id;
    private String name;
    private int gender;
    private String subject;
    private double grade;
    private Date add_time;
}
