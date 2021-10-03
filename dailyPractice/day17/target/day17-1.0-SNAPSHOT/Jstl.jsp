<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="com.example.domain.User" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>



<html>
<head>
    <title>Jstl</title>
</head>
<body>
<%
    List list = new ArrayList();
    list.add(new User("zhangsan",20,new Date()));
    list.add(new User("lisi",22,new Date()));
    list.add(new User("wangwu",23,new Date()));
    request.setAttribute("list",list);
%>

<table border = "1" align="center" width = "500">
    <tr>
        <th>number</th>
        <th>name</th>
        <th>age</th>
        <th>birthday</th>
    </tr>
    <c:forEach items = "${list}" var = "user" varStatus="s">
        <tr>
            <td>${s.count}</td>
            <td>${user.name}</td>
            <td>${user.age}</td>
            <td>${user.birthday}</td>
        </tr>

    </c:forEach>

</table>

</body>
</html>
