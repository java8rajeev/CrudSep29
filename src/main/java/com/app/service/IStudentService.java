package com.app.service;

import java.util.List;
import java.util.Optional;

import com.app.entity.Student;

public interface IStudentService {
	
	Integer saveStd(Student std);
	List<Student> getAll();
	Optional<Student> getOneStd(Integer id);
	void updateStd(Student std);
	void deleteStd(Integer id);
	boolean isPresent(Integer id);

}
