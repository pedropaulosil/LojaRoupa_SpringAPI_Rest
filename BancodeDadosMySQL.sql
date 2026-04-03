CREATE database loja;
USE  loja;

CREATE TABLE roupa(
id int primary key auto_increment,
marca varchar(20),
tipo varchar(20),
tamanho varchar(3),
quantidade int,
preco decimal(6,2)
);

select * from roupa;