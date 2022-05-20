package com.cg.exception;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class GlobalExceptionHandler {
	@Value(value="${data.exception.msg}")
	private String msg;
	
	@ExceptionHandler(value = RoomAlreadyFilledException.class)
	public ResponseEntity<String> RoomAlreadyFilledException(RoomAlreadyFilledException raf){
	        return new ResponseEntity<String>(msg, HttpStatus.CONFLICT);
	   
	}
	@Value(value="${data.exception.msg1}")
	private String msg1;
	
	@ExceptionHandler(value = NoSuchExistsException.class)
	public ResponseEntity<String> NoSuchExistsException(NoSuchExistsException dap){
	        return new ResponseEntity<String>(msg1, HttpStatus.CONFLICT);
	
	}
}
