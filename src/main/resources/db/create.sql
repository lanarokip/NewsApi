CREATE DATABASE company;
\c company
--int departid, String departmentName , int No_workers
CREATE TABLE if NOT EXISTS departments(id SERIAL PRIMARY KEY,departmentName VARCHAR, NoWorkers VARCHAR);
--CREATE TABLE if NOT EXISTS users(userid SERIAL PRIMARY KEY ,position VARCHAR, role VARCHAR, departmentid VARCHAR);
--CREATE TABLE if NOT EXISTS news(id SERIAL PRIMARY KEY, general_News VARCHAR, departMent_News VARCHAR, departmentid INTEGER);
--CREATE TABLE if NOT EXISTS news_department(id SERIAL PRIMARY KEY,departmentid INTEGER, newsid INTEGER );