package com.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.beans.Student;
import com.springboot.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;

	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	public Student createStudent(Student student) {
		return studentRepository.save(student);
	}
	
	public Student getStudentById(Long id) {
		Optional<Student> student = studentRepository.findById(id);
		if(student.isPresent()) {
			return student.get();
		}
		return null;
	}
	
	public void deleteUserById(long id) {
		if(studentRepository.findById(id).isPresent()) {
			studentRepository.deleteById(id);
		}
	}
	
}




