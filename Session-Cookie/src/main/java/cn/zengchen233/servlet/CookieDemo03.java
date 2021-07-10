package cn.zengchen233.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;


//中文数据怎么传递
public class CookieDemo03 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("utf-8");
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();
        Cookie[] cookies = req.getCookies();//返回数组，cookie可能存在多个
        //判断cookie=是否存在
        if(cookies != null){
            //如果存在怎么办
            out.write("您上一次访问本站的时间是:");
            for (int i = 0; i < cookies.length; i++) {
                Cookie cookie = cookies[i];
                //回去cookie的名字
                if (cookie.getName().equals("name")) {
                    out.write(cookie.getValue());
                }
            }
        }else {
            out.write("这是你第一次访问本站");
        }
        Cookie cookie = new Cookie("name","曾晨");
        resp.addCookie(cookie);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
