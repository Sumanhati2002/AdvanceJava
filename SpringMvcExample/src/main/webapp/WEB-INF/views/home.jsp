<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>this is home page</h1>
<%
String name=(String)request.getAttribute("name");
String city=(String)request.getAttribute("city");
int id=(Integer)request.getAttribute("id");
%>

<p>name is:<%= name%></p>
<p>city is:<%= city%></p>
<p>id is:<%= id%></p>
</body>
</html>