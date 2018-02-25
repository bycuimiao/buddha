package org.waters.listener;

import org.waters.amulet.AmuletEnum;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @auther cuimiao
 * @date 2018/2/25/025  14:53
 * @Description: ${todo}
 */
public class AmuletListener implements ServletContextListener{
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        AmuletEnum.summon();
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("AmuletListener -- contextDestroyed");
    }
}
