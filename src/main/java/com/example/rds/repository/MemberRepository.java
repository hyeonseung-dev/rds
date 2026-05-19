package com.example.rds.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.rds.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
