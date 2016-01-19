#创建数据库review默认编码utf8
CREATE DATABASE review DEFAULT CHARACTER SET utf8;
###################################################################
#创建user表,COLLATE utf8_bin可以使表中列的值区分大小写。
CREATE TABLE `user` (
   `id` int(16) NOT NULL AUTO_INCREMENT,
   `nickname` varchar(24) DEFAULT NULL COMMENT '昵称',
   `sex` char(1) DEFAULT NULL COMMENT '性别:0-女;1-男',
   `birthday` date DEFAULT NULL COMMENT '生日',
   `address` varchar(256) DEFAULT NULL COMMENT '地址',
   `email` varchar(64) DEFAULT NULL COMMENT '电子邮箱',
   `mobile` varchar(32) DEFAULT NULL COMMENT '手机号码',
   PRIMARY KEY (`id`)
 ) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE utf8_bin;
 #用户表初始化数据
 insert into user values(1,'管理员','1','1985-01-05','北京市海淀区马甸冠城园8号冠海大厦14层视信世纪科技','zhuani21@163.com','15810135202');
 ###################################################################
 #权限表
 #登陆权限表，其中user_id外键,是user表的主键
 CREATE TABLE `login_auth` (
   `id` int(16) NOT NULL AUTO_INCREMENT,
   `user_id` int(16) NOT NULL COMMENT '用户id',
   `username` varchar(24) COLLATE utf8_bin NOT NULL COMMENT '用户名',
   `password` varchar(24) COLLATE utf8_bin NOT NULL COMMENT '密码',
   `status` tinyint(1) NOT NULL DEFAULT '1' COMMENT '状态：1-有效；0-无效。 默认值1',
   PRIMARY KEY (`id`),
   UNIQUE KEY `login_user_id` (`user_id`)
 ) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin
 #登陆权限表初始化数据
 insert into login_auth (user_id,username,password) values (1,'admin','1234');
 ###################################################################
 #创建code表，
 CREATE TABLE `code` (
   `id` int(16) NOT NULL AUTO_INCREMENT,
   `type` varchar(50) NOT NULL COMMENT '类型',
   `code` varchar(35) NOT NULL COMMENT '编码',
   `name` varchar(200) DEFAULT NULL COMMENT '名称',
   `parent_id` int(16) DEFAULT NULL COMMENT '上级编码',
   PRIMARY KEY (`id`),
   UNIQUE KEY `type` (`type`,`code`)
 ) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE utf8_bin;
#初始化code表的数据
insert into code (type,code,name) values ('sex','-','');
insert into code (type,code,name) values ('sex','0','女');
insert into code (type,code,name) values ('sex','1','男');
###################################################################
#创建task表,(未执行)
CREATE TABLE `task` (
   `id` int(16) NOT NULL AUTO_INCREMENT,
   `user_id` int(16) NOT NULL COMMENT '用户id',
   `review_type` int(1) NOT NULL COMMENT '复习类型，不同的类型对应不同的复习方式',
   `description` varchar(1000) COMMENT '作业描述',
   `task_link` varchar(300) COMMENT '作业网络地址',
   `status` tinyint(1) NOT NULL DEFAULT '1' COMMENT '状态：1-有效；0-无效。 默认值1',
   PRIMARY KEY (`id`),
   UNIQUE KEY `login_user_id` (`user_id`)
 ) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin

###################################################################
#创建sub_task表(未执行) 增加了task表，自动根据review_type生产sub_type的数据。
###################################################################
#创建复习类型表review_type(未执行)
###################################################################
###################################################################
###################################################################
###################################################################
###################################################################
###################################################################
###################################################################
###################################################################
###################################################################
###################################################################