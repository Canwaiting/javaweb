package com.example.day16;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //*获取表单数据
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String checkCode = request.getParameter("checkCode");
        //*判断验证码是否正确
        HttpSession session = request.getSession();
        String checkCode_session = (String)session.getAttribute("checkCode_session");
        //**是 接着判断用户名和密码是否正确
        if(checkCode_session!=null && checkCode_session.equalsIgnoreCase(checkCode)){
            //***是 传递用户名并重定向到success.jsp
            if("zhangsan".equals(username) && "123".equals(password)){
                session.setAttribute("username",username);
                response.sendRedirect("/success.jsp");
            }
            //***否 生成提示信息 返回login页面
            else{
                session.setAttribute("login_error","username or password error");
                request.getRequestDispatcher("login.jsp").forward(request,response);
            }

        }
        //**否 生成提示信息 返回login页面
        else{
            session.setAttribute("CheckCode_error","CheckCode error");
            request.getRequestDispatcher("login.jsp").forward(request,response);
        }

    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

}
