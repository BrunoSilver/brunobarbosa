/* a. Crie uma tabela Pais com os atributos id (int autoincrement) , nome(varchar 100),
populacao (bigint) e area (number 15,2). Carregue alguns países. Consulte a Wikipedia para
obter as informações de população e área. */
drop database if exists ex06;
create database if not exists Ex06;

use Ex06;
 


create table if not exists pais (



	id 		int auto_increment,
	nome		varchar(100),
	populacao	bigint,
	area		double(15,2),
	primary key(id)
	);

create table if not exists usuario (
    
    username VARCHAR(100) NOT NULL,
    passwd VARCHAR(100) NOT NULL,
    PRIMARY KEY (username))
    
    ENGINE = InnoDB
    DEFAULT CHARACTER SET = utf8;
    



INSERT INTO usuario(username, passwd) VALUES ('pedromesquitarachi@gmail.com', 'pedroximum');



INSERT INTO pais (nome, populacao, area) VALUES ('Alemanha', 2560, 2560);
INSERT INTO pais (nome, populacao, area) VALUES ('Brasil',1200, 7560);
INSERT INTO pais (nome, populacao, area) VALUES ('Belgica', 1600, 500);
INSERT INTO pais (nome, populacao, area) VALUES ('EUA', 8000, 98000);
INSERT INTO pais (nome, populacao, area) VALUES ('Canada', 569200, 400000);	

select * from Pais;