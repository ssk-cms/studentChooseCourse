package com.example.demo.entity;

/**
 * @Author: Seth
 * @Date: 2019/4/12 17:12
 * @Version 1.0
 */
public class TeacherSeeCourseList {

    private Integer id;
    private String studentName;
    private String studentColleage;
    private String courseName;
    private String chooseTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentColleage() {
        return studentColleage;
    }

    public void setStudentColleage(String studentColleage) {
        this.studentColleage = studentColleage;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getChooseTime() {
        return chooseTime;
    }

    public void setChooseTime(String chooseTime) {
        this.chooseTime = chooseTime;
    }

    @Override
    public String toString() {
        return "TeacherSeeCourseList{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", studentColleage='" + studentColleage + '\'' +
                ", courseName='" + courseName + '\'' +
                ", chooseTime='" + chooseTime + '\'' +
                '}';
    }
}
