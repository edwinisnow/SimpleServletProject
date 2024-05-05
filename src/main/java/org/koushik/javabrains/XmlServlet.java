package org.koushik.javabrains;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class XmlServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("XMLServlet called");
		String username = request.getParameter("userName");
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.println("Hello from the GET method " + username);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("XMLServlet called");
		PrintWriter writer = response.getWriter();
		String username = request.getParameter("userName");
		String fullname = request.getParameter("fullName");
		String prof = request.getParameter("prof");
		writer.println("Profession " + prof);
		
//		String location = request.getParameter("location");
		String[] location = request.getParameterValues("location");
		writer.println("Location " + location[0] + location[1]);
		
		response.setContentType("text/html");
		
		writer.println("Hello from the Post method " + username +"Fullname : "+ fullname);
		
	}
}
