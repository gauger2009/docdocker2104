DROP DATABASE IF EXISTS coolapi21201 ;
CREATE DATABASE coolapi21201 CHARACTER SET UTF8 ;
USE coolapi21201 ;
CREATE TABLE cool_api (
                          api_id		BIGINT		AUTO_INCREMENT ,
                          api_name		VARCHAR(50) ,
                          api_desc			VARCHAR(50) ,
                          CONSTRAINT pk_api_id PRIMARY KEY(api_id)
) ;
INSERT INTO cool_api(api_name,api_desc) VALUES ('login',database()) ;
INSERT INTO cool_api(api_name,api_desc) VALUES ('getall',database()) ;
INSERT INTO cool_api(api_name,api_desc) VALUES ('getlist',database()) ;
INSERT INTO cool_api(api_name,api_desc) VALUES ('getemployybyid',database()) ;
INSERT INTO cool_api(api_name,api_desc) VALUES ('modifybyempid',database()) ;




SELECT api_id,api_name,api_desc FROM cool_api

-- 添加interface_parameter表中字段。 2021-06-07 21:54
alter table interface_parameter add column value text COMMENT '请求参数JSON';
alter table interface_parameter add column dev_operate_by varchar(36);
alter table interface_parameter add column test_operate_by varchar(36);
alter table interface_parameter add column operate_dt datetime(6) default CURRENT_TIMESTAMP(6);
alter table interface_parameter add column last_update_dt datetime(6) default CURRENT_TIMESTAMP(6) on UPDATE CURRENT_TIMESTAMP(6);