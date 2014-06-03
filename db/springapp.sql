CREATE DATABASE springapp;

GRANT ALL ON springapp.* TO springappuser@'%' IDENTIFIED BY 'pspringappuser';
GRANT ALL ON springapp.* TO springappuser@localhost IDENTIFIED BY 'pspringappuser';

use springapp;
create table clients (
	id varchar(9) PRIMARY KEY,
	CompleteName varchar(100),
	address varchar(100),
	entity varchar(15),
	inversion decimal
);

CREATE INDEX clients_description ON clients(CompleteName);


