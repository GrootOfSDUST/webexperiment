# JDBC

#### 一、引言

##### 1.1 如何操作数据库

> 使用客户端工具访问数据库，需要手工建立连接，输入拥核名和登录密码，编写SQL语句，点击执行，查看操作结果（结果集或受影响行数）

##### 1.2 实际开发中，会采用客户端操作数据库么？

> 实际开发中，当用户的数据发生改变时，不可能通过客户端执行操作SQL语句，因为操作量过大，无法保证效率和正确性。

#### 二、JDBC(Java Databases Connectivity)

##### 2.1 什么是JDBC？

> JDBC(Java Databases Connectivity)Java连接数据库，可以使用Java语言连接数据库完成CRUD操作。

##### 2.2 JDBC核心思想

> Java中定义了访问数据库的接口，可以为多种关系型数据库提供统一的访问方式，由数据库厂商提供驱动实现类(Driver数据库驱动)。

#### 三、JDBC开发步骤【重点】

##### 3.1 注册驱动

> 使用Class.forName("com.mysql.jdbcDriver");手动加载字节码文件到JVM中。

##### 3.2 连接数据库

> - 通过DriverManangement.getConnection(url, user, password)获取数据库连接对象
>   - URL:jdbc:mysql://localhost:3306/database
>   - username:root
>   - password:1234

```java
package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBC
{
    public static void main(String[] args)  throws Exception
    {
        //1. 注册驱动 加载驱动
        Class.forName("com.mysql.jdbc.Driver");

        //2. 获得连接
        String url = "jdbc:mysql://localhost:3306/companydb";
        String user = "root";
        String password = "1234";
        Connection connection = DriverManager.getConnection(url, user, password);
        if (connection != null)
        {
            System.out.println("连接数据库成功！");
        }
        else
        {
            System.out.println("连接数据库失败！");
        }
        
    }
}

```

##### 3.3 获取发送SQL的对象

>通过Connection对象获得Statement对象，用于对数据库进行通用访问

```java
Statement statement = conn.creatStatement(); 
```

##### 3.4 执行SQL语句

> 执行SQL语句并接受执行结果 