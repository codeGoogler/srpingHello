### 一，Spring Boot 介绍
Spring Boot不是一个新的框架，默认配置了多种框架使用方式，使用SpringBoot很容易创建一个独立运行（运行jar，内嵌Servlet）、准生产级别的基于Spring框架的项目，它可以不用或者说只需要使用很少的Spring配置。

Spring Boot 是由 Pivotal 团队提供的全新框架，其设计目的是用来简化新 Spring 应用的初始搭建以及开发过程。该框架使用了特定的方式来进行配置，从而使开发人员不再需要定义样板化的配置。就像 Maven 整合了所有的 Jar 包，Spring Boot 整合了所有的框架。


### 一、概括
##### 1，如果使用 Spring 开发一个"HelloWorld"的 web 应用：

- 创建一个 web 项目并且导入相关 jar 包。SpringMVC Servlet
- 创建一个 web.xml 
- 编写一个控制类(Controller)
- 需要一个部署 web 应用的服务器 如 tomcat

##### 2，Spring Boot 特点：
-  Spring Boot 设计目的是用来简化新 Spring 应用的初始搭建以及开发过程。
-  嵌入的 Tomcat，无需部署 WAR 文件
-  Spring Boot 并不是对 Spring 功能上的增强，而是提供了一种快速使用 Spring 的方
式。

### 二，构建 Spring Boot 项目及启动器讲解
**1.使用 maven 构建 SpringBoot 项目**

![](https://img-blog.csdnimg.cn/20190605144418127.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2FuZHJvaWRzdGFyamFjaw==,size_16,color_FFFFFF,t_70)


![ ](https://img-blog.csdnimg.cn/20190605144518881.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2FuZHJvaWRzdGFyamFjaw==,size_16,color_FFFFFF,t_70)

![](https://img-blog.csdnimg.cn/20190605144538828.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2FuZHJvaWRzdGFyamFjaw==,size_16,color_FFFFFF,t_70)
**2.注入 SpringBoot 启动坐标**
![ ](https://img-blog.csdnimg.cn/20190605144554603.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2FuZHJvaWRzdGFyamFjaw==,size_16,color_FFFFFF,t_70)
**3.也可以手动修改 pom 文件 将 jdk 的版本**
![](https://img-blog.csdnimg.cn/20190605144612900.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2FuZHJvaWRzdGFyamFjaw==,size_16,color_FFFFFF,t_70)

**4.SpringBoot 启动器介绍：**

所谓的 springBoot 启动器其实就是一些 jar 包的集合。SprigBoot 一共提供 4种 启动器。

4.1 spring-boot-starter-web

支持全栈式的 web 开发，包括了 romcat 和 springMVC 等 jar

4.2 spring-boot-starter-jdbc

支持 spring 以 jdbc 方式操作数据库的 jar 包的集合

4.3 spring-boot-starter-redis

支持 redis 键值存储的数据库操作

### 三，Spring Boot 入门 编写HelloWorld
**1.编写返回 HelloWorld 的 Controller**
![](https://img-blog.csdnimg.cn/20190605144623962.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2FuZHJvaWRzdGFyamFjaw==,size_16,color_FFFFFF,t_70)
**2.启动 SpringBoot 编写启动类**
![](https://img-blog.csdnimg.cn/20190605144635423.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2FuZHJvaWRzdGFyamFjaw==,size_16,color_FFFFFF,t_70)

**3.运行结果**

运行App.java启动类，run as JavaApplication
![ 运行结果：Hello,SpringBoot](https://img-blog.csdnimg.cn/20190605145855998.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2FuZHJvaWRzdGFyamFjaw==,size_16,color_FFFFFF,t_70)

**4.关于编写启动器需要注意的问题**

启动器存放的位置。启动器可以和 controller 位于同一个包下，或者位于 controller 的上一级
包中，但是不能放到 controller 的平级以及子包下。

### 最后放上我的项目
>项目地址：
>https://github.com/yuerLoveCoding/srpingHello

### 更多阅读

[**SpringMVC， SpringBoot、 Spring Cloud及Maven的理解**](https://blog.csdn.net/androidstarjack/article/details/90901366)

[**终于，我还是下决心学Java后台了**](https://mp.weixin.qq.com/s/2dtdTGOym3l5hBeZ6xBYQA)

[**坚持：学习Java后台的第一阶段，我学习了那些知识**](https://mp.weixin.qq.com/s/GeuKN9LNV93bWg36eNp4OA)



![职场和技术与您同在](http://upload-images.jianshu.io/upload_images/14371339-da65ab85676c6d3f?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

 如果您有什么问题，欢迎阅读上面的文章，关注我微信公众号：终端研发部，一起交流和学习~~