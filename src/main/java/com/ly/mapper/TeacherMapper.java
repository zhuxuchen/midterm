package com.ly.mapper;

import com.ly.pojo.Teacher;

import java.util.List;

public interface TeacherMapper {
    //查询教师的授课信息
    Teacher selectTeacherAndCourseByNo(String tNo);
    //查询教师教的班级
    List<Teacher> selectTeacherAndClassByNo(String tNo);
}
