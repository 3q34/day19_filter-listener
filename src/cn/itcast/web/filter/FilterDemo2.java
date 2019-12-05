package cn.itcast.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created by cdx on 2019/12/3.
 * desc:
 */
//@WebFilter("/*")
public class FilterDemo2 implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init....");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("filterDemo2被执行了。。。。");
        ///放行
        filterChain.doFilter(servletRequest, servletResponse);


    }

    @Override
    public void destroy() {
        System.out.println("destroy....");
    }
}
