CREATE TABLE LIB_CULTURE(
	NUM INT AUTO_INCREMENT NOT NULL,
	ID VARCHAR(50) NOT NULL,
	TITLE VARCHAR(200) NOT NULL,
	CONTENT TEXT NULL NOT NULL,
	WRITEDATE TIMESTAMP DEFAULT NOW() NOT NULL,
	VIEW INT DEFAULT 0 NOT NULL,
	
	CATEGORY VARCHAR(50) NOT NULL,
	STARTDATE DATE NOT NULL,
	ENDDATE DATE NOT NULL,
	MAX INT NOT NULL,
	NOW INT DEFAULT 0 NOT NULL,
	
	CONSTRAINT PRIMARY KEY(NUM)
)

DROP TABLE LIB_CULTURE
SELECT * FROM LIB_CULTURE

-----------------------------------
게시판 공통영역
NUM - 글번호
ID - 아이디
TITLE - 글제목
CONTENT - 글내용
WRITEDATE - 글작성일
VIEW - 조회수

문화행사/방과후학교 공통영역
CATEGORY - 카테고리
STARTDATE - 시작일
ENDDATE - 종료일
MAX - 최대인원
NOW - 현재인원
-----------------------------------
INSERT INTO LIB_CULTURE(ID, TITLE, CONTENT, CATEGORY, STARTDATE, ENDDATE, MAX) VALUES('KSH', 'TITLE', 'CONTENT', 'CATEGORY', NOW(), NOW(), 20)
INSERT INTO LIB_CULTURE(ID, TITLE, CONTENT, CATEGORY, STARTDATE, ENDDATE, MAX) (SELECT ID, TITLE, CONTENT, CATEGORY, STARTDATE, ENDDATE, MAX FROM LIB_CULTURE)
