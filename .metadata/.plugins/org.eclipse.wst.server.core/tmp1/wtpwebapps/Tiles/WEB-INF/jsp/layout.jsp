<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://tiles.apache.org/tags-tiles"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title><tiles:insertAttribute name="title" ignore="true" /></title>
</head>
<body>
	<div>
		<div style="background-color: yellow;">
			<tiles:insertAttribute name="header" />
		</div>
		<div style="float: left; width: 15%; height: 450%;">
			<tiles:insertAttribute name="menu" />
		</div>
		<div
			style="float: left; width: 85%; height: 450%; background-color: #76D7C4">
			<tiles:insertAttribute name="body" />
		</div>
		<div style="clear: both;">
			<tiles:insertAttribute name="footer" />
		</div>

	</div>
</body>
</html>