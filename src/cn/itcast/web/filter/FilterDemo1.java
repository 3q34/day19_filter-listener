package cn.itcast.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created by cdx on 2019/12/3.
 * desc:
 */
//@WebFilter("/*")//拦截路径
public class FilterDemo1 implements Filter {
    private static final String TAG = "FilterDemo1";

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("filterDemo1被执行了。。。。");
        ///放行
        filterChain.doFilter(servletRequest, servletResponse);


    }

    @Override
    public void destroy() {

    }
}
