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
        request.setCharacterEncoding("utf-8");
        PrintWriter out = response.getWriter();
        //获取表单里面的东西
        String username = request.getParameter("username");
        String id = request.getParameter("id");
        System.out.println("idid");
        System.out.println(id);
        System.out.println("idid");
        String autologin = "on";
        //处理为空的情况
        System.out.println("autologin:");
        System.out.println(request.getParameter("autologin"));
        System.out.println("id:");
        System.out.println(request.getParameter("id"));
        if(request.getParameter("autologin")==null&&request.getParameter("id")==null){
            autologin ="off"; //既不自动登录 又没有自动登录的状态
        }
//        System.out.println(autologin); //on null
//        System.out.println(id); //on null
//        System.out.println("\""+username+"\""); //String
        if(username.equals("张三")||id.equals("1")){
            //判断是否选了自动登录
            if(autologin.equals("on")){
                //发送cookies
                Cookie cookie = new Cookie("autologin","on");
                //todo 先把这个关掉做测试
                cookie.setMaxAge(10);
//                cookie.setMaxAge(60*10);
                response.addCookie(cookie);
            }
            //输出成功的界面
            String str = "欢迎张三，您已登录";
            String url = "<a href=\"login.jsp\">退出</a>";
            out.write(str+url);
        }
        else{
            if(username.equals("")){
                String str = "请输入用户名登录";
                out.write(str);
            }
            else{
                String str = "用户名错误";
                out.write(str);

            }
            response.setHeader("refresh","3;URL=login.jsp");
//            System.out.println("发生了重定向");
        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        System.out.println("get");

    }
}
