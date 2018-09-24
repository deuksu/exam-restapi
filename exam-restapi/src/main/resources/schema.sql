-- schema
create table account (
	id int auto_increment primary key not null,
	name varchar(50),
	age int,
	job varchar(100)
);

-- data
insert into account(name,age,job) values ('홍길동1', 20, '개발자');
insert into account(name,age,job) values ('홍길동2', 21, '개발자');
insert into account(name,age,job) values ('홍길동3', 22, '개발자');
insert into account(name,age,job) values ('홍길동4', 23, '개발자');
insert into account(name,age,job) values ('홍길동5', 34, '개발자');
insert into account(name,age,job) values ('홍길동6', 35, '개발자');
insert into account(name,age,job) values ('홍길동7', 36, '개발자');