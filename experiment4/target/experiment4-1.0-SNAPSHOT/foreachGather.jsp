<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<%--String--%>
<%
    String[] foods={"apple","orange","grape","banana"};
    request.setAttribute("foods",foods);
%>
String数组<br/>
<c:forEach var="food" items="${foods}">
    ${food}
    ||
</c:forEach>
<br/>
<%--Map--%>
<%
    Map<String,String> userMap= new HashMap<String,String>();
    userMap.put("Tom","male");
    userMap.put("Jane","female");
    userMap.put("Jack","male");
    userMap.put("Petter","male");
    request.setAttribute("userMap",userMap);
%>
Map集合<br/>
<c:forEach var="preuser" items="${userMap}">
    ${preuser.key}
    ${preuser.value}
    ||
</c:forEach>
<br/>
<%--List--%>
<%
    List<String> colorList=new ArrayList<String>();
    colorList.add("red");
    colorList.add("green");
    colorList.add("blue");
    colorList.add("black");
    colorList.add("yellow");
    request.setAttribute("colorList",colorList);
%>
List集合<br/>
<c:forEach var="color" items="${colorList}">
    ${color}
    ||
</c:forEach>
<br/>

</body>
</html>
