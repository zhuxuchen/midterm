package com.ly.mapper;

import com.ly.pojo.Classes;

import java.util.List;

public interface ClassMapper {
    //通过classID查询老师
    List<Classes> selectClassAndTeacherById(int id);
}
