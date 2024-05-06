<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%!
	public void jspInit() {
		String defaultUser = getServletConfig().getInitParameter("defaultUser");
		ServletContext context = getServletContext();
		context.setAttribute("defaultUser", defaultUser);
	
	}
%>
<body>
The default user from the servlet config is : <%=getServletConfig().getInitParameter("defaultUser")%>
The value in the servlet context is: <%=getServletContext().getAttribute("defaultUser") %>
</body>
</html>