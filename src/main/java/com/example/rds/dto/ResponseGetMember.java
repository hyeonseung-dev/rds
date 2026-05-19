package com.example.rds.dto;

import lombok.Getter;

@Getter
public class ResponseGetMember {
	private final String name;
	private final int age;
	private final String mbti;

	public ResponseGetMember(String name, int age, String mbti) {
		this.name = name;
		this.age = age;
		this.mbti = mbti;
	}
}
