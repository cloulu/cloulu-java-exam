package com.cloulu.samples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloClouluServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=utf-8");
		response.setStatus(200);
		PrintWriter writer = response.getWriter();

		writer.println("<h1>Hello Cloulu from " + System.getenv("VCAP_APP_HOST") + ":" + System.getenv("VCAP_APP_PORT")+"<h1>");
		writer.println("<br><a href=basic>Get Back-End Services Info Using System.getenv(\"VCAP_SERVICES\")</a>");
		writer.println("<br><br><a href=cloulusevices>Get Back-End Services Info Using Cloulu Service Object</a>");
		writer.close();
		
	}
}
