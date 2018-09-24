/**
 * 
 */
package com.dksu99.exp1.web;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 *
 */
@ControllerAdvice
@RestController
public class ApiControllerAdvice {

	@ExceptionHandler(value = Exception.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public String exHandler(Exception ex) {
		return ex.getMessage();
	}
	
}
