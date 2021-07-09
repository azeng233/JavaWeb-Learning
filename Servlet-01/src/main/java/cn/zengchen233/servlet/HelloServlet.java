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

//        this.getInitParameter();  //��ʼ������
//        this.getServletConfig();  //servlet������
//        this.getServletContext(); //servlet��������
        ServletContext context = this.getServletContext();
        String username = "����"; //����
        context.setAttribute("username",username);  //��һ�����ݱ�������ServletContext�У�����username��ֵusername
        System.out.println("Hello,Servlet!");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
