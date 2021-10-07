<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<form action="/LoginServlet" method="post">--%>
<%
    //判断是否有cookie
    Cookie[] cookies = request.getCookies();
    if(cookies!= null && cookies.length >0){
        for(Cookie cookie:cookies){
            String name = cookie.getName();
            if(name.equals("autologin")){
                //todo如果有cookie应该干嘛
//                System.out.println("autologin");
//                response.setHeader("refresh","URL=/experiment3/LoginServlet");
            }
            else{
                //todo怎么才能把表示框在里面
                System.out.println("no cookie");

            }
        }
    }
%>

<form action="/experiment3/LoginServlet" method="post">
    <%--输入框--%>
    用户名:<input type="text" name="username"><br/>
    <%--选中框--%>
    自动登录:<input type="checkbox" name="autologin"><br/>
    <%--提交--%>
    <input type="submit" value="提交"><br/>
</form>


</body>
</html>
