package com.example.exception;

import java.time.LocalDateTime;

import com.example.bean.StudentErrorResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StudentExceptionHandler extends RuntimeException {
	/**
	 *  Method to handle seedNotFoundException
	 * @param exception
	 * @return ResponseEntity
	 */
	@ExceptionHandler
	public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException exception)
	{
		StudentErrorResponse error = new StudentErrorResponse();
		error.setStatus(HttpStatus.NOT_FOUND.value());
		error.setMessage(exception.getMessage());
		error.setTimestamp(LocalDateTime.now());
		return new ResponseEntity<StudentErrorResponse>(error,HttpStatus.NOT_FOUND);
	}
}