package com.google.dearapp.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.google.dearapp.exceptionclasses.DuplicateEmailIdException;
import com.google.dearapp.exceptionclasses.DuplicatePhoneException;
import com.google.dearapp.exceptionclasses.InvalidUserIdException;
import com.google.dearapp.responsestructure.ResponseStructure;

@RestControllerAdvice
public class UserExceptionHandler {
	
	@ExceptionHandler(DuplicateEmailIdException.class)
	public ResponseStructure<String> duplicateEmailIdExceptionHandler(DuplicateEmailIdException e){
		ResponseStructure<String> structure=new ResponseStructure<>();
		structure.setStatus(HttpStatus.BAD_REQUEST.value());
		structure.setMessage("Already Account exist for the given Email");
		structure.setBody(e.getMessage());
		return structure;
	}
	
	@ExceptionHandler(DuplicatePhoneException.class)
	public ResponseStructure<String> DuplicatePhoneExceptionHandler(DuplicatePhoneException e){
		ResponseStructure<String> structure=new ResponseStructure<>();
		structure.setStatus(HttpStatus.BAD_REQUEST.value());
		structure.setMessage("Already Account exist for the given Phone number");
		structure.setBody(e.getMessage());
		return structure;
	}
	
	@ExceptionHandler(InvalidUserIdException.class)
	public ResponseStructure<String> InvalidUserIdExceptionHandler(InvalidUserIdException e){
		ResponseStructure<String> structure=new ResponseStructure<>();
		structure.setStatus(HttpStatus.NOT_FOUND.value());
		structure.setMessage("Invalid User Id it is not Present In Database");
		structure.setBody(e.getMessage());
		return structure;
	}

}
