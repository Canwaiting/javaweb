<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<form action="/LoginServlet" method="post">--%>
<form action="/experiment3/LoginServlet" method="post">
    <%--输入框--%>
    用户名:<input type="text" id="username"><br/>
    <%--选中框--%>
    自动登录:<input type="checkbox" id="autologin"><br/>
    <%--提交--%>
    <input type="submit" value="提交"><br/>
</form>


</body>
</html>
