#0 객체와 관계형 데이터베이스의 차이
=====================
1. 상속 --> DB에 저장할 객체에는 상속 관계를 쓰지 않는다.
2. 연관관계 -->
객체는 참조 사용 --> 단방향
테이블은 외래키 사용 --> 양방향
3. 데이터 타입
4. 데이터 식별 방법

#1 ORM
=====================
* Object-relational mapping (객체 관계 매핑)
* 객체는 객체대로 설계
* 관계형 데이터베이스는 관계형 데이터베이스대로 설계
* ORM 프레임워크가 중간에서 매핑
* 대중적인 언어에는 대부분 ORM 기술이 존재

#2 JPA를 왜 사용해야하는가?
=====================
- SQL 중심적인 개발에서 객체 중심으로 개발
- 생산성 (CRUD)
- 유지보수 (필드 변경 시, SQL은 JPA가 처리)
- 패러다임의 불일치 해결
  - 상속
  - 연관관계
  - 객체 그래프 탐색
  - JPA와 비교하기
- 성능
  - 1차 캐시와 동일성(Identity) 보장
    - 같은 트랜잭션 안에서는 같은 Entity 반환 (약간의 조회 성능 향상)
    - DB Isolation Level이 Read Commit이어도 Application에서 Repeatable Read 보장
  - 트랜잭션을 지원하는 쓰기 지연(transactional write-behind)
    - 트랜잭션을 커밋할 때까지 INSERT SQL을 모음
    <pre><code>transaction.begin(); // 트랜잭션 시작
    em.persist(memberA);
    em.persist(memberB);
    em.persist(memberC);
    
    transaction.commit(); // 트랜잭션 커밋
    </code></pre> 
    - JDBC BATCH SQL 기능을 사용해서 한번에 SQL 전송
  - 지연 로딩(Lazy Loading)
    - 지연 로딩 : 객체가 실제로 사용될 때 로딩
    - 즉시 로딩 : JOIN SQL로 한번에 연관된 객체까지 미리 조회
- 데이터 접근 추상화와 벤더 독립성
- 표준
