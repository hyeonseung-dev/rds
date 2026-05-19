package com.example.rds.dto;

import lombok.Getter;

@Getter
public class RequestMember {
	private final String name;
	private final int age;
	private final String mbti;

	public RequestMember(String name, int age, String mbti) {
		this.name = name;
		this.age = age;
		this.mbti = mbti;
	}
}
