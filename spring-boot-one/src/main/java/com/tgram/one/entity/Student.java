package com.tgram.one.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *<p> Description: 学生实体类 </p>
 *<p> Copyright: Copyright(c) 2018/10/31 </p>
 *<p> Company: 7qb </p>
 *
 *@author JinJiacheng
 *@Version 1.0 2018/10/31 22:57
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    private Integer stu_id; //编号

    private String stu_name; //姓名

    private Integer stu_age; //年龄
}
