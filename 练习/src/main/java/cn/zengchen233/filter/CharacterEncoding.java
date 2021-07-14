package cn.zengchen233.filter;

import javax.servlet.*;
import java.io.IOException;

public class CharacterEncoding implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("CharacterEncodingFilter初始化成功");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=UTF-8");

        chain.doFilter(request, response);//让我们的请求继续走如果不写程序到这里就会拦截停止
    }

    @Override
    public void destroy() {
        System.out.println("CharacterEncodingFilter销毁成功");
    }
}
