package com.ly.mybatistest;

import com.ly.mapper.StudentMapper;
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

    public static void deleteStudent(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper =sqlSession.getMapper(StudentMapper.class);
        int row =mapper.deleteStudent("20000000000");
        System.out.println("删除成功！受影响的行"+row);
        sqlSession.commit();
        sqlSession.close();
    }

    public static void updateStudent(){
        Student student = new Student();
        student.setsNo("20161202889");
        student.setsName("小王");
        student.setsGender("男");
        student.setSpecialityName("信息管理与信息系统");
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        System.out.println(mapper.updateStudent(student));
        sqlSession.commit();
        sqlSession.close();
    }

    public static void main(String[] args) {
        //addStudents();
        //deleteStudent();
        updateStudent();
    }
}
