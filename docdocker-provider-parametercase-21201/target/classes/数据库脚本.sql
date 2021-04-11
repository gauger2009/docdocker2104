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