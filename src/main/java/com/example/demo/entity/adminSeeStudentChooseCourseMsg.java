package com.example.demo.entity;

/**
 * @Author: Seth
 * @Date: 2019/4/19 13:52
 * @Version 1.0
 */
public class adminSeeStudentChooseCourseMsg {

    private String studentName;
    private String teacherName;
    private String courseName;
    private String chooseTime;
    private String maxStudentNumber;
    private String chooseCourseStudentNumber;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
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

    public String getMaxStudentNumber() {
        return maxStudentNumber;
    }

    public void setMaxStudentNumber(String maxStudentNumber) {
        this.maxStudentNumber = maxStudentNumber;
    }

    public String getChooseCourseStudentNumber() {
        return chooseCourseStudentNumber;
    }

    public void setChooseCourseStudentNumber(String chooseCourseStudentNumber) {
        this.chooseCourseStudentNumber = chooseCourseStudentNumber;
    }

    @Override
    public String toString() {
        return "adminSeeStudentChooseCourseMsg{" +
                "studentName='" + studentName + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", courseName='" + courseName + '\'' +
                ", chooseTime='" + chooseTime + '\'' +
                ", maxStudentNumber='" + maxStudentNumber + '\'' +
                ", chooseCourseStudentNumber='" + chooseCourseStudentNumber + '\'' +
                '}';
    }
}
