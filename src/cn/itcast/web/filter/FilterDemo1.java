package cn.itcast.web.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by cdx on 2019/12/3.
 * desc:
 */
public class FilterDemo1 implements Filter {
    private static final String TAG = "FilterDemo1";

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("filterDemo1被执行了。。。。");
    }

    @Override
    public void destroy() {

    }
}
