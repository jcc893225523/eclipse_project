package org.ruangong.entity;

public class Course {
	private String cname;
	private int chour;
	private Teacher teacher;
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getChour() {
		return chour;
	}
	public void setChour(int chour) {
		this.chour = chour;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public Course() {

	}
	public Course(String cname, int chour, Teacher teacher) {
		super();
		this.cname = cname;
		this.chour = chour;
		this.teacher = teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	@Override
	public String toString() {
		return "Course [cname=" + cname + ", chour=" + chour + ", teacher=" + teacher.getName() + teacher.getAge()+"]";
	}
	
}
