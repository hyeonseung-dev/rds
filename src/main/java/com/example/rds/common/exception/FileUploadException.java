package com.example.rds.common.exception;

import org.springframework.http.HttpStatus;

public class FileUploadException extends ServiceException {
	public FileUploadException(String message) {
		super(HttpStatus.BAD_REQUEST, message);
	}
}
