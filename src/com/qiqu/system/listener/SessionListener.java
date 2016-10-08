package com.qiqu.system.listener;

import java.util.HashMap;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.apache.log4j.Logger;

public class SessionListener implements HttpSessionListener {
	private final Logger log = Logger.getLogger(SessionListener.class);

	@SuppressWarnings("rawtypes")
	public static HashMap sessionUserMap = new HashMap();

	public void sessionCreated(HttpSessionEvent event) {
		log.info("session创建  " + event.getSession().getId());
	}

	@SuppressWarnings("static-access")
	public void sessionDestroyed(HttpSessionEvent event) {
		log.info("session销毁  " + event.getSession().getId());
		this.DelSession(event.getSession());
	}

	public static synchronized void DelSession(HttpSession session) {

	}
}