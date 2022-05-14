package com.ly.mapper;

import com.ly.pojo.Teacher;

import java.util.List;

public interface TeacherMapper {
    //查询教师的授课信息
    List<Teacher> selectTeacherByNo(String tNo);
}
