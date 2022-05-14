package com.ly.mybatistest;

import com.ly.pojo.Student;
import org.apache.ibatis.session.SqlSession;

public class test {
    public static void addStudents(){
        Student student = new Student();
        student.setsNo("20000000000");
        student.setsName("小明");
        student.setsGender("男");
        student.setSpecialityName("计算机科学与技术");
        student.setsDept("信息学院");
        student.setClassName("2018计算机科学与技术2班");
        SqlSession sqlSession =MybatisUtils.getSqlSession();
        int row = sqlSession.insert("com.ly.mapper.StudentMapper.addStudent",student);
        if (row > 0){
            System.out.println("添加成功！");
        }else {
            System.out.println("添加失败！");
        }
        sqlSession.commit();
        sqlSession.close();
    }

    public static void main(String[] args) {
        addStudents();
    }
}
