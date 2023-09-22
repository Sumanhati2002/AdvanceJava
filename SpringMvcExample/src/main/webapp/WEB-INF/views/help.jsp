<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>help</h1>
<%
String name=(String)request.getAttribute("name");
int id=(Integer)request.getAttribute("id");
%>

<p>name is:<%= name%></p>
<p>id is:<%= id%></p>
</body>
</html>