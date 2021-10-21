<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Title</title>
    <meta charset="UTF-8">
</head>
<body>
<div>
    <%request.setCharacterEncoding("UTF-8");%>
    歌名:${param.song}<br/>
    歌手:${paramValues.singer[0]} ${paramValues.singer[1]} <br/>
</div>

</body>
</html>
