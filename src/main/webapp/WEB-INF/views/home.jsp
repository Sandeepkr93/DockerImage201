<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hotel Booking</title>
<link href="resources/css/custom.css" rel="stylesheet">
</head>
<body>
	<div class="container Container">
		<div class="row">
			<div class="col-md-12 header">
				<h1>MY STAY Application</h1>
			</div>
		</div>
		<div class="row">
			<div class="col-md-12 content">
				<form class="form" action="/book" method="post">
					Select a Hotel:&nbsp; <select name="hotel">
						<c:forEach items="${hotels}" var="hotel">
							<option value="${hotel}">${hotel}</option>
						</c:forEach>
					</select> <br /> <br /> Select a Room:&nbsp; <select name="roomType">
						<option value="budget">budget</option>
						<option value="semi luxury">semi luxury</option>
						<option value="luxury">luxury</option>
					</select> <br /> <br /> <input type="submit" value="Search" />
				</form>
			</div>
		</div>
	</div>

	<script src="/webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="/webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</body>
</html>