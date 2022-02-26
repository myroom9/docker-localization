# 사용법

1. boorJar task로 jar 파일을 생성한다
2. root directory 하위에 jar파일을 옮긴다
- 이름은 상관없음
3. 이미 등록된 application docker image가 존재한다면, 먼저 삭제를 진행한다
4. docker-compose up으로 실행하면 가능

### db tip
1. db connection host는 db container 명으로 명시해줘야함
2. docker desktop에서 뭐로 떴는지 확인 후 입력해도됨
