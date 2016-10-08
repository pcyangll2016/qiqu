package com.qiqu.system.listener;

import java.util.Properties;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.Logger;

/**
 * 
 * @author gyx
 * 
 */
public class InitListener implements ServletContextListener {
	private static final Logger logger = Logger.getLogger(InitListener.class);

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		
	}

	@Override
	public void contextInitialized(ServletContextEvent servlet) {
		try {
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
	}

	private String getProperty(Properties p, String key) {
		String value = p.get(key).toString();
		return value;
	}
}