<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="pers.experiment3.BookDB"%>
<%@ page import="pers.experiment3.Book"%>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    //获取图书id
    String id = request.getParameter("id");
    //*没有 则返回首页
    if(id==null){
        //todo 可能不是这个格式
        String url = "listBook.jsp";
        response.sendRedirect(url);
        return;
    }

    //*有  把图书放进购物车并创建新的cookie
    Book book = BookDB.getBook(id);
    List<Book> cart = (List) session.getAttribute("cart"); //获取你的购物车
    //**判断是否需要创建创建购物车
    if(cart==null){
        //todo 是否可以和上面的List进行优化
        cart = new ArrayList<Book>();
        session.setAttribute("cart",book);
    }
    cart.add(book);
    Cookie cookie = new Cookie("JSESSION",session.getId()); //保证是同一次会话
    cookie.setMaxAge(60*30);  //使得会话保持30min
    cookie.setPath("/experiment3"); //使得cookie只能被该项目所用
    response.addCookie(cookie);
    //*最后返回购物车页面
    String url = "cart";
    response.sendRedirect(url);
%>

</body>
</html>
