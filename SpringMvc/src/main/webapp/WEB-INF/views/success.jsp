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
 <p>name is: ${user.username }</p>
<p>Mail is: ${user.usermail }</p>
<p> is: ${user.password }</p> 

<%-- <p>Name is: ${main.name }</p>
<p>Email is: ${main.email }</p>
<p>Password is: ${main.password }</p>
<p>courses are: ${main.courses }</p>
<p>favorite Web language: ${main.fav_language}</p>
<p>Address are are: ${main.address }</p>


<p>Address is: ${main}</p> --%>
</body>
</html>