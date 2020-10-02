# MySQL

### 什么是数据库

#### 一、引言

##### 1.1 现有的数据存储方式有哪些？

> - Java程序存储数据(变量、对象、数组、集和)，数据保存在内存中，属于瞬时状态存储。
> - 文件(File)存储数据，保存在硬盘上，属于持续状态存储

##### 1.2 以上存储方式存在哪些缺点

> - 没有数据类型的区分
> - 存储数据量级小
> - 没有访问安全限制
> - 没有备份、恢复机制

#### 二、数据库

##### 2.1 概念

​	数据库

> ​	数据库是按照数据结构来组织、存储和管理数据的仓库。是一个长期存储在计算机内的，有组织的、有共享的、统一管理的数据集合。

##### 2.2 数据库的分类

> - 网状结构数据库
> - 层次结构数据库
> - 关系结构数据库
> - 非关系型数据库

#### 三、数据库管理系统

##### 3.1 概念

> ​	数据库管理系统(DataBase Management System，DBMS)：指一种操作和管理数据库的大型软件，用于建立、使用和维护数据库，对数据库进行统一管理和控制，以保证数据库的安全性和完整性。用户通过数据库管理系统访问数据库中的数据。

##### 3.2 常见数据库管理系统

> - Oracle
> - DB2
> - SQL Server
> - SQLLite

#### 四、MySQL

##### 4.1 简介

> ​	MySQL是一个关系型数据库管理系统，由瑞典MySQL AB公司开发，属于Oracle旗下产品。MySQL是最流行的关系型数据库管理系统之一，在WEB应用方面，MySQL是最好的RDBMS(Relational Database Management System，关系型数据库管理系统)应用软件之一。

#### 五、SQL语言

##### 5.1 概念

>​	SQL(Structured Query Language)结构化查询语言，用于存取数据、更新查询和管理关系数据库系统的程序设计语言

- 经验：通常执行对数据库的“增删改查”，简称C (Create) R (read) U (Update) D (Delete)

##### 5.2 MySQL应用

> 对于数据库操作，需要在进入MySQL环境下进行指令输入，并在一句指令的末尾使用;结束  

##### 5.3 基本命令

> 查看MySQL中所有数据库

```mysql
mysql> SHOW DATABASES;
#显示当前MySQL中包含的所有数据库
```

> 创建自定义数据库

```mysql
mysql> CREATE DATABASE mydb1 
#创建mydb1数据库
mysql> CREATE DATABASE mydb2 CHARACTER SET gbk;
#创建数据库并设置编码为gbk
mysql> CREATE IF NOT EXISTS mydb4;
#如果mydb4不存在，则创建；如果存在，则不创建
```

>查看数据库创建信息

```mysql
mysql> SHOW CREATE DATABASE mydb2;
```

>修改数据库

``` mysql
mysql> ALTER DATABASE mydb2 CHARACTER SET gbk;
```

> 删除数据库

```mysql
mysql> DROP DABASE mydb1;
```

> 查看当前所使用的数据库

```mysql
mysql> select  database();
```

> 使用数据库

``` mysql
mysql> USE mydb1; 
```

#### 六、客户端工具

##### 6.1 Navicat

##### 6.2 SQLyog

#### 七、数据查询【重点】

 ##### 7.1 数据库表的基本结构

> 关系结构数据库是以表格(Table)进行数据存储

- 经验，执行查询语句返回的结果是一张虚拟表

##### 7.2 基本查询

> 语法：ECT 列名 FROM 表名

| 关键字 |                |
| ------ | -------------- |
| SELECT | 指定要查询的列 |
| FROM   | 指定要查询的表 |

###### 7.2.1 查询部分列

```mysql
#查询员工表中所有员工的编号、名字、邮箱
SELECT employee_id,first_name,email
FROM t_employee;
```

###### 7.2.2 查询所有列

```mysql
#查询员工表中的所有列名
SELECT 所有的列名 FROM t_employees;
SELECT * FROM t_employees;
```

- 注意：生产环境下，优先使用列名查询的方式。

###### 7.2.3 对列中的数据进行运算

```mysql
#查询员工表中所有员工的编号、名字、年薪
SELECT employee_id , first_name, salary*12
FROM t_employees;
```

| 算数运算符 | 描述  |
| ---------- | ----- |
| +          | ***** |
| -          | ***** |
| *          | ***** |
| /          | ***** |

###### 7.2.4 列的别名

> 列 as '列名'

###### 7.2.5 查询结果去重

> distinct 列名

##### 7.3 排序查询

> 语法：SELECT 列名 FROM ORDER BY 排序列[排序规则] 

| 排序规则 | 描述                 |
| -------- | -------------------- |
| ASC      | 对前面排序做升序排序 |
| DESC     | 对前面排序做降序排序 |

###### 7.3.1 依据单列排序

#### 7.4 条件查询

> 语法：SELECT 列名 FROM 表名 WHERE 条件

| 关键字    | 描述                                                     |
| --------- | -------------------------------------------------------- |
| WHERE条件 | 在查询结果中，筛选符合条件的查询结果，条件为布尔表达式。 |











### DML操作【重点】

#### 新增(insert)
> INSTER INTO 表名(列1，列2，列3...)VALUE(值1，值2，值3...);