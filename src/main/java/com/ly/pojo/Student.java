package com.ly.pojo;

public class Student {
    String sNo;
    String sName;
    String sGender;
    String specialityName;
    String sDept;
    String className;

    public String getsNo() {
        return sNo;
    }

    public void setsNo(String sNo) {
        this.sNo = sNo;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsGender() {
        return sGender;
    }

    public void setsGender(String sGender) {
        this.sGender = sGender;
    }

    public String getSpecialityName() {
        return specialityName;
    }

    public void setSpecialityName(String specialityName) {
        this.specialityName = specialityName;
    }

    public String getsDept() {
        return sDept;
    }

    public void setsDept(String sDept) {
        this.sDept = sDept;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sNo='" + sNo + '\'' +
                ", sName='" + sName + '\'' +
                ", sGender='" + sGender + '\'' +
                ", specialityName='" + specialityName + '\'' +
                ", sDept='" + sDept + '\'' +
                ", className='" + className + '\'' +
                '}';
    }
}
