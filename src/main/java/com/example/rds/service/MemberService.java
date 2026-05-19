package com.example.rds.service;

import java.util.UUID;

import org.apache.catalina.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.rds.dto.RequestMember;
import com.example.rds.entity.Member;
import com.example.rds.repository.MemberRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberService {

	private final MemberRepository memberRepository;

	@Transactional
	public void save(RequestMember requestMember) {
		Member member = new Member(requestMember.getName(),requestMember.getAge(),requestMember.getMbti());
		memberRepository.save(member);
	}
}
