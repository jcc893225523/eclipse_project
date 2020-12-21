package org.ruangong.test;

import org.ruangong.dao.impl.StudentDaoImpl;
import org.ruangong.entity.AllCollectionType;
import org.ruangong.entity.Course;
import org.ruangong.entity.Student;
import org.ruangong.service.IStudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
//	public static void learnCourse(){
//		Student student = new Student();
//		student.learnJava();
//		student.learnHtml();
//	}
	public static void learnCourseWithFactory(){
		Student student = new Student();
		student.learnAnyone2("JavaCourse");
	}
	public static void testDI(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Course course = (Course) context.getBean("course1");
		System.out.println(course.toString());
	}
	public static void collectionDemo(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		AllCollectionType type = (AllCollectionType)context.getBean("collection");
		System.out.println(type);
	}
//	public static void zhujie(){
//		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		StudentDaoImpl sdi = (StudentDaoImpl) context.getBean("studentDao");
//		sdi.addstudent();
//	}
	//前置通知测试
	public static void testAOP(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		IStudentService studentService= (IStudentService) context.getBean("studentService");
		Student student = new Student();
		student.setStuNo(123);
		student.setStuName("李明");
		student.setStuAge(36);
		studentService.addStudent(student);
		studentService.deleteStudentByNo(1);
	}
	public static void main(String[] args){
//		Student student = new Student();
//		student.setStuNo(20173681);
//		student.setStuName("靳晨晨");
//		student.setStuAge(21);
//		System.out.println(student.toString());
		
//		ApplicationContext conext = new ClassPathXmlApplicationContext("applicationContext.xml");
//		Student student = (Student)conext.getBean("student");
//		System.out.println(student);
//		learnCourse();
//		learnCourseWithFactory();
//		testDI();
//		collectionDemo();
//		zhujie();
		testAOP();
	}
}
