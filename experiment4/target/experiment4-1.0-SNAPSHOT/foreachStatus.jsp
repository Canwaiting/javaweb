<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Status</title>
</head>
<body>
<%--init a List--%>
<%
    List<String> colorList=new ArrayList<String>();
    colorList.add("red");
    colorList.add("green");
    colorList.add("blue");
    colorList.add("black");
    colorList.add("yellow");
    request.setAttribute("colorList",colorList);
%>
<%--traverse&&use status--%>
<table border="1">
    <tr>
        <td>序号</td>
        <td>索引</td>
        <td>是否为第一个元素</td>
        <td>是否为最后一个元素</td>
        <td>元素的值</td>
    </tr>

    <c:forEach var="color" items="${colorList}" varStatus="status">
        <tr>
            <td>${status.count}</td>
            <td>${status.index}</td>
            <td>${status.first}</td>
            <td>${status.last}</td>
<%--            <td>${status.step}</td>--%>
            <td>${color}</td>

        </tr>
    </c:forEach>

</table>

</body>
</html>
