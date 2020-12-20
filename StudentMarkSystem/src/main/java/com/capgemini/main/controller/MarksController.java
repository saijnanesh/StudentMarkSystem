package com.capgemini.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.main.entities.Marks;
import com.capgemini.main.entities.Student;
import com.capgemini.main.exception.InvalidIdException;
import com.capgemini.main.exception.NoDataException;
import com.capgemini.main.service.MarksServiceInterface;

@RestController
public class MarksController {
	
	
	@Autowired
	private MarksServiceInterface marksService;
	
	@PostMapping("marks/addMarks/{id}")
	public ResponseEntity<String> addMarks(@RequestBody Marks marks, @PathVariable int id) throws InvalidIdException
	{
		String result = null;
		
		boolean flag = marksService.addStudentMarks(marks,id);
		if(flag == false)
		{
			result = "Something is wrong!!!";
			throw new InvalidIdException(result);
		}
		else {
			
			result = "Marks Succesfully added";
			return new ResponseEntity<String>(result,HttpStatus.OK);
		}
	}
	
	@GetMapping("marks/getAllMarks")
	public ResponseEntity<List<Marks>> getAllMarks() throws NoDataException
	{
		List<Marks> list = marksService.getAllMarks();
		if(list.isEmpty())
		{
			throw new NoDataException("No related Marks Data");
		}
		return new ResponseEntity<List<Marks>>(list,HttpStatus.OK);
	}
	
	
	
}
