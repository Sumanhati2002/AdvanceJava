
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<link href="<c:url value="/resourses/css/style.css" />">
<script src="<c:url value="/resourses/js/script.js" />"></script>

<title>Hello, world!</title>
</head>
<body>
	<h1>Hello, world!</h1>
	<div class="alert alert-danger" role="alert">

		<form:errors path="Main.*" />
	</div>
	<form action="complex" method="post">

		<div class="form-group">
			<label for="username">Enter name</label> <input type="text"
				class="form-control" id="username" aria-describedby="emailHelp"
				placeholder="Enter email" name="name">
		</div>

		<div class="form-group">
			<label for="useremail">Enter Email</label> <input type="email"
				class="form-control" id="useremail" aria-describedby="emailHelp"
				placeholder="Enter email" name="email">
		</div>

		<div class="form-group">
			<label for="userpassword">Password</label> <input type="password"
				class="form-control" id="userpassword" placeholder="Password"
				name="password">
		</div>

		<div class="form-group">
			<label for="selectcource">Select Courses</label> <select
				class="form-control" id="selectcource" name="courses"
				multiple="multiple">
				<option>java</option>
				<option>python</option>
				<option>c</option>
				<option>c++</option>
				<option>spring</option>
			</select>
		</div>
		<div>
			<p>Please select your favorite Web language:</p>
			  <input type="radio" id="html" name="fav_language" value="HTML">
			  <label for="html">HTML</label><br>   <input type="radio"
				id="css" name="fav_language" value="CSS">   <label for="css">CSS</label><br>
		</div>
		<div class="card">
			<div class="card-body">
				<p>Your Address</p>

				<div class="form-group">
					<input type="text" class="form-control" placeholder="enter city"
						name="address.city" />
				</div>
				<div class="form-group">
					<input type="text" class="form-control" placeholder="enter city"
						name="address.state" />
				</div>
			</div>
		</div>
		<button type="submit">Submit</button>
	</form>




	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>