<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Successfully</title>
</head>
<body>
<%
    // 获取请求是从哪里来的
    String referer = request.getHeader("referer");
    boolean referer_startsWith = false;
    referer_startsWith = referer.startsWith("http://localhost:8080/");
    // 如果是直接输入的地址，或者不是从本网站访问的重定向到本网站的首页
    if (referer == null || !referer_startsWith) {
        String date = "失败跳转页面";
        response.getWriter().write(date);
        return;
    }
    else{
        String date = "成功跳转页面";
        response.getWriter().write(date);
    }
%>

</body>
</html>
