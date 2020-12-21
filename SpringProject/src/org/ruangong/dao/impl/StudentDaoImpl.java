package org.ruangong.dao.impl;

import org.ruangong.dao.IStudentDao;
import org.ruangong.entity.Student;
import org.springframework.stereotype.Repository;
@Repository("studentDao")
public class StudentDaoImpl implements IStudentDao{
	@Override
	public void addstudent(Student student) {
		// TODO Auto-generated method stub
		if(student!=null)
		System.out.println("增加学生...");
	}
}
