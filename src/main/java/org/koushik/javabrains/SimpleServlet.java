package org.koushik.javabrains;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//	http://localhost:8080/SimpleServletProject/SimpleServletPath
/**
 * Servlet implementation class SimpleServlet
 */
@WebServlet(description = "A simple servlet", urlPatterns = { "/SimpleServletPath" },
		initParams= {@WebInitParam(name="defaultUser", value="John Doe")}
		)
public class SimpleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello from GET method");
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		HttpSession session = request.getSession();
		
		ServletContext context = request.getServletContext();
		String userName = request.getParameter("name");
		
		if(userName != "" & userName != null) {
			session.setAttribute("savedUserName",userName);
			context.setAttribute("savedUserName", userName);
		}
		
		writer.println("Request parameter has username as " + userName);
		writer.println("Session parameter has username as " + (String) session.getAttribute("savedUserName"));
		writer.println("<br/>");
		writer.println("Context parameter has username as " + (String) context.getAttribute("savedUserName"));
		writer.println("Init parameter has username as " + (String) this.getServletConfig().getInitParameter("defaultUser"));

	}

}
