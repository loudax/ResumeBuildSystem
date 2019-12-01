
# java课程大作业
## 名称：数据分析与用户简历生成系统
## 功能：
### 学生用户：
1. 数据分析：输入成绩，进行数据分析（成绩分布，成绩向前比对查看趋势...），可生成成绩报告单。
2. 简历生成：根据个人信息套用简历模版生成简单的个人简历，成绩报告单。
### 老师：
1. 群组创建：创建班级群，可以查看被加入班级群的学生的成绩，信息等。
2. 数据分析：统计班级成绩，进行数据分析，可生成成绩报告单

## 项目启动说明
本地要配置mysql环境，启动mysql服务以后创建名为“test”（实际名字里没有引号）的schema。

## 项目结构说明
idea项目如何在eclipse中打开可以参考网上的博客。（如果打不开的话就下个idea吧，很好用哒）
1. model用来存放学生，老师，班级等自定义的类。
2. gui用来存放gui界面设计。
3. controller用来处理gui端(前端)发送的请求。
4. lib用来存放jar包以及依赖的文件。

## model 
### 学生：
#### 属性：
- id(根据id登陆)
- password
- class(班级)
- description(个人描述)
- isAdmin
- grade(成绩)    
#### 方法：

### 老师

#### 属性：
- id
- password
- description
- class
- isAdmin

#### 接口

1. 前端：用户登录请求：
   服务端：
   后台：1. 判断用户是否在数据库中的接口：bool findUserByName(String username) 在数据库中则返回true，没有则返回false
        2. 用户登陆：bool userLogin(String username, String password) 登陆成功则返回true，失败则返回false
   

2. 前端：用户注册请求：
   服务端：
   后台：注册用户并写入数据库：bool registerUser(String username, String password) 注册成功则返回true，没有则返回false

3. 前端：上传成绩信息请求：
   服务端：
   后台：1. 判断该用户是否登陆：bool isLogin(String username), 已登陆则true，未登录则false
        2. 传入用户成绩信息：bool postGrade(String username, List<String> subjects, List<int> grades) subjects为科目，grades为成绩，科目与成绩的索引应保持一致，全部传入成功则返回true，没有则返回false

4. 前端：查询某门课的成绩：
   服务端：
   后台：1. 判断该用户是否登陆：bool isLogin(String username), 已登陆则true，未登录则false
        2. 查询成绩：int getGradeByUsernameAndId()





