package com.example.experiment2;

import org.junit.Test;
import org.w3c.dom.ls.LSOutput;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletDemo", value = "/ServletDemo")
public class ServletDemo extends HttpServlet {
//    private String message;

//    public void init() { message = "we are in the ServletDemo"; }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        Object obj = request.getParameter("ID");
        String ID = request.getParameter("ID");
//        String matchID = "001";
        ID =ID.trim();
//        System.out.println(obj.getClass().getName());
        String info = "";
        response.setContentType("text/html"); //todo
        PrintWriter out = response.getWriter();
        if(ID.equals("001")){
            info = "查询编号为001的用户信息如下:<br>"
                        + "用户名为:张三<br>"
                        + "用户年龄:20<br>";
        }
        else{
            info = "查询不到该用户的信息";
        }
        out.println("<html><body>");
        out.println("<a>" + info + "</a>");
        out.println("</body></html>");

    }

    public void destroy() {
    }
}

