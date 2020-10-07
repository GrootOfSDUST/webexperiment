# Maven

### 一、引言

> 项目中jar包资源越来越多，jar包的管理越来越繁琐
>
> Java项目需要一个统一的便捷的管理方案

###  二、介绍

>Maven是一个基于项目对象模型（POM）的概念的Java开发的开源的项目管理工具。主要用来管理Java项目，进行依赖管理（jar包依赖管理）和项目构建（项目编译、打包、测试、部署）。此外还能分块开发，提高开发效率。

### 三、Maven安装

#### 3.1 下载Maven

#### 3.2 安装Maven

##### 3.2.1 解压

##### 3.2.2 环境变量

> maven依赖Java环境，所以要确保Java环境配置好
>
> maven本身有两个环境变量需要配置
>
> > - 'MAVEN_HOME = maven的安装目录'
> > - 'PATH = maven的安装目录下的bin目录'

### 四、Maven配置

#### 4.1 本地仓库

```xml
<settings xmlns="http://maven.apache.org/SETTINGS/1.0.0"
          xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
          xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.0.0 http://maven.apache.org/xsd/settings-1.0.0.xsd">
<localRepository>D://repository</localRepository>
    
<mirror>
     <id>alimaven</id>
     <name>aliyun maven</name>
     <url>http://maven.aliyun.com/nexus/content/groups/public/</url>
     <mirrorOf>central</mirrorOf>
</mirror>
    
<profile>     
    <id>JDK-1.8</id>       
    <activation>       
        <activeByDefault>true</activeByDefault>       
        <jdk>1.8</jdk>       
    </activation>       
    <properties>       
        <maven.compiler.source>1.8</maven.compiler.source>       
        <maven.compiler.target>1.8</maven.compiler.target>       
        <maven.compiler.compilerVersion>1.8</maven.compiler.compilerVersion>       
    </properties>       
</profile>
```

#### JDK配置

### 五、仓库

> 存储依赖的地方
>
> 仓库不仅存放依赖，而且每个依赖都有一个唯一标识(坐标)，供Java项目索取

#### 5.1 仓库分类

- 本地仓库
- 远程仓库
  - 中央仓库
  - 公共仓库
  - 私服

#### 5.2 本地仓库

> 即在 **setting.xml**中配置的目录
>
> 使用过了的依赖都会自动存储在本地仓库，后续可以复用

#### 5.3 远程仓库

##### 5.3.1 中央仓库

> Maven中央仓库是由Maven社区提供的仓库，不用任何配置，Maven中内置了中央仓库的地址
>
> 其中包含了绝大多数流行的开源Java构件
>
> [http://mevrepository.com/]()可以搜索需要的以来的相关信息（仓库搜索服务）
>
> [http://repo.maven.apache.org/maven2/]()中央仓库地址

##### 5.3.2 公共仓库**（重点）** 

> 除中央仓库之外，还有其他远程仓库

##### 5.3.3 私服

###  六、IDEA-Maven

#### 6.1 在IDEA中关联Maven

#### 6.2 导入依赖jar

> 建好项目后，需要导入需要的jar，要通过【坐标】
>
> 1. 每个构建都有自己的坐标（标识）= goupid + version = 项目标识+项目名+版本号
> 2. 在maven项目中只需要配置坐标，maven便会自动加载对应的依赖，删除坐标则会移除依赖

##### 6.3.1 查找依赖

> 依赖查找服务：https://mvnrepository.com/，获得依赖坐标，在maven项目中导入

#### 6.4 创建web项目

##### 6.4.1 打包方式

> pom.xml中设置\<packaging>war\<\packaging>