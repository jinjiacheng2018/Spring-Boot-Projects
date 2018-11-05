package com.tgram.two;

import com.tgram.two.entity.Student;
import com.tgram.two.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {SpringBootTwoApplication.class})
public class SpringBootTwoApplicationTests {

	

	@Resource
	private StudentService studentService;

	@Test
	public void contextLoads() {
		List<Student> students = studentService.queryAllStudents();

		for (Student student : students) {
			System.out.println(student);
		}
	}

}
