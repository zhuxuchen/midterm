package com.ly.pojo;

public class Classes {
    int classID;
    int year;
    String speciality;
    String className;
    String fullName;

    public int getClassID() {
        return classID;
    }

    public void setClassID(int classID) {
        this.classID = classID;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Classes{" +
                "classID=" + classID +
                ", year=" + year +
                ", speciality='" + speciality + '\'' +
                ", className='" + className + '\'' +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
