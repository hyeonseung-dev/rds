# 배포 주소

- EC2 Public IP
  - 43.201.70.91

# Health Check

http://43.201.70.91:8080/actuator/health

# Actuator Info 엔드포인트 URL

http://43.201.70.91:8080/actuator/info

# RDS 보안 그룹 스크린샷

<img width="1893" height="532" alt="image" src="https://github.com/user-attachments/assets/91fa3a34-9031-4f0d-8616-96ce96a8e067" />

## Presigned URL

[https://camp-health-hyeonseung-files.s3.ap-northeast-2.amazonaws.com/...](https://camp-health-hyeonseung-files.s3.ap-northeast-2.amazonaws.com/profile-images/34bb30e6-bca6-45f1-8583-04adce76db41_%E1%84%88%E1%85%A1%E1%86%BC%E1%84%8B%E1%85%B5.jpg?X-Amz-Security-Token=IQoJb3JpZ2luX2VjEBoaDmFwLW5vcnRoZWFzdC0yIkgwRgIhAKh9PleViUFCWf8aHuJlbuYagXyK%2Bkf3p8rFDWOwHAk%2FAiEAvVPW9%2BQDwO5rCG4hk4Aa2Ell5yj2i4meP%2BXvZWSNarUq0QUI4%2F%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FARAAGgw5Mzc2OTcyMDA2NTEiDAII1dxwnqKQ9jZNjyqlBVrQlBq0KPK8XlT6NPG209Vw4IHumjNuQwAeNsZo3kIZ0aSm%2FAYzhzr51IoVTJdX4mFedkOtttJh5Kb3D7eAuL5aVUSe5WecoAWX8J%2BAqo3%2B4%2FGBIAOO9npkF0n4NuQigUACMXPFg9k3FtNFrL%2FDap5e4e%2FC6KIcA3uePPcALFGqqZoLZbDqcgCfETY78W9731fkTzPwMURPSQeK8d3Q9WKehFa3jZNJwD%2B6LP1uV%2BEpQSCnBqRon0VjWT7jI307guVsBlGt8XK3xtPzB0%2FBpMmg2M64JbthUiBJEBcLYq%2Fb3WhvkwJXjDGeIXoAtEeRp%2FvoOoKzCRiDjxVoj%2Fb373R1MyqfA3bsszw%2BVYdGXFqtaazDR6zKEfaNdcfOK7EWVTsOiB9hfDUNhs4jns5V2xZ3aQ7hybCp1lesot1sStRmTQgqRCgoW0uHN0rBZlTCwEwlYAfKzKaLssmzpUfKvZcw50U%2BD1cFv3%2B9QFrDvL4PIu2UrcqbcbdRTm%2BVkjCDVbA741K7MprYWX%2FbnLqMiDBbAjRvAcpy3qRdGLNNXWqzmCvHCxA2qGPBIKJ7W6Nw5obXa%2FD3J1P2rMslAUUbXLXDWhYAwbgsnXy52bsDu8z764MUNFcLQzzSZT%2BF3M35wfQX315CzQJN5DxRJGa%2FYKDhrdHnArJYKZBQkiNCrnHLfzMjIEWBlw7XazB6CkU46P4ILrLNcP9yCoWHvEJzyyX2oKFuE%2BEhPcfMPN%2B75zgOLCL5LQo3nTUWO2WfHFqhuSS%2FX2oPQ5VMTeX4v%2BCiVo7gTjaH%2BhSf6PzGYi1JuZcdUZf7%2Fnj4wFbnkwA3%2FEnhw84O4HMxNRwiquorV0q%2FKibTAJZ2oRLFqoud%2BZ8CvVZTUsE903AupPgOdsgfgZcw5Vy8BR4UMLGjtNAGOrABAQcoXmk%2Bm24mSzVOTZW6g0VNwxX%2Fo%2FJasJUJ49DVdkUUC0%2Fswsr21026rg64FrdGYpxPR9xYMt%2BkL4UCHTRZ%2Bd%2BCjgiM9sNT9HpzXlAY6T0fO98iyDpJRoeGIz0QcBCIVqJQxOSRjaZPQrBi15U2rPFfJrA3TvSlKnqHfOV8ZWCsH6%2Bgo6o3IPnnK%2BgA2mo%2B0Zckx%2BoUlGD3BNuDrr5hfh5SD0AnwxnoKuUhSRNSiDU%3D&X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Date=20260520T023714Z&X-Amz-SignedHeaders=host&X-Amz-Credential=ASIA5UUY3ZIFWRWERP4J%2F20260520%2Fap-northeast-2%2Fs3%2Faws4_request&X-Amz-Expires=420&X-Amz-Signature=a29216e1ac8761c02aee073c7ed548a002e82e5adb3b5ed7599e9646154bb4d9)

## URL 만료 시간

- Presigned URL 유효기간: 7일

## IAM Role 적용

- Access Key를 코드에 직접 작성하지 않고,
  EC2 IAM Role을 통해 S3 접근 권한을 부여했습니다.

## 접근 성공 스크린샷

- 이미지 등록
  <img width="717" height="479" alt="image" src="https://github.com/user-attachments/assets/51a060aa-6cae-4147-a190-b7e61c288223" />
- 이미지 다운
  <img width="718" height="482" alt="image" src="https://github.com/user-attachments/assets/642545d9-40b8-47c5-b12b-9b85f454d55b" />

- 이미지 링크 화면
  <img width="500" height="471" alt="image" src="https://github.com/user-attachments/assets/03270346-ff93-4d95-bfc0-59cb8208019f" />
