package com.ssafy.cafe;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("myfilter init ȣ���");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("myfilter doFilter ȣ���");
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
		System.out.println("myfilter destroy ȣ���");
	}

}
