package com.tgram.one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import com.tgram.one.entity.TaskNotePic;
import org.junit.Test;

import com.tgram.one.entity.Student;

/**
 *<p> Description: 描述信息 </p>
 *<p> Copyright: Copyright(c) 2018/11/1 </p>
 *<p> Company: 7qb </p>
 *
 *@author JinJiacheng
 *@Version 1.0 2018/11/1 13:35
 */
//@SpringBootTest
public class JavaTestOne
{
    
    @Test
    public void test1()
    {
        List<Student> oldList = Arrays.asList(new Student(1, "Tom", 20),new Student(2, "Jack", 20), new Student(3, "Jim", 20));
        List<Student> newList = Arrays.asList(new Student(1,"Tom",20),new Student(4,"Tony",20),new Student(5,"King",20));
        
        Collection exist = new ArrayList(newList);
        
        exist.removeAll(oldList);
        List<Student> otherList = null;
        if (exist instanceof List)
        {
            otherList = (List<Student>) exist;
        }
        
        otherList.forEach(student -> {
            System.out.println("***1*** " + student);
        });
        
        Collection notExist = new ArrayList(oldList);
        notExist.removeAll(newList);
        
        List<Student> otherList2 = (List<Student>) notExist;
        otherList2.forEach(student -> {
            System.out.println("***2*** " + student);
        });
    }
    
    @Test
    public void test2()
    {
        Student student = new Student();
        student.setStu_name("Tom");
        student.setStu_age(10);

        Student student2 = new Student();
        student2.setStu_id(2);
        student.setStu_name("Jack");
        student.setStu_age(10);

        System.out.println(student.getStu_id());
        System.out.println(student2.getStu_id());
        System.out.println(student.getStu_id() != student2.getStu_id());
    }


    @Test
    public void test3() {
        List<Student> oldList = Arrays.asList(new Student(1, "Tom", 20),new Student(2, "Jack", 20),new Student(3, "Jim", 20));
        List<Student> newList = Arrays.asList(new Student(1, "Tom", 20),new Student(4, "Tony", 20),new Student(5, "King", 20));

        oldList.forEach(oldStu -> {
            int count = 0;
            for (Student stu:newList) {
                if(oldStu.getStu_id() != stu.getStu_id()){
                    count++;
                }
            }

            if(count==newList.size()){
                System.out.println(oldStu);
            }
        });
    }

    @Test
    public void test4_0() {
        List<TaskNotePic> oldPicList = Arrays.asList(new TaskNotePic(1L,150L,"xxxx","one.txt"),
                new TaskNotePic(2L,150L,"xxxx","one.txt"),new TaskNotePic(3L,150L,"xxxx","one.txt"));

        List<TaskNotePic> newPicList = Arrays.asList(new TaskNotePic(1L,150L,"xxxx","one.txt"),
                new TaskNotePic(4L,150L,"xxxx","one.txt"),new TaskNotePic(5L,150L,"xxxx","one.txt"));
    }

    @Test
    public void test4_1() {
        List<TaskNotePic> oldPicList = Arrays.asList(new TaskNotePic(1L,150L,"xxxx","one.txt"),
                new TaskNotePic(2L,150L,"xxxx","two.txt"),new TaskNotePic(3L,150L,"xxxx","three.txt"));

        List<TaskNotePic> newPicList = Arrays.asList(new TaskNotePic(1L,150L,"xxxx","one.txt"),
                new TaskNotePic(4L,150L,"xxxx","two.txt"),new TaskNotePic(5L,150L,"xxxx","three.txt"));

        // 获取old集合中存在，new集合中不存在的元素
        Collection oldCollection = new ArrayList(oldPicList);
        oldCollection.removeAll(newPicList);
        List<TaskNotePic> oldList = (List<TaskNotePic>) oldCollection;

        oldList.forEach(oldTastpic -> {
            System.out.println("**1**：" + oldTastpic);
        });

        // 获取new集合中存在，old集合中不存在的元素
        Collection newCollection = new ArrayList<>(newPicList);
        newCollection.removeAll(oldPicList);
        List<TaskNotePic> newList = (List<TaskNotePic>) newCollection;

        newList.forEach(newTastPic -> {
            System.out.println("**2**：" + newTastPic);
        });
    }

    @Test
    public void test4_2() {
        List<TaskNotePic> oldPicList = Arrays.asList(new TaskNotePic(1L,150L,"xxxx","one.txt"),
                new TaskNotePic(2L,150L,"xxxx","one.txt"),new TaskNotePic(3L,150L,"xxxx","one.txt"));

        List<TaskNotePic> newPicList = Arrays.asList(new TaskNotePic(1L,150L,"xxxx","one.txt"),
                new TaskNotePic(4L,150L,"xxxx","one.txt"),new TaskNotePic(5L,150L,"xxxx","one.txt"));

        List<TaskNotePic> insertList = new ArrayList<>();
        List<TaskNotePic> deleteList = new ArrayList<>();

        // 获取new存在，old集合中不存在的元素
        for (TaskNotePic taskNotePic : newPicList) {
            if(!oldPicList.contains(taskNotePic)){
                insertList.add(taskNotePic);
            }
        }

        // 遍历集合
        insertList.forEach(taskNotePic -> {
            System.out.println("**A**：" + taskNotePic);
        });

        // 获取old存在，new集合不存在的元素
        for (TaskNotePic taskNotePic : oldPicList) {
            if(!newPicList.contains(taskNotePic)){
                deleteList.add(taskNotePic);
            }
        }

        deleteList.forEach(taskNotePic -> {
            System.out.println("**B**：" + taskNotePic);
        });
    }
}
