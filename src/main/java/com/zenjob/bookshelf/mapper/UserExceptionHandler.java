package com.zenjob.bookshelf.mapper;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.zenjob.bookshelf.exception.UserAlreadyExistsException;

@ControllerAdvice
@RestController
public class UserExceptionHandler {

	@ExceptionHandler(UserAlreadyExistsException.class)
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	public String UserAlreadyExistsHandler(UserAlreadyExistsException e) {
		return "The User Already Exists";
	}
	
}
