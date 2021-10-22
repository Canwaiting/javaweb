<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--todo--%>
<%--<jsp:useBean id="user" class="User"/>--%>
<jsp:useBean id="user" class="User"/>
<html>
<head>
    <title>useJavaBean</title>
</head>
<body>
    <%--先设置初始值--%>
    <c:set target="${user}" property="name" value="张三"/>
    <c:set target="${user}" property="pwd" value="123"/>
    <%--jstl--%>
    用JSTL显示JavaBean属性的值<br/>
<%--    name:<c:out value="${user.name}" default="未赋值"/><br/>--%>
<%--    pwd:<c:out value="${user.pwd}" default="未赋值"/><br/>--%>
    <%--el--%>
    用EL表达式显示JavaBean属性的值
<%--    name:${user.name}<br/>--%>
<%--    pwd:${user.pwd}--%>
</body>
</html>
