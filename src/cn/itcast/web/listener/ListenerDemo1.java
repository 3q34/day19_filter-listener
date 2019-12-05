package cn.itcast.web.listener; /**
 * Created by cdx on 2019/12/5.
 * desc:
 */

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


@WebListener
public class ListenerDemo1 implements ServletContextListener {

    /*监听ServletContext对象创建的，服务器启动后自动创建
     * @author: cdx
     * @desc:服务器启动后自动调用
     * @param sce
     * @return: void
     * @date: 2019/12/5 15:32
     * @throws:
     */
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        //获取servletContext对象
//        ServletContext servletContext = sce.getServletContext();
//        //加载资源文件(一般是全局资源文件
//        String configlocation = servletContext.getInitParameter("contextConfiglocation");
//       //获取真实路径
//        String realPath = servletContext.getRealPath(configlocation);
//        //加载进内存
//        try {
//            FileInputStream fis=new FileInputStream(realPath);
//            System.out.println(fis);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }


        System.out.println("监听器被执行了。。。。");
    }

    /*
     * @author: cdx
     * @desc:服务器关闭后自动销毁
     * @param sce
     * @return: void
     * @TO DO:
     * @date: 2019/12/5 15:32
     * @throws:
     */
    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }


}
