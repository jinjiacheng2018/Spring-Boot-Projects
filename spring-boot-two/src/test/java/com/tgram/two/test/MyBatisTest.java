package com.tgram.two.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tgram.two.dao.StudentDao;
import com.tgram.two.entity.Student;

/**
 *<p> Description: 测试类信息 </p>
 *<p> Copyright: Copyright(c) 2018/11/4 </p>
 *<p> Company: 7qb </p>
 *
 *@author JinJiacheng
 *@Version 1.0 2018/11/4 23:31
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
//@PropertySource(value = {"classpath:application.yml"})
public class MyBatisTest {

    @Autowired
    private StudentDao studentDao;

    /**
     * 测试书库的连接：
     *  新的mysql数据的连接需要在url追加：?serverTimezone=UTC&characterEncoding=utf-8，不然报错
     */
    @Test
    public void test01(){
        List<Student> students = studentDao.queryAllStudents();

        students.forEach(student -> {
            System.out.println(student);
        });
    }
}
