<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Hello its me !!</h1>
<%
LocalDate date = LocalDate.now();

%>
<h3><%=date %></h3>
<%! int x= 2; %>
<% for(int i = 1;i<=10;i++){ %>
<h1> 2 * <%= i%> = <%= x*i %></h1>
<%} %>
</body>

</html>