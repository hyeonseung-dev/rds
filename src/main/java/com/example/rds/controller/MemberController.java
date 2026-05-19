package com.example.rds.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.rds.dto.RequestMember;
import com.example.rds.dto.ResponseGetMember;
import com.example.rds.service.MemberService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class MemberController {

	private final MemberService memberService;

	@PostMapping("/api/members")
	public ResponseEntity<Void> createMember(@RequestBody RequestMember requestMember) {
		memberService.save(requestMember);
		return ResponseEntity.ok().build();
	}

	@GetMapping("/api/members/{id}")
	public ResponseEntity<ResponseGetMember> createMember(@PathVariable Long id) {
		return ResponseEntity.status(HttpStatus.OK).body(memberService.getMember(id));
	}
}
