package cn.itcast.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created by cdx on 2019/12/3.
 * desc:浏览器直接请求资源时，过滤器执行
 */
@WebFilter(value = "/*", dispatcherTypes = DispatcherType.REQUEST)
public class FilterDemo4 implements Filter {
    /*
     * @author: cdx
     * @desc: 服务器关闭后，filter对象被销毁，如果服务器时正常关闭，则会执行destroy方法
     * @param
     * @return: void
     * @TO DO:
     * @date: 2019/12/3 16:03
     * @throws:
     */
    public void destroy() {
    }

    /*
     * @author: cdx
     * @desc:每一次请求被拦截资源时会执行
     * @param req
     * @param resp
     * @param chain
     * @return: void
     * @TO DO:
     * @date: 2019/12/3 16:04
     * @throws:
     */
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("filterdemo3执行啦。。。");
        //chain.doFilter(req, resp);
        System.out.println("filterdemo3回来啦。。。");
    }

    /*
     * @author: cdx
     * @desc:服务器启动后，会创建filter对象，然后调用init方法，执行一次
     * @param config
     * @return: void
     * @TO DO:
     * @date: 2019/12/3 16:01
     * @throws:
     */
    public void init(FilterConfig config) throws ServletException {

    }

}
