package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ThirdServletUsingHttpServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException , ServletException {
		System.out.println("This is get method.....");
		res.setContentType("text/html");
		PrintWriter writer = res.getWriter();
		writer.println("<h1>This is a get method from servlet using HttpServlet</h1>");
	}
}
