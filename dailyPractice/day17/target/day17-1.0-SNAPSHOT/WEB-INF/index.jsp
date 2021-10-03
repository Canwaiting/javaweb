<%@ page import="java.util.List" %>
<%@ page import="java.awt.*" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.example.day17.User" %>
<%@ page import="java.util.Date" %>
<%@ page contentType="text/ml;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>jstl test</title>
</head>
<body>
<%--create a list--%>
<%
    List list = new ArrayList();
    list.add(new User("zhangsan",23,new Date()));
    list.add(new User("lisi",22,new Date()));
    list.add(new User("wangwu",21,new Date()));
    request.setAttribute("list",list);
%>
<%--let it show in table format in the web--%>
<table border = "1" width = "500" align = "center" >
</table>
    <tr>
        <th>number</th>
        <th>name</th>
        <th>age</th>
        <th>birthday</th>
    </tr>

    <c:forEach items = "${list}" var = "${user}" varStatus = "s">
        <tr>
            <td>${s.count}</td>
            <td>${user.name}</td>
            <td>${user.age}</td>
            <td>${user.birthday}</td>

        </tr>

    </c:forEach>



</body>
</html>
