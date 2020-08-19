package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.beans.Student;
import com.springboot.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/Students")
	public List<Student> getAllStudents(){
		return studentService.getAllStudents();
	}

	@PostMapping("/Student")
	public Student createStudent(@RequestBody Student student) {
		return studentService.createStudent(student);
	}
	
	@GetMapping("/Student/{id}")
	public Student getStudentById(@PathVariable("id") Long id){
		return studentService.getStudentById(id);
	}
	
	@DeleteMapping("/Student/{id}")
	public void deleteUserById(@PathVariable Long id) {
		studentService.deleteUserById(id);
	}
	
	
}
