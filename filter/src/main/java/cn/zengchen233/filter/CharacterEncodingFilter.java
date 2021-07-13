package cn.zengchen233.filter;

import javax.servlet.*;
import java.io.IOException;

public class CharacterEncodingFilter implements Filter {
    //初始化,在服务器启动就自动初始化,随时等待过滤对象出现
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("CharacterEncodingFilter初始化成功");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=UTF-8");

        System.out.println("执行前");
        chain.doFilter(request, response);//让我们的请求继续走如果不写程序到这里就会拦截停止
        System.out.println("执行后");
    }
    //销毁
    @Override
    public void destroy() {
        System.out.println("CharacterEncodingFilter销毁成功");
    }
}
