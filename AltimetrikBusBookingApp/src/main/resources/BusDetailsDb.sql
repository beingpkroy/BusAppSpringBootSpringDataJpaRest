DROP DATABASE IF EXISTS busdb;
CREATE DATABASE busdb; 
USE busdb;

DROP TABLE IF EXISTS busdetails;
CREATE TABLE IF NOT EXISTS busdetails (
  busnumber int(11) unsigned NOT NULL AUTO_INCREMENT,
  busname varchar(20) DEFAULT NULL,
 
  PRIMARY KEY (busnumber)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

INSERT INTO busdetails (busnumber, busname) VALUES
	(1001, 'Volvo'   ),
	(1002, 'Mini Bus'),
	(1004, 'Ac Bus'),
	(1005, 'Chair Car Bus' ),
	(1006, 'Maxi Bus' ),
	(1007, 'VIP Bus' ),
	(1008, 'Automatic Bus'),
	(1009, 'Delux Bus'    ),
	(1010, 'Sleeper Bus non Ac'    ),
	(1011, 'Mario Bus Ac'  ),
	(1012, 'Stuart Bus' ),
	(1013, 'Benz Bus'    );
commit;