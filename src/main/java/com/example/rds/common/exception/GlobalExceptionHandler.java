package com.example.rds.common.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(ServiceException.class)
	public ResponseEntity<String> handleException(ServiceException e) {

		log.error("[ERROR] 서버 오류 발생", e);

		return ResponseEntity
			.status(e.getStatus())
			.body(e.getMessage());
	}
}
