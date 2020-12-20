package com.capgemini.main.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.main.entities.Student;
import com.capgemini.main.entities.Teacher;
import com.capgemini.main.exception.NoDataException;
import com.capgemini.main.service.StudentServiceInterface;
import com.capgemini.main.service.TeacherServiceInterface;

@RestController
public class TeacherController {
	
	@Autowired
	StudentServiceInterface studentService;
	
	@Autowired
	TeacherServiceInterface teacherService;
	
	
	@PostMapping("/teacher/addTeacherDetails")
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
	
	
	@GetMapping("/teacher/getAllDetails")
	public ResponseEntity<List<Teacher>> getAllDetails() throws NoDataException
	{
		List<Teacher> list = teacherService.getAllDetails();
		if(list.isEmpty())
		{
			throw new NoDataException("No related Teacher Data");
		}
		return new ResponseEntity<List<Teacher>>(list,HttpStatus.OK);
	}
	
	@GetMapping("/teacher/getTeacherDetails/{id}")
	public ResponseEntity<Optional<Teacher>> getTeacherDeatils(@PathVariable int id) throws NoDataException
	{
		Optional<Teacher> list = teacherService.getTeacherDetails(id);
		if(list == null)
		{
			throw new NoDataException("No Teacher is with that ID");
		}
		return new ResponseEntity<Optional<Teacher>>(list,HttpStatus.OK);
	}
	
	

}
