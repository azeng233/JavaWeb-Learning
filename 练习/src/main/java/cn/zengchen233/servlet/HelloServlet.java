package cn.zengchen233.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context = this.getServletContext();
        String username = "曾晨";
        context.setAttribute("username",username);//将一个数据保存在了ServletContext中，名字username，值曾晨

        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html");

//        resp.getWriter().print(username);
        System.out.println("Hello, Servlet!");

//        resp.sendRedirect("/practice/error");   //进行重定向
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
