<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Add User - Kube</title>
</head>
<body>
<h2>Welcome to Kube App!</h2>
Add User:
<form action="addUser">
<input type="text" name="uid"><br>
<input type="text" name="uname"><br>
<input type="submit"><br>
</form>

<hr><br>
Get User Details:
<form action="getUser">
<input type="text" name="uid"><br>
<input type="submit" name="search"><br>
</form>

</body>
</html>