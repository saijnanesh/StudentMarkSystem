package com.capgemini.main.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(value=NoDataException.class)
	public ResponseEntity<Object> emptyOrderException(NoDataException dataObj, WebRequest web)
	{
		CustomEntityException err= new CustomEntityException(new Date(),dataObj.getMessage(),web.getDescription(false));
		return new ResponseEntity<Object>(err,HttpStatus.NOT_FOUND);
	}
	
	
	@ExceptionHandler
	public ResponseEntity<Object> InvalidDataIdException(InvalidIdException idObj, WebRequest web)
	{
		CustomEntityException err =new CustomEntityException(new Date(),idObj.getMessage(),web.getDescription(false));
		return new ResponseEntity<Object>(err,HttpStatus.NOT_FOUND);
	}
	
	
	
	
}
