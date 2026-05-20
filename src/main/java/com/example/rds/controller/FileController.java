package com.example.rds.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.net.URL;

import com.example.rds.dto.FileDownloadUrlResponse;
import com.example.rds.dto.FileUploadResponse;
import com.example.rds.service.S3Service;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/members")
public class FileController {

	private final S3Service s3Service;

	/**
	 * 프로필 이미지 업로드
	 */
	@PostMapping("/{id}/profile-image")
	public ResponseEntity<FileUploadResponse> uploadProfileImage(
		@PathVariable Long id,
		@RequestParam("file") MultipartFile file
	) {

		String key = s3Service.uploadProfileImage(id, file);

		return ResponseEntity.ok(
			new FileUploadResponse(key)
		);
	}

	/**
	 * 프로필 이미지 다운로드 URL 발급
	 */
	@GetMapping("/{id}/profile-image")
	public ResponseEntity<FileDownloadUrlResponse> getProfileImageDownloadUrl(
		@PathVariable Long id
	) {

		URL url = s3Service.getDownloadUrl(id);

		return ResponseEntity.ok(
			new FileDownloadUrlResponse(url.toString())
		);
	}
}