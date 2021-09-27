CREATE DATABASE company;
\c company
--int departid, String departmentName , int No_workers
CREATE TABLE if NOT EXISTS departments(id SERIAL PRIMARY KEY,departmentName VARCHAR, NoWorkers INTEGER);
CREATE TABLE if NOT EXISTS users(id SERIAL PRIMARY KEY ,position VARCHAR, role VARCHAR, departmentid INTEGER);
CREATE TABLE if NOT EXISTS news(id SERIAL PRIMARY KEY, General_News VARCHAR, DepartMent_News VARCHAR);
--CREATE TABLE if NOT EXISTS news_department(id SERIAL PRIMARY KEY,departmentid INTEGER, newsid INTEGER );