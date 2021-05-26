package com.capg.user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capg.beans.Student;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Start Spring Container
				ClassPathXmlApplicationContext spring = new ClassPathXmlApplicationContext("Spring.xml");
				
				// Get the Object from Spring 
				
				Student student = (Student)spring.getBean("student2");
				
				// use object as per business req.
				
				System.out.println(student);
				System.out.println(student.getsName());
				System.out.println(student.getCourse().getcName());
	}

}
