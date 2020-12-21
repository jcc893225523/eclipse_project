package org.ruangong.service;

import org.ruangong.entity.Student;

public interface IStudentService {
	void addStudent(Student student);
	void deleteStudentByNo(int stuNo);
}
