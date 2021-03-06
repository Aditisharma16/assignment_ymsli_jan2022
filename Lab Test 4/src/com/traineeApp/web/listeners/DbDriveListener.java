package com.traineeApp.web.listeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class DbDriveListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		String driverName = sce.getServletContext().getInitParameter("driver");
		try {
			Class.forName(driverName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {

	}
}