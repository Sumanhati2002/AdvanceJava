<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ page isELIgnored="false" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>this is home</h1>
<%-- <%
String name=(String)request.getAttribute("name");
int id=(Integer)request.getAttribute("Id");
%> --%>
<%-- <p>Name is:<%=name %></p>
<p>Id is:<%=id %></p> --%>

<p>Name is:${name}</p>
<p>Id is:${Id}</p>
<p>marks are:${marks}</p>

<c:forEach var="item" items="${marks}">
<h1>${item}</h1>
</c:forEach>
</body>
</html>