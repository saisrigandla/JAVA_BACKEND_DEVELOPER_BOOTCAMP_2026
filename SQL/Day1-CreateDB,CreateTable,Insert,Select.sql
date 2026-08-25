create database placement_db;
create table students( Id int, Name varchar(50), Age int, Course varchar(50));
insert into students(Id , Name, Age, Course)
values(1, 'Sai', 22, 'JBD'),
(2, 'Ram', 22, 'JBD'),
(3, 'charan', 18, 'JBD');
select * from students;
