package org.example.bai3ss8.config;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class WebInit implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext servletContext = sce.getServletContext();
        servletContext.setAttribute(AppConfig.VALIDATOR_ATTRIBUTE, AppConfig.getValidator());
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        AppConfig.close();
    }
}
