<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!
	public int add(int a, int b){
		return a + b;
	}
%>
<%
int i = 1;
int j = 2;
int k;

k = i + j;

%>
<h1>Value of k is <%=k%></h1>
<h1>Sum of 1+2=<%=add(1,2) %></h1>
<h2>Sum of 2+2=<%=add(2,2) %></h2>
</body>
</html>