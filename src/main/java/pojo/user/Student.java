package pojo.user;

import java.util.Date;

/**
 * @author Hoaer
 * @version 1.0
 */
public class Student {
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", subject='" + subject + '\'' +
                ", grade=" + grade +
                ", add_time='" + add_time + '\'' +
                '}';
    }

    private int id;
    private String name;
    private int gender;
    private String subject;
    private double grade;
    private Date add_time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public Date getAdd_time() {
        return add_time;
    }

    public void setAdd_time(Date add_time) {
        this.add_time = add_time;
    }

    public Student(int id, String name, int gender, String subject, double grade, Date add_time) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.subject = subject;
        this.grade = grade;
        this.add_time = add_time;
    }
}
