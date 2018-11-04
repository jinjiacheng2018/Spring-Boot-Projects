package com.tgram.two.dao;

import org.apache.ibatis.annotations.Mapper;

import com.tgram.two.entity.Student;

import java.util.List;

/**
 *<p> Description: 描述信息 </p>
 *<p> Copyright: Copyright(c) 2018/11/4 </p>
 *<p> Company: 7qb </p>
 *
 *@author JinJiacheng
 *@Version 1.0 2018/11/4 23:26
 */
@Mapper
public interface StudentDao {

    List<Student> queryAllStudents();
}
