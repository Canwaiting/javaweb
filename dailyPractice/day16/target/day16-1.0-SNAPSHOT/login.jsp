<%--
  Created by IntelliJ IDEA.
  User: canwaiting
  Date: 2021/9/28
  Time: 下午3:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
    <script>
        <style>
            div{
                color : red;
            }
        </style>
    </script>
</head>
<body>
    <form action = "/LoginServlet" method = "post">
        Username:<input type = "text" name = "username"> <br>
        Password:<input type = "password" name = "password"> <br>
        CheckCode:<input type = "text" name = "checkCode"> <br>
        <img id = "img" src = "request.contextPath/CheckCodeServlet">
        <input type = "submit" value = "sign in">
    </form>
<div><%=request.getAttribute("CheckCode_erro") ==null ? "" : request.getAttribute("CheckCode_erro") %></div>
<div><%=request.getAttribute("login_error") ==null ? "" : request.getAttribute("login_error") %></div>


</body>
</html>
