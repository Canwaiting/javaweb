package com.example.day16;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/CheckTimeServlet")
public class CheckTimeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        System.out.println("use the get");
        response.setContentType("text/html;charset=utf-8");
//        判断是否有cookie
//            获取cookie数组，然后检查列表
        Cookie[] cookies = request.getCookies();
        boolean flag = false;
//                有 再检查是否是lasttime的cookies
        if(cookies!= null && cookies.length >0){
            for(Cookie cookie:cookies){
                String name = cookie.getName();
//                    是 获取时间并打印出来
                if(name.equals("lasttime")){
                    flag = true;
                    Date date = new Date();
                    String time;
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd--HH:mm:ss");
                    time = sdf.format(date);
                    cookie.setValue(time);
                    cookie.setMaxAge(60*60*24*30);
                    response.addCookie(cookie);

                    String value = cookie.getValue();
                    response.getWriter().write("<h1>welcome back!next time is   "+ value + "</h1>");
                    break;
                }
            }
        }
//                无 直接发送一个新的cookies
        if(cookies ==null || cookies.length == 0 || flag ==false){
            Date date = new Date();
            String time;
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd--HH:mm:ss");
            time = sdf.format(date);
            Cookie cookie = new Cookie("lasttime",time);
            cookie.setMaxAge(60*60*24*30);
            response.addCookie(cookie);
            response.getWriter().write("<h1>you are the first time to this page</h1>");
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        System.out.println("use the post");

    }
}
