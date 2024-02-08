<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
	<h1>New User, Login Here...</h1>
	${message}
	<form method="post" >
		<p>Email: <input type="email" name="email" placeholder="Enter your email"></p>
		<p>Password: <input type="password" name="password" placeholder="Enter your password"></p>
		<p><button type="submit">Submit</button></p>
	</form>
</body>
</html>