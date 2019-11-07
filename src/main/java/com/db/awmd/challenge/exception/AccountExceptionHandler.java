package com.db.awmd.challenge.exception;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AccountExceptionHandler {
	
	private static Logger log = LoggerFactory.getLogger(AccountExceptionHandler.class);
	
	@ExceptionHandler(DuplicateAccountIdException.class)
	public String handleDuplicateAccountIdException(HttpServletRequest request, Exception ex){
		log.info("Duplicate Account Id Exception Occured:: URL="+request.getRequestURL());
		return "Duplicate Account Id Error";
	}

}
