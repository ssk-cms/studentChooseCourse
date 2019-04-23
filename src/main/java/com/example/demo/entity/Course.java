package com.example.demo.entity;

/**
 * @Author: Seth
 * @Date: 2019/4/8 13:42
 * @Version 1.0
 */
public class Course {

    private Integer id;
    private Integer teacherId;
    private String name;
    private String time;
    private Integer status;
    private String updateTime;
    private Integer maxStudentNumber;
    private Integer studentNumber;

    public Integer getMaxStudentNumber() {
        return maxStudentNumber;
    }

    public void setMaxStudentNumber(Integer maxStudentNumber) {
        this.maxStudentNumber = maxStudentNumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }



    public Integer getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(Integer studentNumber) {
        this.studentNumber = studentNumber;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", teacherId=" + teacherId +
                ", name='" + name + '\'' +
                ", time='" + time + '\'' +
                ", status=" + status +
                ", updateTime='" + updateTime + '\'' +
                ", maxStudentNumber=" + maxStudentNumber +
                ", studentNumber=" + studentNumber +
                '}';
    }
}
