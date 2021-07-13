package cn.zengchen233.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


//在一个Servlet中存储数据，在另外一个Servlet取到
public class servletDemo01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("utf-8");
        req.setCharacterEncoding("utf-8");

        resp.getWriter().print("成功进入/s1页面");

        String name = "曾晨";
        ServletContext context = this.getServletContext();
        context.setAttribute("name",name);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
