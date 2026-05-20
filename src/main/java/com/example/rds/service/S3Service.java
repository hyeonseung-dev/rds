package com.example.rds.service;

import io.awspring.cloud.s3.S3Template;
import lombok.RequiredArgsConstructor;
import software.amazon.awssdk.services.s3.presigner.S3Presigner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.UUID;

import com.example.rds.common.exception.FileUploadException;
import com.example.rds.common.exception.MemberNotFoundException;
import com.example.rds.entity.Member;
import com.example.rds.repository.MemberRepository;

@Profile("prod")
@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class S3Service {

	private static final Duration PRESIGNED_URL_EXPIRATION = Duration.ofDays(7);;

	private final S3Template s3Template;
	private final S3Presigner s3Presigner;
	private final MemberRepository memberRepository;

	@Value("${spring.cloud.aws.s3.bucket}")
	private String bucket;

	@Transactional
	public String uploadProfileImage(Long id, MultipartFile file) {

		Member member = memberRepository.findById(id)
			.orElseThrow(() -> new MemberNotFoundException("팀원을 찾을 수 없습니다."));


		try {
			String key = "profile-images/"
				+ UUID.randomUUID()
				+ "_"
				+ file.getOriginalFilename();

			s3Template.upload(
				bucket,
				key,
				file.getInputStream()
			);

			member.updateProfileImageKey(key);

			return key;

		} catch (IOException e) {
			throw new FileUploadException("파일 업로드 실패");
		}
	}

	public URL getDownloadUrl(Long id) {

		Member member = memberRepository.findById(id)
			.orElseThrow(() -> new MemberNotFoundException("팀원을 찾을 수 없습니다."));

		String key = member.getProfileImageKey();

		return s3Template.createSignedGetURL(
			bucket,
			key,
			PRESIGNED_URL_EXPIRATION
		);
	}
}