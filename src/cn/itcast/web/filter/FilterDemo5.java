package cn.itcast.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created by cdx on 2019/12/4.
 * desc:直接访问才会被执行
 */
//@WebFilter(value = "/index.jsp",dispatcherTypes = DispatcherType.REQUEST)
public class FilterDemo5 implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("filterdemo5执行啦.......");
        chain.doFilter(req, resp);
        System.out.println("filterdemo5回来啦.......");
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
