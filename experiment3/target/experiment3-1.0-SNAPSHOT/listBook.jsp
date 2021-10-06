<%--
  Created by IntelliJ IDEA.
  User: canwaiting
  Date: 2021/10/6
  Time: 下午6:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="pers.experiment3.BookDB"%>
<%@ page import="pers.experiment3.Book"%>
<%@ page import="java.util.Collection" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="javax.*" %>

<html>
<head>
    <title>listBook</title>
</head>
<body>
<p>本站提供的图书有：</p>
javaweb开发<a href="#">点击购买</a><br/>
jdbc开发<a href="#">点击购买</a><br/>
java基础<a href="#">点击购买</a><br/>
struts开发<a href="#">点击购买</a><br/>
spring开发<a href="#">点击购买</a><br/>
<%
    Collection<Book> books = BookDB.getAll();
    for(Book book:books){
        //System.out.println("1");
        //out.println(book.getName());
    }
%>

</body>
</html>
