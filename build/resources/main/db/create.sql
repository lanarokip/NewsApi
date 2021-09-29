SET MODE PostgreSQL;
--CREATE DATABASE FORCE company;
--\c company


CREATE TABLE if NOT EXISTS users(id int PRIMARY KEY auto_increment ,position VARCHAR, role VARCHAR, department INTEGER);
CREATE TABLE if NOT EXISTS departments( id int PRIMARY KEY auto_increment ,departmentName VARCHAR, NoWorkers INTEGER);
CREATE TABLE if NOT EXISTS news(id int PRIMARY KEY auto_increment, General_News VARCHAR, DepartMent_News VARCHAR,departmentid INTEGER);
CREATE TABLE if NOT EXISTS departments_news(id int PRIMARY KEY auto_increment,departmentsId INTEGER, restaurantId INTEGER)
--CREATE TABLE if NOT EXISTS news_department(id SERIAL PRIMARY KEY,departmentid INTEGER, newsid INTEGER );