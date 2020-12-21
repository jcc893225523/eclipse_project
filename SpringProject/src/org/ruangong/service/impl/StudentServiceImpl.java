package org.ruangong.service.impl;

import org.ruangong.dao.IStudentDao;
import org.ruangong.dao.impl.StudentDaoImpl;
import org.ruangong.entity.Student;
import org.ruangong.service.IStudentService;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class StudentServiceImpl  implements IStudentService{
	IStudentDao studentDao = new StudentDaoImpl();
	
	@Transactional(readOnly=false,propagation=Propagation.REQUIRED)
	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
//		studentDao = null;
		studentDao.addstudent(student);
	}
	
	
	public void setStudentDao(IStudentDao studentDao) {
		this.studentDao = studentDao;
	}


	@Override
	public void deleteStudentByNo(int stuNo) {
		// TODO Auto-generated method stub
		System.out.println("É¾³ýÑ§Éú");
	}

	
}
