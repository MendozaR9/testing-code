create database if not exists test;
use test;
create table person(
    age int NOT NULL,
    first_name varchar(20) not null ,
    last_name varchar(20) not null ,
    dob varchar(20) not null
);

insert into person(age, first_name, last_name, dob)
VALUE (22, 'Ryan','Mendoza','07-05-2000');