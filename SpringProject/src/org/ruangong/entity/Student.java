package org.ruangong.entity;

import org.ruangong.factory.CourseFactory;
import org.ruangong.newinstance.HtmlCourse;
import org.ruangong.newinstance.ICourse;
import org.ruangong.newinstance.JavaCourse;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
public class Student {
	private int stuNo;
	private String stuName;
	private int stuAge;
	public int getStuNo() {
		return stuNo;
	}
	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public int getStuAge() {
		return stuAge;
	}
	public void setStuAge(int stuAge) {
		this.stuAge = stuAge;
	}
	@Override
	public String toString() {
		return "Student [stuNo=" + stuNo + ", stuName=" + stuName + ", stuAge=" + stuAge + "]";
	}
	
	
	
	public void learnJavaWithIoc(){
		ICourse course = new JavaCourse();
		course.learn();
	}
	
	public void learnHtmlWithIoc(){
		ICourse course = new HtmlCourse();
		course.learn();
	}
	
	public void learnAnyone(String name){
		ICourse course = CourseFactory.getCourse(name);
		course.learn();
	}
	public void learnAnyone2(String name){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ICourse course = (ICourse) context.getBean(name);
		course.learn();
	}
}