<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Title</title>
    <meta charset="UTF-8">
</head>
<body>
<div style="font-size: 30px;">信息采集</div>
<form action="showinfo.jsp" method="post">
    <%--歌名--%>
    歌名:<input  type= "text" name="song" ><br/>
    <%--歌手--%>
    歌手:<input type="checkbox" name="singer" value="那英"/>那英
        <input type="checkbox" name="singer" value="王菲"/>王菲<br/>
    <%--提交--%>
    <input type="submit" value="提交"/>

</form>

</body>
</html>
