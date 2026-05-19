package com.example.rds.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.rds.common.exception.MemberNotFoundException;
import com.example.rds.dto.RequestMember;
import com.example.rds.dto.ResponseGetMember;
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

	public ResponseGetMember getMember(Long id) {

		Member member = memberRepository.findById(id).orElseThrow(
			() -> new MemberNotFoundException("존재하지 않는 멤버입니다.")
		);

		return new ResponseGetMember(member.getName(),member.getAge(),member.getMbti());
	}
}
