package com.filter;


import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author JAVA第二阶段 JavaWeb
 * @create 2021-05-18 9:52 星期二
 */
public class MyFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init");
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("doFilter");
        //继续执行
        filterChain.doFilter(servletRequest,servletResponse);
        HttpServletResponse re = (HttpServletResponse)servletResponse;
        re.sendRedirect("filter.jsp");
    }

    public void destroy() {
        System.out.println("destroy");
    }
}
