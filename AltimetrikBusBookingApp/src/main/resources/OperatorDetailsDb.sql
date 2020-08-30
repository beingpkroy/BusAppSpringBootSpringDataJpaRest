DROP DATABASE IF EXISTS busdb;
CREATE DATABASE busdb; 
USE busdb;

DROP TABLE IF EXISTS operatordetails;
CREATE TABLE IF NOT EXISTS operatordetails (
  operatorid int(11) unsigned NOT NULL AUTO_INCREMENT,
  operatorname varchar(20) DEFAULT NULL,
 
  PRIMARY KEY (operatorid)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

INSERT INTO operatordetails (operatorid, operatorname) VALUES
	(1001, 'Shahrukh'   ),
	(1002, 'Amir'),
	(1004, 'Ranbir'),
	(1005, 'Ranbir Kapoor' ),
	(1006, 'kareena' ),
	(1007, 'Alia' ),
	(1008, 'Mahesh'),
	(1009, 'Sonam Kapoor'    ),
	(1010, 'Salmaan'    ),
	(1011, 'Neha'  ),
	(1012, 'Sanjay' ),
	(1013, 'Aditya'    );
commit;