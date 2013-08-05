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
		response.setContentType("text/plain");
		response.setStatus(200);
		PrintWriter writer = response.getWriter();
		writer.println("Hello Cloulu from " + System.getenv("VCAP_APP_HOST") + ":" + System.getenv("VCAP_APP_PORT"));
		writer.print("VCAP_SERVICES = ");
		writer.println(System.getenv("VCAP_SERVICES"));
		writer.println("*********Cloud Foundry Maven Plugin Working*********");
		writer.println("*********Cloud Foundry Maven Plugin Working*********");
		writer.println("*********Cloud Foundry Maven Plugin Working*********");
		writer.println("*********Cloud Foundry Maven Plugin Working*********");
		writer.close();
	}
}
