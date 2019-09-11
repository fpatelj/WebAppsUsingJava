package com.second.ourapplication;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/not-Welcome")
public class OurSecondServlet implements Servlet {

	public void init(ServletConfig config) throws ServletException {
		System.out.println("Servlet init method got called");
	}

	public ServletConfig getServletConfig() {

		return null;
	}

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Service method got called");
		String ourMessage = "Hello from servlet";
		res.getOutputStream().write(ourMessage.getBytes());

	}

	public String getServletInfo() {
		
		return null;
	}

	public void destroy() {
		System.out.println("Destroy method is called here");

	}

}
