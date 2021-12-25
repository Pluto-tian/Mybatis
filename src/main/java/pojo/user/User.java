package pojo.user;

import java.util.Date;

/**
 * @author Hoaer
 * @version 1.0
 */

public class User {
    private int id;
    private String username;
    private String password;
    private String phone;
    private final Date registration_datetime;

    public User(int id, String username, String password, String phone, Date registration_datetime) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.registration_datetime = registration_datetime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getRegistration_datetime() {
        return registration_datetime;
    }
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", registration_datetime='" + registration_datetime + '\'' +
                '}';
    }
}
