package com.example.rds.common.exception;

import org.springframework.http.HttpStatus;

import lombok.Getter;

@Getter
public class ServiceException extends RuntimeException {
	/* HTTP 상태코드 응답을 담는 필드 */
	private final HttpStatus status;

	/* HTTP 상태코드 응답을 부모(RuntimeException)에 메시지 전달 */
	public ServiceException(HttpStatus status, String message) {
		super(message);
		this.status = status;
	}
}
