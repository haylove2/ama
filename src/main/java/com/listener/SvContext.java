package com.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.Timer;

/**
 * @author JAVA第二阶段 JavaWeb
 * @create 2021-05-18 10:49 星期二
 */
//监听servlet 上下文
public class SvContext implements ServletContextListener {
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("ServletContextListener上下文创建了.");

    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("ServletContextListener上下文销毁了");

    }
}
