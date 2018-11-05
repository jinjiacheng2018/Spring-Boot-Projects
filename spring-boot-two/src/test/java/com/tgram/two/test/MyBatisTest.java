package com.tgram.two.test;

import java.util.List;

import com.tgram.two.service.StudentService;
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

    @Autowired
    private StudentService studentService;

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

    @Test
    public void test02(){
        long x = System.currentTimeMillis();

        if(1 != 1){
            System.out.println("**1**");
        }

        if(1 != 2){
            System.out.println("**2**");
        }

        for (int i=0;i<1000000;i++){}

        long x1 = System.currentTimeMillis();

        System.out.println("------------------------>: " + (x1 - x));
    }

    @Test
    public void test03(){
        long x = System.currentTimeMillis();

        // 写在一起代码简洁，而且还会优化性能
        if(1 != 1 || 1 != 2){
            System.out.println("**3**");
        }

        for (int i=0;i<1000000;i++){}

        long x1 = System.currentTimeMillis();

        System.out.println("------------------------>: " + (x1 - x));
    }

    /**
     * 面向切面编程测试方法
     */
    @Test
    public void test04(){
        System.out.println("目标方法...");
        List<Student> students = studentService.queryAllStudents();

        students.forEach(student ->{
            System.out.println(student);
        });
    }
}
