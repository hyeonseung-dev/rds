# 배포 주소

- EC2 Public IP
  - 43.201.70.91

# Health Check

http://43.201.70.91:8080/actuator/health

# Actuator Info 엔드포인트 URL

http://43.201.70.91:8080/actuator/info

# RDS 보안 그룹 스크린샷

<img width="1893" height="532" alt="image" src="https://github.com/user-attachments/assets/91fa3a34-9031-4f0d-8616-96ce96a8e067" />

# Presigned URL

https://camp-health-hyeonseung-files.s3.ap-northeast-2.amazonaws.com/profile-images/029ec45e-f01d-4b15-b476-178c8365b2d0_%E1%84%88%E1%85%A1%E1%86%BC%E1%84%8B%E1%85%B5.jpg?X-Amz-Security-Token=IQoJb3JpZ2luX2VjEDwaDmFwLW5vcnRoZWFzdC0yIkgwRgIhAOzPLu7JlouGb0za%2BUMyEUvf3QslVS3DXMVC6Ojmq9sMAiEAwSw5WeidI3RwpcRLI%2BLINv%2BezO%2F7IHfxlqcLNIniTRgqyAUIBhAAGgw5Mzc2OTcyMDA2NTEiDM1d8eEPV6S7LdvvHyqlBdugYlry%2Bsx%2FFTQGwSRoSx0RQ12hd69kJpjg5%2B2Oqf850ki%2Fx6XQktL1NQVjnfpE1ShHI0V0fop46gjRIhC9qvHhweCna5Shli169PL3JWP4kOsx0du%2BA7XY2MvzaSgg9ywNpLFWcZ7Vg9GoRrlyTltuazO5iIGjFb2w6u3bcCdcVi3YE6t7w6yLbAtolEdiVKSDO0I1M%2BiQa6CIP%2F6xk31%2BAhkMtd4Pz0uYFf51RC5nZ3SP6sy%2BxrAcNlFxuJrD%2F7AgJ01Qh%2BS%2BHAo19foHALKTmRF26KdBIiNC%2BwbsYRz6mv1zwD4Wt1t1hsmLJu1WBoXyH%2FsjIts4BEdI12DiyQWetS1CS%2B%2FLwrcC91%2B%2Bm0R6wvBSMfuRiUcMgSJVW7vUrw0EumFJJYEf8aBTNI0UwPIX9nCJC7pr1QcLrX2n4cEpdScVhPigFNrSp%2FUefD8RZX4nxTtvbDMB3F79LvMEsRudNOmIDn2dm%2BSR6YxDfKr4sqm%2BfEPoxfSGZZxqdq4jtjGgnaNvJl0bO5Us%2FjoQjmK707vW1HG2i3jlQoI9eRglSFWA1wTZbB9536vsDFtQt5zzyv2BfuTs3ME2uZIZ4UyaGETYx5xH8hUpx5xW1nthCZg3P8ALnqxH1kGrEiPQu3cgtLbKV7SfEc5ipAKqUA3HTd4GMuuwpjknbr2%2BzvWNSxOZQdjypOQnz4pZJ0LtJSUVcERHxtiIl8eXxhX29L2YQQg95DE1pIg0jSmcy3VcnZyQpCwSf%2B%2FbZWiGhHDqhKp7O%2F4hWQKK8cJAnWKdfAbb3rUOcv%2BJcEsq%2B%2B584nn8x39zrtrubJV2FYULnXd4xK9l1NGLPu254orF05qdknqk0w6yoiTrQypPNEhs9I%2FKgSyDwIK8u747f8uWxNDb8GFfKHU%2BMJH0u9AGOrABrhKY5ocrXtCBlCVJ6FkgQObR9rKF%2FM4hTpu0I3xR4nUioSW1d0QJWcTX5RlxEZnHvNdh40MtQWcs5YNTFQ1AVVGyBJMaOl1MC%2BW6Jbkfn8jJB0Mq1%2FtKo4jaJPdSzj6MVxUOc74RtJ3mQAXKcVKmOWLr7cjjiyKPAGrK%2FwHXjLGiYdArdeJTP64H3rTAcH9q7B9cklkges6lIZ%2FbhrEzMtNpMDBeGlatw%2B6WdUpEvws%3D&X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Date=20260521T123426Z&X-Amz-SignedHeaders=host&X-Amz-Credential=ASIA5UUY3ZIF2KUNSGRU%2F20260521%2Fap-northeast-2%2Fs3%2Faws4_request&X-Amz-Expires=604800&X-Amz-Signature=f9992761889702ae8f23513a999a7131e9e7901054930dd0c7a82a7bc5a1ecc8

# URL 만료 시간

- Presigned URL 유효기간: 7일

# IAM Role 적용

- Access Key를 코드에 직접 작성하지 않고,
  EC2 IAM Role을 통해 S3 접근 권한을 부여했습니다.

# 접근 성공 스크린샷

- 이미지 등록
 <img width="717" height="479" alt="image" src="https://github.com/user-attachments/assets/51a060aa-6cae-4147-a190-b7e61c288223" />
 
- 이미지 다운
 <img width="718" height="482" alt="image" src="https://github.com/user-attachments/assets/642545d9-40b8-47c5-b12b-9b85f454d55b" />

- 이미지 링크 화면
 <img width="500" height="471" alt="image" src="https://github.com/user-attachments/assets/03270346-ff93-4d95-bfc0-59cb8208019f" />


# Github Actions 성공 이미지

<img width="1331" height="616" alt="image" src="https://github.com/user-attachments/assets/a574f7e3-aba9-4d00-aed0-69510188c917" />

# 검증
- 코드 수정 후 push, ec2 자동반영 확인
<img width="1321" height="244" alt="image" src="https://github.com/user-attachments/assets/6ebd0116-5d52-425b-96c4-94045d58f593" />

# EC2 터미널 이미지
- 테스트 API ec2 반영 검증 포함 
<img width="1429" height="82" alt="image" src="https://github.com/user-attachments/assets/d2bcc11a-2b9a-48a7-87b0-18d0dc149224" />



