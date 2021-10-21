package pers.experiment3;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;

@WebServlet(name = "newLoginServlet", value = "/newLoginServlet")
public class newLoginServlet extends HttpServlet {
        private static final long serialVersionUID = 1L;

        protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

            req.setCharacterEncoding("utf-8");
            resp.setContentType("text/html;charset=utf-8");
            PrintWriter out = resp.getWriter();

            String username = req.getParameter("username");
            String autoLogin = req.getParameter("autoLogin");

            // 先遍历用户登录信息，查看是否存储有自动登录相关信息
            Cookie[] cookies = req.getCookies();
            for (Cookie cookie : cookies) {
                if(cookie.getName().equals("username")){
                    if("张三".equals(URLDecoder.decode(cookie.getValue(), "utf-8"))) {
                        cookie.setMaxAge(5);
                        resp.addCookie(cookie);
                        out.print("您已登录，欢迎你！");
                        out.print("<a href='/experiment_3_2/login.jsp'>退出</a>");
                        return;
                    }
                }
            }

            // 收集用户登录信息
            if(username.trim().equals("") || username==null){
                out.print("请输入用户名登录");
                resp.setHeader("Refresh", "2;URL=http://localhost:8080/experiment_3_2/login.jsp");
                return;
            }

            // 表示用户使用自动登录功能
            if("张三".equals(username) && autoLogin.equals("autoLogin")) {
                Cookie cookie=new Cookie("username", URLEncoder.encode(username, "utf-8"));
                cookie.setMaxAge(5);
                cookie.setPath("/");
                resp.addCookie(cookie);
                out.print("您已登录，欢迎你！");
                out.print("<a href='/experiment_3_2/login.jsp'>退出</a>");
                return;
            } else{
                out.print("用户名错误");
                resp.setHeader("Refresh", "2;URL=http://localhost:8080/experiment_3_2/login.jsp");
                return;
            }
        }



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
