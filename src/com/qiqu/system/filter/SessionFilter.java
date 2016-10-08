package com.qiqu.system.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SessionFilter implements Filter {
	public void doFilter(ServletRequest request, ServletResponse response,FilterChain chain) throws IOException, ServletException {
		chain.doFilter(request, response);
	}

	/**
	 * Unused.
	 */
	public void init(FilterConfig config) throws ServletException {
		
	}
	/**
	 * Unused.
	 */
	public void destroy() {
		
	}
}