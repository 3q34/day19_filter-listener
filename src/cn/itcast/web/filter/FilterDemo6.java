package cn.itcast.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created by cdx on 2019/12/4.
 * desc:转发访问时执行
 */
//@WebFilter(value = "/index.jsp",dispatcherTypes = {DispatcherType.FORWARD,DispatcherType.REQUEST})
public class FilterDemo6 implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("filterdemo6执行啦.......");
        chain.doFilter(req, resp);
        System.out.println("filterdemo6回来啦.......");
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
