<%--&lt;%&ndash;--%>
<%--  Created by IntelliJ IDEA.--%>
<%--  User: canwaiting--%>
<%--  Date: 2021/10/15--%>
<%--  Time: 下午7:53--%>
<%--  To change this template use File | Settings | File Templates.--%>
<%--&ndash;%&gt;--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<html>--%>
<%--<head>--%>
<%--    <title>Title</title>--%>
<%--</head>--%>
<%--<body>--%>

<%--</body>--%>
<%--</html>--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>
<form action="" method="post">
<form name="reg" action="experiment3/newLoginServlet" method="post">
    <table>
        <tr>
            <td>用户名:</td>
            <td><input name="username" type="text" /></td>
        </tr>
        <tr>
            <td>自动登录：</td>
            <td><input type="checkbox" name="autoLogin" value="autoLogin" /></td>
        </tr>
        <tr align="center">
            <td colspan="2"><input type="submit" value="提交" id="bt" /></td>
        </tr>
    </table>
</form>
</body>
</html>
