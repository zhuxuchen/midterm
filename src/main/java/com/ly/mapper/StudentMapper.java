package com.ly.mapper;

import com.ly.pojo.Student;

import java.util.List;

public interface StudentMapper {
    //增加一条学生的信息
    int addStudent(Student student);
    //更新学生的信息
    int updateStudent(Student student);
    //删除学生的信息
    int deleteStudent(String sNo);
    //查询学生及exprecord
    List<Student> selectStudentAndExp();

}
