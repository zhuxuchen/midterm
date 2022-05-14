package com.ly.pojo;

import java.util.List;

public class Teacher {
    String tNo;
    String tName;
    String tPwd;
    String tDept;
    String logintime;
    List<Course> course;

    public String gettNo() {
        return tNo;
    }

    public void settNo(String tNo) {
        this.tNo = tNo;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public String gettPwd() {
        return tPwd;
    }

    public void settPwd(String tPwd) {
        this.tPwd = tPwd;
    }

    public String gettDept() {
        return tDept;
    }

    public void settDept(String tDept) {
        this.tDept = tDept;
    }

    public String getLogintime() {
        return logintime;
    }

    public void setLogintime(String logintime) {
        this.logintime = logintime;
    }

    public List<Course> getCourse() {
        return course;
    }

    public void setCourse(List<Course> course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tNo='" + tNo + '\'' +
                ", tName='" + tName + '\'' +
                ", tPwd='" + tPwd + '\'' +
                ", tDept='" + tDept + '\'' +
                ", logintime='" + logintime + '\'' +
                ", course=" + course +
                "}";
    }
}
