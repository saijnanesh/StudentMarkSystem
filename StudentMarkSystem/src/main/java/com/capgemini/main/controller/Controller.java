package com.capgemini.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.main.entities.Student;
import com.capgemini.main.entities.Teacher;
import com.capgemini.main.exception.NoDataException;
import com.capgemini.main.service.StudentServiceInterface;
import com.capgemini.main.service.TeacherServiceInterface;

@RestController
public class Controller {
	
	@Autowired
	StudentServiceInterface studentService;
	
	@Autowired
	TeacherServiceInterface teacherService;
	
	@PostMapping("/Student/updateDetails")
	public ResponseEntity<String> addStudentDetails(@RequestBody Student student)
	{
		String result = null;
		Boolean status = studentService.updateStudentDetails(student);
		if(status)
		{
			result="Student Details Updated";
			return new ResponseEntity<String>(result,HttpStatus.OK);
		}
		else
		{
			result="Some error occured";
			return new ResponseEntity<String>(result,HttpStatus.BAD_REQUEST);
		}
	}
	@PostMapping("/Teacher/updateDetails")
	public ResponseEntity<String> addTeacherDetails(@RequestBody Teacher teacher)
	{
		String result = null;
		Boolean status = teacherService.addTeacherDetails(teacher);
		if(status)
		{
			result="Teacher Details Updated";
			return new ResponseEntity<String>(result,HttpStatus.OK);
		}
		else
		{
			result="Some error occured";
			return new ResponseEntity<String>(result,HttpStatus.BAD_REQUEST);
		}
	}
	
	
	@GetMapping("/Teacher/getAllDetails")
	public ResponseEntity<List<Teacher>> getAllDetails() throws NoDataException
	{
		List<Teacher> list = teacherService.getAllDetails();
		if(list.isEmpty())
		{
			throw new NoDataException("No related Teacher Data");
		}
		return new ResponseEntity<List<Teacher>>(list,HttpStatus.OK);
	}
	
	
	@GetMapping("/Student/getAllStudents")
	public ResponseEntity<List<Student>> getAllStudents() throws NoDataException
	{
		List<Student> list = studentService.getAllStudents();
		if(list.isEmpty())
		{
			throw new NoDataException("No related Student Data");
		}
		return new ResponseEntity<List<Student>>(list,HttpStatus.OK);
	}
	

}
