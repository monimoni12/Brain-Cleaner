<a href="https://www.braincleaner.site" target="_blank">
 <img src="https://github.com/user-attachments/assets/612e4564-b4fd-4786-a64e-a019d4f642d6"" alt="배너" width="100%"/>
 </a>
 
 <br/>
 <br/>
 
 # 0. Getting Started (시작하기)
 ```bash
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/

 :: Spring Boot ::                (v3.4.4)

 ```
🧠 [서비스 링크](https://www.braincleaner.site/)
 
 <br/>
 <br/>
 
 # 1. Project Overview (프로젝트 개요)
 - 프로젝트 이름: Brain Cleaner
 - 프로젝트 설명: 도파민 디톡스 경험 공유 및 인증 커뮤니티

 <br/>
 <br/>
 
 # 2. Team Members (팀원 및 팀 소개)
 | 유재현 | 이서영 | 이은서 | 최정인 |
 |:------:|:------:|:------:|:------:|
 | <img src="https://github.com/user-attachments/assets/c1c2b1e3-656d-4712-98ab-a15e91efa2da" alt="유재현" width="150"> | <img src="https://github.com/user-attachments/assets/78ec4937-81bb-4637-975d-631eb3c4601e" alt="이서영" width="150"> | <img src="https://github.com/user-attachments/assets/78ce1062-80a0-4edb-bf6b-5efac9dd992e" alt="이은서" width="150"> | <img src="https://github.com/user-attachments/assets/beea8c64-19de-4d91-955f-ed24b813a638" alt="최정인" width="150"> |
 | BE | BE | BE | BE |
 | [GitHub](https://github.com/mordor8378) | [GitHub](https://github.com/Si159521) | [GitHub](https://github.com/monimoni12) | [GitHub](https://github.com/bombab) |
 
 <br/>
 <br/>
 
 # 3. Key Features (주요 기능)
 - **회원가입**:
   - 회원가입 시 DB에 유저정보가 등록됩니다.
 
 - **로그인**:
   - 사용자 인증 정보를 통해 로그인합니다.

 - **프로필**:
   - 개인 프로필에서 닉네임, 프로필 사진 설정이 가능합니다.
   - 포인트 조회가 가능합니다.
   - 이번 주 인증 현황, 연속 인증일 수 조회가 가능합니다. 
   - 디톡스 희망 시간을 프로필에서 설정할 수 있습니다.
   - 다른 유저를 팔로우할 수 있습니다.
 
 - **도파민 디톡스 인증하기**:
   - 메인화면 [인증게시판]에서 게시글 작성을 통해 도파민 디톡스 인증할 수 있습니다.
   - 작성한 게시글을 수정하거나 삭제할 수 있습니다.
   - 다른 유저의 게시글에 좋아요, 댓글, 대댓글 작성을 할 수 있습니다.
   - 게시글을 작성하면 관리자 승인 이후에 포인트가 지급됩니다.
 
- **게시글 작성하기**:
   - 인증게시글 이외 정보공유게시글, 자유게시글 작성을 통해 다른 유저들과 소통하고 도파민디톡스에 유용한 정보를 얻어갈 수 있습니다.
   - 게시글을 작성하면 포인트가 지급됩니다.

- 회원별 등급제도
   - 인증게시글, 정보공유게시글, 자유게시글 작성을 통해 얻은 포인트가 누적되면 등업이 가능합니다.
   - 게시판 종류별 포인트는 다음과 같습니다.
      - 인증게시판 : 50점
      - 정보공유게시판 : 20점
      - 자유게시판 : 10점
   - (댓글 작성시 포인트 지급도 예정중에 있습니다.)
   - 회원 등급은 다음과 같습니다.
      - 디톡스새싹 : 0점
      - 절제수련생 : 100점
      - 집중탐험가 : 600점
      - 선명한의식 : 2000점      
      - 도파민파괴자 : 4500점
      - 브레인클리너 : 7500점

 - **포인트상점**:
   - 게시글을 작성하여 얻은 포인트를 차감시켜 귀여운 이모티콘을 교환할 수 있습니다. 
   - 구매한 이모티콘은 게시글과 댓글에서 사용할 수 있습니다. 
 
- **관리자**:
   - 대시보드에서 총 회원 수, 오늘 가입자, 승인 대기 인증 수, 오늘 인증 처리수, 처리 대기 신고 수, 오늘 처리 신고 수 조회할 수 있습니다.
   - 회원들의 정보를 열람하고 상태 (계정 활성, 계정 정지, 계정 삭제)를 변경할 수 있습니다.
   - 신고된 게시글을 검토하고 게시글 삭제 / 회원제재 / 신고 처리 / 신고 반 할 수 있습니다. 
   - 인증게시글을 검토하고 승인 / 반려 / 삭제할 수 있습니다. 
 
 <br/>
 <br/>
 
 # 4. Tasks & Responsibilities (작업 및 역할 분담)
 |  |  |  |
 |-----------------|-----------------|-----------------|
 | 유재현   |  <img src=" " width="100"> | <ul><li>회원 인증</li><li>일반 / 소셜 로그인, 토큰 관리 </li><li>메인 페이지 일부 구성요소</li></ul>     |
 | 이서영   |  <img src=" " width="100"> | <ul><li>메인 페이지 일부 구성요소</li><li>팔로우기능 개발</li><li>댓글 기능 개발</li></ul> |
 | 이은서   |  <img src=" " width="100">    |<ul><li>게시판 CRUD</li><li>카테고리별 목록 조회 및 검색 기능</li><li>포인트 상점 기능</li><li>댓글 기능 일부 및 좋아요 기능 </li><li>BrainCleaner🧠의 시그니처 디자인!✌🏻 </li></ul>  |
 | 최정인    |  <img src=" " width="100">    | <ul><li>관리자 관리 기능</li><li>포인트 자동 적립  / 등업 기능</li></ul>    |
 
 <br/>
 <br/>
 
 # 5. Technology Stack (기술 스택)

 ## 5.1 Language
[![Java](https://img.shields.io/badge/Java-007396?style=flat&logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![TypeScript](https://img.shields.io/badge/TypeScript-3178C6?style=flat&logo=typescript&logoColor=white)](https://www.typescriptlang.org/)
 <br/>
 
 ## 5.2 Frontend
[![Next.js](https://img.shields.io/badge/Next.js-white?style=flat&logo=next.js)](https://nextjs.org/)
 <br/>
 
 ## 5.3 Backend
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=flat&logo=springboot&logoColor=white)](https://spring.io/projects/spring-boot)
[![Spring Security](https://img.shields.io/badge/Spring_Security-6DB33F?style=flat&logo=spring-security&logoColor=white)](https://spring.io/projects/spring-security)
[![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=flat&logo=mysql&logoColor=white)](https://www.mysql.com/)
[![Swagger](https://img.shields.io/badge/Swagger-85EA2D?style=flat&logo=swagger&logoColor=black)](https://swagger.io/tools/swagger-ui/)
[![Lombok](https://img.shields.io/badge/Lombok-ED1C24?style=flat&logo=java&logoColor=white)](https://projectlombok.org/)
 <br/>

 ## 5.4 Infra
[![Amazon EC2](https://img.shields.io/badge/Amazon_EC2-FF9900?style=flat&logo=amazon-ec2&logoColor=white)](https://aws.amazon.com/ec2/)
[![Docker](https://img.shields.io/badge/Docker-2496ED?style=flat&logo=docker&logoColor=white)](https://www.docker.com/)
[![Nginx](https://img.shields.io/badge/Nginx-009639?style=flat&logo=nginx&logoColor=white)](https://www.nginx.com/)
[![Amazon S3](https://img.shields.io/badge/Amazon_S3-569A31?style=flat&logo=amazon-s3&logoColor=white)](https://aws.amazon.com/s3/)
 <br/>

 ## 5.5 Cooperation
[![Git](https://img.shields.io/badge/Git-F05032?style=flat&logo=git&logoColor=white)](https://git-scm.com/)
[![GitHub](https://img.shields.io/badge/GitHub-181717?style=flat&logo=github&logoColor=white)](https://github.com/)
[![Notion](https://img.shields.io/badge/Notion-000000?style=flat&logo=notion&logoColor=white)](https://www.notion.so/)
 <br/>
 
 # 6. Project Structure (프로젝트 구조)

## 6.1 Backend
 ```plaintext
be/
├── Dockerfile                      # 배포를 위한 컨테이너 구성
├── build.gradle.kts                # 의존성이 포함된 Gradle 빌드 설정
├── settings.gradle.kts             # Gradle 프로젝트 설정
├── gradlew                         # Unix용 Gradle 래퍼 스크립트
├── gradlew.bat                     # Windows용 Gradle 래퍼 스크립트
├── src/
│   └── main/
│       ├── java/com/dd/blog/       # 메인 패키지
│       │   ├── BlogApplication.java  # Spring Boot 애플리케이션
│       │   ├── domain/             # 기능별로 구성된 도메인
│       │   │   ├── admin/          # 관리자 패널 기능
│       │   │   ├── point/          # 포인트 시스템 기능
│       │   │   │   ├── point/      # 포인트 연산 기능
│       │   │   │   └── pointstore/ # 포인트 상점 기능
│       │   │   ├── post/           # 게시글 관련 기능
│       │   │   │   ├── category/   # 게시글 카테고리 
│       │   │   │   ├── comment/    # 댓글 기능
│       │   │   │   ├── post/       # 게시글 기능
│       │   │   │   ├── postlike/   # 좋아요 기능
│       │   │   │   └── verification/  # 게시글 인증 시스템
│       │   │   ├── report/         # 신고 시스템
│       │   │   └── user/           # 사용자 관리
│       │   │       ├── follow/     # 팔로잉/팔로워 기능
│       │   │       └── user/       # 사용자 기능
│       │   └── global/             # 글로벌 패키지
│       │       ├── app/            # 애플리케이션 설정
│       │       ├── aws/            # AWS S3
│       │       ├── config/         # 설정 클래스
│       │       ├── exception/      # 예외 처리
│       │       ├── init/           # 초기화 도구
│       │       ├── jpa/            # JPA 설정
│       │       ├── json/           # JSON 유틸리티
│       │       ├── rq/             # 요청/응답 추상화
│       │       ├── security/       # 보안 설정
│       │       └── utils/          # 도구
│       └── resources/
│           ├── application.yml     # 메인 애플리케이션 속성
│           ├── application-dev.yml  # 개발 환경 속성
│           ├── application-prod.yml # 프로덕션 환경 속성
│           └── application-test.yml # 테스트 환경 속성
└── gradle/
    └── wrapper/                    # Gradle 래퍼 파일
 ```
 
 <br/>
 <br/>
 
 # 7. Development Workflow (개발 워크플로우)
 ## 브랜치 전략 (Branch Strategy)
 우리의 브랜치 전략은 Git Flow를 기반으로 하며, 다음과 같은 브랜치를 사용합니다.
 
 - Dev Branch
   - 배포 가능한 상태의 코드를 유지합니다.
   - 모든 배포는 이 브랜치에서 이루어집니다.
 
 - {name} Branch
   - 팀원 각자의 개발 브랜치입니다.
   - 모든 기능 개발은 이 브랜치에서 이루어집니다.
 
 <br/>
 <br/>
 
 # 8. Coding Convention
 ## 문장 종료
 ```
 // 세미콜론(;)
 console.log("Hello World!");
 ```
 
 <br/>
 
 
 ## 명명 규칙
💻 Java 쪽 컨벤션
| 항목      | 표기법                | 예시                               | 설명             |
| ------- | ------------------ | -------------------------------- | -------------- |
| 클래스명    | PascalCase         | `PostCategory`, `UserController` | 파일 이름 = 클래스 이름 |
| 변수명/필드명 | camelCase          | `createdAt`, `userId`            | 첫 글자 소문자       |
| 메서드명    | camelCase          | `getUserName()`, `createPost()`  | 동사 중심          |
| 패키지명    | lowercase + 점(.)   | `com.example.post.entity`        | 전부 소문자         |
| 제네릭 타입  | PascalCase         | `List<Post>`                     | 클래스명 기준        |
| enum 상수 | UPPER\_SNAKE\_CASE | `PENDING`, `APPROVED_REJECTED`   | 고정된 상수 이름      |


🗄️ DB (JPA 매핑 관련) 컨벤션
| 항목         | 표기법         | 예시                          | 설명                 |
| ---------- | ----------- | --------------------------- | ------------------ |
| 테이블명       | snake\_case | `"post_category"`           | DB 테이블명에 맞춰 작성     |
| 컬럼명        | snake\_case | `"created_at"`, `"user_id"` | DB 컬럼명에 맞춰 작성      |
| 시퀀스명/제약조건명 | snake\_case | `post_id_seq`, `fk_user_id` | 대부분 snake\_case 사용 |
| 기본키        | snake\_case | `post_id`, `user_id`        | 보통 테이블명 + `_id`    |

 <br/>
 
 ## 블록 구문
 ```
 // 한 줄짜리 블록일 경우라도 {}를 생략하지 않고, 명확히 줄 바꿈 하여 사용한다
 // good
 if(true){
   return 'hello'
 }
 
 // bad
 if(true) return 'hello'
 ```
 
 <br/>
 
 ## 함수
 ```
 함수는 함수 표현식을 사용하며, 화살표 함수를 사용한다.
 // Good
 const fnName = () => {};
 
 // Bad
 function fnName() {};
 ```
 
 <br/>
 
 ## 태그 네이밍
 Styled-component태그 생성 시 아래 네이밍 규칙을 준수하여 의미 전달을 명확하게 한다.<br/>
 태그명이 길어지더라도 의미 전달의 명확성에 목적을 두어 작성한다.<br/>
 전체 영역: Container<br/>
 영역의 묶음: {Name}Area<br/>
 의미없는 태그: <><br/>
 ```
 <Container>
   <ContentsArea>
     <Contents>...</Contents>
     <Contents>...</Contents>
   </ContentsArea>
 </Container>
 ```
 
 <br/>
 
 ## 폴더 네이밍
 카멜 케이스를 기본으로 하며, 컴포넌트 폴더일 경우에만 파스칼 케이스로 사용한다.
 ```
 // 카멜 케이스
 camelCase
 // 파스칼 케이스
 PascalCase
 ```
 
 <br/>
 
 ## 파일 네이밍
 ```
 컴포넌트일 경우만 .jsx 확장자를 사용한다. (그 외에는 .js)
 customHook을 사용하는 경우 : use + 함수명
 ```
 
 <br/>
 <br/>
 
 # 9. 커밋 컨벤션
 ## 기본 구조
 ```
 type : subject
 
 body 
 ```
 
 <br/>
 
 ## type 종류
 ```
 feat : 새로운 기능 추가
 fix : 버그 수정
 refactor : 코드 리펙토링

 ```
 
 <br/>
 
 ## 커밋 이모지
 ```
 == 코드 관련
 📝	코드 작성
 🔥	코드 제거
 🔨	코드 리팩토링
 💄	UI / style 변경
 
 == 문서&파일
 📰	새 파일 생성
 🔥	파일 제거
 📚	문서 작성
 
 == 버그
 🐛	버그 리포트
 🚑	버그를 고칠 때
 
 == 기타
 🐎	성능 향상
 ✨	새로운 기능 구현
 💡	새로운 아이디어
 🚀	배포
 ```
 
 <br/>
 
 ## 커밋 예시
 ```
 == ex1
 ✨Feat: "회원 가입 기능 구현"
 
 SMS, 이메일 중복확인 API 개발
 
 == ex2
 📚chore: styled-components 라이브러리 설치
 
 UI개발을 위한 라이브러리 styled-components 설치
 ```
 
 <br/>
 <br/>
 
 # 10. 컨벤션 수행 결과
 <img width="100%" alt="코드 컨벤션" src="https://github.com/user-attachments/assets/0dc218c0-369f-45d2-8c6d-cdedc81169b4">
 <img width="100%" alt="깃플로우" src="https://github.com/user-attachments/assets/2a4d1332-acc2-4292-9815-d122f5aea77c">



