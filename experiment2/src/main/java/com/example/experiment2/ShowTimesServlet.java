package com.example.experiment2;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ShowTimesServlet")
public class ShowTimesServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        ServletContext context = this.getServletContext();
//        String obj = (String)context.getAttribute("times");
        Object obj = context.getAttribute("times");
        if(obj == null){
            obj = 0;
        }
//        System.out.println(obj);
        String info = "";
        resp.setContentType("text/html"); //todo
        PrintWriter out = resp.getWriter();
        info = "CountTimesServlet页面统计 CountTimesServlet页面被访问了" +
                obj +
                "次";
        out.println("<html><body>");
        out.println("<a>" + info + "</a>");
        out.println("</body></html>");
    }
}
