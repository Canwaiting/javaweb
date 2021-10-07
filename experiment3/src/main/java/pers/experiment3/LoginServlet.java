package pers.experiment3;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置编码格式
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
//        todo 判断用户名框输入了什么
//        if(){
//            //return a
//
//        }
//        //todo 选择相应的response
//        switch (a){
//            //用户名正确
//            case 1:
//                break;
//            //用户名正确且自动登录
//            case 2:
//                break;
//            //用户名错误
//            case 3:
//                break;
//            //没有填写东西
//            case 4:
//                break;
//        }
        //显示成功的页面
        String str = "欢迎张三，您已登录";
        String url = "<a href=\"#\">退出</a>";
        out.write(str+url);

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        System.out.println("get");

    }
}
