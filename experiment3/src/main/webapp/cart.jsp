<%@ page import="pers.experiment3.Book" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>:bn</title>
</head>
<body>
<%
    //初始化变量
    List<Book> cart = null;
    boolean purFlag = true;
//    session = null;
    session = request.getSession(false);
    //展示购物车内容
    //*首先判断出购物车中有没有东西
    if(session==null){
        purFlag=false;
    }
    else{
        //todo 类型没有控制好
        cart = (List) session.getAttribute("cart");
        if(cart==null){
            purFlag=false;
        }
    }
    //*根据判断选择展示或者是重定向
    if(!purFlag){
        out.write("对不起！您还没有买任何东西<br/>");
    }
    else{
        out.write("您购买的图书有:<br/>");
        for(Book book:cart){
            out.write(book.getName() + "<br/>");
        }
    }
%>

</body>
</html>
