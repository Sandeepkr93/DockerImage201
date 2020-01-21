<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Booking page</title>
<link href="resources/css/user.css" rel="stylesheet">
</head>
<body>
	<div class="container Container">
		<form action="/booking" method="post">
			<div class="row">
				<div class="col-md-12 content">
					<table>
						<tr>
							<td>Booking date</td>
							<td><input type="date" id="bookingTime" name="bookingTime"></td>
						</tr>
						<tr>
							<td>Name</td>
							<td><input id="userName" name="userName"></td>
						</tr>
                 
						<tr>
							<td>Email</td>
							<td><input id="userEmail" name="userEmail"></td>
						</tr>

						<tr>
							<td><br /> <input type="submit" value="Book" /></td>
						</tr>
					</table>
				</div>
			</div>
		</form> 
		<script src="/webjars/jquery/1.9.1/jquery.min.js"></script>
		<script src="/webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>

	</div>
</body>
</html>