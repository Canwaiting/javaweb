<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="pers.experiment3.BookDB"%>
<%@ page import="pers.experiment3.Book"%>
<%@ page import="java.util.Collection" %>

<html>
<head>
    <title>listBook</title>
</head>
<body>
<p>本站提供的图书有：</p>
<%
    Collection<Book> books = BookDB.getAll();
    for(Book book:books){
        String url = "#" + book.getId();
        out.print(book.getName() + "<a href='" + url + "'>点击购买</a><br/>");
    }
%>

</body>
</html>
