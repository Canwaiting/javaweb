package com.example.experiment2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ServletDemoB")
public class ServletDemoB extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
//        System.out.println("the demoB get useful");
//        String matchID = "001";
//        System.out.println(obj.getClass().getName());
        String info = "";
        resp.setContentType("text/html"); //todo
        PrintWriter out = resp.getWriter();
        info = "查询编号为001的用户信息如下:<br>"
                + "用户名为:张三<br>"
                + "用户年龄:20<br>";
        out.println("<html><body>");
        out.println("<a>" + info + "</a>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
        System.out.println("the demoB post useful");
    }
}
