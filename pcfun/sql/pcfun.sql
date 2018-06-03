set names utf8;
set foreign_key_checks = 0;
drop database if exists pcfun;

create database if not exists pcfun;
use pcfun;

drop table if exists login_user_transaction;

create table login_user_tansaction(
 	id int not null primary key auto_increment,
 	login_id varchar(16) unique,
 	login_pass varchar(16),
 	user_name varchar(50),
 	insert_date datetime,
 	updated_date datetime
);

drop table if exists item_info_transaction;

create table item_info_transaction(
	 id int not null primary key auto_increment,
	 item_name varchar(50),
	 item_price int,
	 item_stock int,
	 insert_date datetime,
	 updated_time datetime
);

drop table if exists user_buy_item_transaction;
	id int not null primary key auto_increment,
	item_tansaction_id int,
	total_price int,
	total_count int,
	user_master_id varchar(16),
	pay varchar(30),
	insert_date datetime,
	updated_date datetime
);

INSERT INTO item_info_tansaction(item_name,item_price,item_stock)VALUES("Dele corei7-7700HQ",162000,50);
INSERT INTO item_info_tansaction(item_name,item_price,item_stock)VALUES("Dele corei5-u",162000,50);
INSERT INTO item_info_tansaction(item_name,item_price,item_stock)VALUES("Dele corei7-7700HQ",162000,50);
INSERT INTO item_info_tansaction(item_name,item_price,item_stock)VALUES("tynabook corei7-7500u",162000,50);
INSERT INTO item_info_tansaction(item_name,item_price,item_stock)VALUES("tynabook corei7-7500u",162000,50);
INSERT INTO item_info_tansaction(item_name,item_price,item_stock)VALUES("tynabook corei7-7500u",162000,50);
INSERT INTO item_info_tansaction(item_name,item_price,item_stock)VALUES("tenovo corei7-7700HQ",162000,50);
INSERT INTO item_info_tansaction(item_name,item_price,item_stock)VALUES("tenovo corei7-7700HQ",162000,50);
INSERT INTO item_info_tansaction(item_name,item_price,item_stock)VALUES("tenovo corei7-7700HQ",162000,50);

INSERT INTO login_user_transaction(login_id,login_pass,user_name)VALUES("user","user01","test");
