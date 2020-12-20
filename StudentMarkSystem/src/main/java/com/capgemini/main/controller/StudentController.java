package com.capgemini.main.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.main.entities.Marks;
import com.capgemini.main.entities.Student;
import com.capgemini.main.entities.Teacher;
import com.capgemini.main.exception.InvalidIdException;
import com.capgemini.main.exception.NoDataException;
import com.capgemini.main.service.StudentServiceInterface;

@RestController
public class StudentController {
	
	
	@Autowired
	StudentServiceInterface studentService;
	
	@PostMapping("/teacher/{teacherId}/addStudent")
	public ResponseEntity<String> addStudentDetails(@RequestBody Student student, @PathVariable int teacherId,@PathVariable String marksId)
	{
		String result = null;
		student.setMarksOfEachStudent(new Marks(marksId,0,0,0,0,0));
		student.setTeacher(new Teacher(teacherId,"",0,""));
		Boolean status = studentService.addStudentDetails(student);
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
	
	

	@GetMapping("/teacher/getAllStudents/{id}")
	public ResponseEntity<List<Student>> getAllStudents(@PathVariable int id) throws NoDataException
	{
		List<Student> list = studentService.getAllStudents(id);
		if(list.isEmpty())
		{
			throw new NoDataException("No related Student Data");
		}
		return new ResponseEntity<List<Student>>(list,HttpStatus.OK);
	}
	
	@GetMapping("/teacher/{teacherId}/student/{id}")
	public ResponseEntity<Optional<Student>> getStudentDetails(@PathVariable int id) throws InvalidIdException
	{
		Optional<Student> list = studentService.getStudent(id);
		if(list==null)
		{
			throw new InvalidIdException("Invalid ID or No Data Exists");
		}
		return new ResponseEntity<Optional<Student>>(list,HttpStatus.OK);
	}
	
	@PutMapping("/teacher/{teacherId}/marks/{marksId}/updateStudent/{id}")
	public ResponseEntity<String> updateStudentDetails(@RequestBody Student student,@PathVariable int teacherId,@PathVariable String marksId,
			@PathVariable int id
 			)
	{
		String result = null;
		student.setMarksOfEachStudent(new Marks(marksId,0,0,0,0,0));
		student.setTeacher(new Teacher(teacherId,"",0,""));
		Boolean status = studentService.updateStudentDetails(student,id);
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
}
