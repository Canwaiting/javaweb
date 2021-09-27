package com.example.experiment2;

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
        String ID = request.getParameter("ID");
        ID =ID.trim();
        System.out.println(ID);
        String information = "";
        response.setContentType("text/html"); //todo
        PrintWriter out = response.getWriter();
        if(ID=="001"){
            information = "查询编号为001的用户信息如下:\n"
                        + "用户名为:张三\n"
                        + "用户年龄:20\n";
        }
        else{
            information = "查询不到该用户的信息";
        }
        out.println("<html><body>");
        out.println("<h1>" + information + "</h1>");
        out.println("</body></html>");

    }

    public void destroy() {
    }
}