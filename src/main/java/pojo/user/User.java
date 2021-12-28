package pojo.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author Hoaer
 * @version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private int id;
    private String username;
    private String password;
    private String phone;
    private Date registration_datetime;
}
