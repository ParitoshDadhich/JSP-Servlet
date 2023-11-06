package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SecondServletUsingGenericServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("This is the servlet using Generic Servlet");
		res.setContentType("text/html");
		PrintWriter writer = res.getWriter();
		writer.println("<h1>This is the second servlet using Generic Servlet!</h1>");
		
	}

}
