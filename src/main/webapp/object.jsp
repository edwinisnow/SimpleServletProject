<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String userName = request.getParameter("name");
	if(userName != null){
		pageContext.setAttribute("pageContextUserName", userName);
		session.setAttribute("sessionUserName", userName);
		// application.setAttribute("applicationUserName", userName);
		pageContext.setAttribute("applicationUserName", userName, PageContext.APPLICATION_SCOPE);
		pageContext.findAttribute("name");
	}
	
%>
<h1><%=userName %></h1>
<h1>Session object = <%=session.getAttribute("sessionUserName") %></h1>
<h1>Application context object = <%=application.getAttribute("applicationUserName") %></h1>
<h1>Page context object = <%=application.getAttribute("applicationUserName") %></h1>
<h1>Page context object = <%=pageContext.getAttribute("pageContextUserName") %></h1>
</body>
</html>