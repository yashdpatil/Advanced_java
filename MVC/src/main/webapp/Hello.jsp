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
<h1>Welcome To JSP</h1>
<% LocalDate date = LocalDate.now(); %>
<h2> Todays Date Is <%= date %></h2>

<center>
<%
for(int i =0;i<6;i++){
%>
<font size="<%= i %>">Helllo Worls</font><br />

<%
}
%>
</center>


</body>
</html>