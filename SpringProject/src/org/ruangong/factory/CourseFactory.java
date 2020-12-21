package org.ruangong.factory;

import org.ruangong.newinstance.HtmlCourse;
import org.ruangong.newinstance.ICourse;
import org.ruangong.newinstance.JavaCourse;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CourseFactory {
	
	public static ICourse getCourse(String name){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		if(name.equals("java")){
			return (ICourse) context.getBean("JavaCourse");
		}else{
			return (ICourse) context.getBean("HtmlCourse");
		}
	}
}
