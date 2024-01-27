***

# 结论先行
**不推荐用于生产环境！！！**

**不推荐用于生产环境！！！**

**不推荐用于生产环境！！！**

***

# 目录说明

error-version：在 IDE 中运行正常，使用 GraalVM native image 打成二进制包之后运行异常

right-version：在 IDE 中运行正常，使用 GraalVM native image 打成二进制包之后运行也正常

***

# 运行项目

1. 前置依赖：[GraalVM 21 环境](https://www.graalvm.org/latest/reference-manual/native-image/#prerequisites)、Java 21、MySQL 8.0。
2. 使用 MySQL 8.0 的 root 用户登录
3. 执行以下 SQL 语句：

```mysql
drop database if exists mybatis_plus_native_demo;
drop user if exists 'mybatis_plus_native_demo'@'%';
create database mybatis_plus_native_demo default character set utf8mb4 collate utf8mb4_unicode_ci;
use mybatis_plus_native_demo;
create user 'mybatis_plus_native_demo'@'%' identified by 'x_q3WjlZ7t_1JjHv';
grant all privileges on mybatis_plus_native_demo.* to 'mybatis_plus_native_demo'@'%';
flush privileges;

CREATE TABLE `sys_tenant` (
  `id` bigint NOT NULL COMMENT '主键',
  `code` char(6) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '000000' COMMENT '租户代码，6 位字符',
  `name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '租户名称',
  `domain` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '域名地址',
  `contact_name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '联系人',
  `contact_number` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '联系电话',
  `expire_time` datetime NOT NULL DEFAULT '2100-01-01 00:00:00' COMMENT '过期时间',
  `max_user` int NOT NULL DEFAULT '-1' COMMENT '最大用户数量，<=0 表示不限',
  `remark` varchar(2000) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '备注',
  `delete_flag` bigint NOT NULL DEFAULT '0' COMMENT '删除标记，0 代表未删除，= id 代表已删除',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE KEY `unique-code-delete_flag` (`code`,`delete_flag`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='租户';
```

4. 在官方指定的命令行工具（比如 Windows 10 下需要使用 x64 Native Tools Command Prompt for VS 2022）中，进入 right-version 或 error-version 文件夹，然后执行以下命令：mvnw -Pnative clean native:compile
5. 如果顺利的话，就可以在 target 文件夹下看到 mybatis-plus-native-demo.exe 文件了。

***

# 参考项目

 [https://github.com/kazuki43zoo/mybatis-native-demo](https://github.com/kazuki43zoo/mybatis-native-demo) 

 [https://github.com/nieqiurong/mybatis-native-demo](https://github.com/nieqiurong/mybatis-native-demo)

