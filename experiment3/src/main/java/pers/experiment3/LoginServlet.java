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
        String autologin = "on";
        //处理为空的情况
        if(request.getParameter("autologin")==null){
            autologin ="off";
        }
        System.out.println("\""+username+"\""); //String
        System.out.println(autologin); //on null
        if(username.equals("张三")){
            //判断是否选了自动登录
            if(autologin.equals("on")){
                //发送cookies
                System.out.println("the button is on");
            }
            //输出成功的界面
            String str = "欢迎张三，您已登录";
            String url = "<a href=\"#\">退出</a>";
            out.write(str+url);
            System.out.println("case 1");
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

        }

//        switch (1){
//            //用户名正确
//            case 1:
//                break;
//            //用户名正确且自动登录
//            //用户名错误
//            case 2:
//                break;
//            case 3:
//                break;
//            //没有填写东西
//            case 4:
//                break;
//        }
//        //显示成功的页面

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        System.out.println("get");

    }
}
