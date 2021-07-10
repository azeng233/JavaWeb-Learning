package cn.zengchen233.servlet;

import cn.zengchen233.pojo.Person;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class SessionDemo01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //解决乱码问题
        resp.setCharacterEncoding("utf-8");
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");

        //得到Session
        HttpSession session = req.getSession();
        //在Session中存东西
        session.setAttribute("name",new Person("曾晨",1));
        //获取session的id
        String sessionId = session.getId();

        //判断session是不是新创建的
        if (session.isNew()) {
            resp.getWriter().print("Session创建成功,ID:"+sessionId);
        }else {
            resp.getWriter().print("Session已经在服务器中存在,ID:"+sessionId);
        }

        //Session创建的时候做了什么事情
//        Cookie cookie = new Cookie("JSESSIONID",sessionId);
//        resp.addCookie(cookie);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
