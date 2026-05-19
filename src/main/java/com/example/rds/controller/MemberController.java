package com.example.rds.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.rds.dto.RequestMember;
import com.example.rds.dto.ResponseGetMember;
import com.example.rds.service.MemberService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequiredArgsConstructor
public class MemberController {

	private final MemberService memberService;

	@PostMapping("/api/members")
	public ResponseEntity<Void> createMember(@RequestBody RequestMember requestMember) {
		log.info("[API - LOG] 회원 생성 요청 name={}",requestMember.getName());
		memberService.save(requestMember);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}

	@GetMapping("/api/members/{id}")
	public ResponseEntity<ResponseGetMember> getMember(@PathVariable Long id) {
		log.info("[API - LOG] 회원 조회 요청 id={}", id);
		return ResponseEntity.status(HttpStatus.OK).body(memberService.getMember(id));
	}
}
