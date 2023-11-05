package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

//@WebServlet(urlPatterns="/login", name="LoginServlet")
public class LoginServlet implements Servlet {

	ServletConfig conf;
	
	// LIFE CYCLE METHODS
	
	public void init(ServletConfig conf) {
		this.conf = conf;
		System.out.println("Creating object....");
	}
	
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		/*
		 * Servlet generates dynamic response
		 */
		System.out.println("Service starting..........");
		
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.println("<h1>This is my output from servlet method</h1>");
		writer.println("<h1>Todays date and time is " + new Date().toString() + "</h1>");
		
		System.out.println("Service ended..........");
	}
	
	public void destroy() {
		System.out.println("Going to destroy servlet object.....");
	}
	
	// NON LIFE CYCLE METHOD;
	
	public ServletConfig getServletConfig() {
		return this.conf;
	}
	
	public String getServletInfo() {
		return "this servlet is created by Paritosh!";
	}	
}
