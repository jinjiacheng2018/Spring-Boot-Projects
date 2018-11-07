package com.tgram.sboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *<p> Description: 描述信息 </p>
 *<p> Copyright: Copyright(c) 2018/11/7 </p>
 *<p> Company: 7qb </p>
 *
 *@author JinJiacheng
 *@Version 1.0 2018/11/7 17:48
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    private Integer stu_id; //编号

    private String stu_name; //姓名

    private Integer stu_age; //年龄

}
