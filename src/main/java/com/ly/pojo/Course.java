package com.ly.pojo;

public class Course {
    String cNo;
    String cName;

    public String getcNo() {
        return cNo;
    }

    public void setcNo(String cNo) {
        this.cNo = cNo;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    @Override
    public String toString() {
        return "\nCourse{" +
                "cNo='" + cNo + '\'' +
                ", cName='" + cName + '\'' +
                '}';
    }
}
