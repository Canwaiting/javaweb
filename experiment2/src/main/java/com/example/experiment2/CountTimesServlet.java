package com.example.experiment2;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/CountTimesServlet")
public class CountTimesServlet extends HttpServlet {
    static int counter = 0;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);

        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        ServletContext context = this.getServletContext();
        counter++;
        context.setAttribute("times",counter);
//        req.getRequestDispatcher("/ShowTimesServlet").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
    }
}
