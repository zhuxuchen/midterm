package com.ly.pojo;

public class Exprecord {
    String expNo;
    String sNo;
    String recordUid;
    int grade;
    String expContent;
    int state;
    int lines;

    public String getExpNo() {
        return expNo;
    }

    public void setExpNo(String expNo) {
        this.expNo = expNo;
    }

    public String getsNo() {
        return sNo;
    }

    public void setsNo(String sNo) {
        this.sNo = sNo;
    }

    public String getRecordUid() {
        return recordUid;
    }

    public void setRecordUid(String recordUid) {
        this.recordUid = recordUid;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getExpContent() {
        return expContent;
    }

    public void setExpContent(String expContent) {
        this.expContent = expContent;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getLines() {
        return lines;
    }

    public void setLines(int lines) {
        this.lines = lines;
    }

    @Override
    public String toString() {
        return "Exprecord{" +
                "expNo='" + expNo + '\'' +
                ", sNo='" + sNo + '\'' +
                ", recordUid='" + recordUid + '\'' +
                ", grade=" + grade +
                ", expContent='" + expContent + '\'' +
                ", state=" + state +
                ", lines=" + lines +
                '}';
    }
}
