package cn.zengchen233.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String[] hobby = req.getParameterValues("hobby");

        System.out.println("====================");
        //后台接收中文乱码
        System.out.println(username);
        System.out.println(password);
        System.out.println(Arrays.toString(hobby));
        System.out.println("====================");

        //通过请求转发
        req.getRequestDispatcher("/success.jsp").forward(req, resp);
    }
}
