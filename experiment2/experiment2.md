#experiment2
##实现1
###需求分析
访问servlet1，然后记录访问的次数，然后访问servlet2的时候，可以看到访问的次数
```mermaid
graph LR
网页
--访问-->Servlet1
--发送统计数量--> Servlet2
--展示-->网页
网页--访问-->Servlet2
```

###todo
__servlet2怎么样知道servlet1被访问多少次__
方法:
1. servlet1发送信息给servlet2 //不用
2. servlet1和servlet2中有一个东西是大家都可以读取的，然后servlet1被访问一次就+1 //用
+ 创建一个ServletContext
+ 每一次启动servlet1就加1
+ 在servlet2中获取servletContext，然后输出界面




##实现2
###需求分析
目的:实现servlet对象的数据转发
表单获取id
后台匹配信息
可以使用字典+数组来进行配对
输出到页面

```mermaid
graph LR
网页--ID-->servlet1-->servlet2--information-->网页
```
###todo
+ 表单里传进来的数据是什么类型的__  //获取为string
+ 使其为string__ //不用
+ 使其成功能与本地信息比对
+ 将单个servlet变成一个用于接受请求并转发 一个用于判断和返回响应

##实现3 
###需求分析
```mermaid
graph LR
网页
--ID-->UserServlet
--Info-->OrderServlet
--UserInfo+OrderInfo-->网页
```


##知识总结:
__tomcatconfigurations中点击deployment后的application context作用__
里面填写的就是你的虚拟路径
如果什么都没有填写 那么路径就是jsp所在的文件夹的路径也就是你可以直接在localhost://8080后直接加/与jsp同路径的文件
如果填写了东西 那么服务器运行时你的url中就是localhost://8080+虚拟路径 然后想访问资源就按照路径来填写
不管虚拟路径中写的是什么，jsp依然会是首页
<br>

__form中action如何绑定servlet__
form中的action = "\servlet-name"
然后再在xml中注册servlet-name
运行原理:
```mermaid
graph LR
url--寻找url资源看看里面有没有-->xml
--> urlpattern
-->servletname
-->servletclass
-->把servletclass放进内存 -->创建对象并调用方法
```
__从html表单中获取的数据无法判断__
首先，从html中获取的数据是String，然后String比对如果用==就是判断是否同一个对象
我现在只是想要值相同，所以用equals()

__注册WebServlet__
原来的Servlet就要用到web.xml来配置
当Servlet的版本为3.0以上时即可用注解@webServlet来配置
@webServlet(urlPatterns = "/name")
如果只有一个属性的话value可以不写
value等价于 urlPatterns 属性，与该属性不能同时使用
@webServlet(value = "/name")
最终又可以省略
@webServlet("/name")

__多个Servlet中共享数据__
通过ServletContext功能
只要在某个Servlet中创建了该对象，你的服务器中的所有servlet都可以共用这一个对象

__response.setContentType("text/html");__
MIME类型
text/html意思是这个text是以html的格式存在
如同image/jpg，这个image是以jpg形式存在

__如何使其ServletContext中的对象每次访问都+1__
解决方法:在Servlet中定义静态变量，然后在doget方法中++。
首先我混淆了servlet和doget，servlet是一个类，然后doget是其中的一个方法，静态变量是无法在方法中定义的。只能在类中定义。
网页每一次访问我们的servlet都是向该servlet发送请求，所以访问一次，toget方法就运行一次，匹配于++。然后我需要一个不随着访问次数变化而变化的变量，就选择了静态变量。
