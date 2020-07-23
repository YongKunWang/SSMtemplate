CREATE DATABASE SSM;

USE SSM;

SELECT DATABASE();

CREATE TABLE student(

	id INT PRIMARY KEY AUTO_INCREMENT,
	NAME VARCHAR(30),
	gender VARCHAR(3),
	score DOUBLE(4,1)
	#birthday date,
	#record timeStamp
)DEFAULT CHARACTER SET utf8;

INSERT INTO student VALUES(NULL, '李四', '男', 100.0); /*'2020-02-20', null);*/

SELECT * FROM student;

DROP TABLE student;
