package com.example.exception;

@SuppressWarnings("serial")
public class StudentNotFoundException extends RuntimeException{
	public StudentNotFoundException()
	{
		super();
	}
	public StudentNotFoundException(String message)
	{
		/**
		 * Parameterized constructor for custom message
		 */
		super(message);
	}
	public StudentNotFoundException(Throwable cause)
	{
		/**
		 * Parameterized constructor for Throwable
		 * @param cause
		 */
		super(cause);
	}
}