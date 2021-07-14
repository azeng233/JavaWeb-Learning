package cn.zengchen233.filter;

import cn.zengchen233.util.Constant;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SysFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) request;

        if (req.getSession().getAttribute(Constant.USER_SESSION) == null) {
            resp.sendRedirect("/error.jsp");
        }
        chain.doFilter(request, response);//让我们的请求继续走如果不写程序到这里就会拦截停止
    }

    @Override
    public void destroy() {
    }
}
