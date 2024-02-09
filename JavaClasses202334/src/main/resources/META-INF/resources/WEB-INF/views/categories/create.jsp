<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Category | Category Manage</title>
</head>
<body>
	<h1>Welcome ${email}</h1>
	<hr>
	<h2>Create New Category</h2>
	<form method="post" action="/categories">
		<p>Title: <input type="text" name="title" placeholder="Enter Category Title"></p>
		<p>Image URL: <input type="text" name="imageURL" placeholder="Enter Image URL"></p>
		<p>Description: <input type="text" name="description" placeholder="Enter Description"></p>
		<p><button type="submit">Create Category</button></p>
	</form>
</body>
</html>