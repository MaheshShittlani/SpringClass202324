<%@page import="java.util.ArrayList"%>
<%@page import="com.maheshshittlani.JavaClasses202334.category.Category"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Category | Category Manage</title>
<link href="/webjars/bootstrap/5.3.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

	<div class="container">
	<h1>Welcome ${email}</h1>
	<hr>

	<% ArrayList<Category> categories = (ArrayList<Category>)request.getAttribute("categories"); %>
	
	<div class="row">
		<div class="col">
			<h2>Category List</h2>
		</div>
		<div class="col">
			<a href="categories/create" class="btn btn-primary">Create New Category</a>
		</div>
	</div>
	<hr>
	<table class="table table-striped">
		<thead>
			<tr>
				<th>Id</th>
				<th>Title</th>
				<th>Image</th>
				<th>Description</th>
				<th>Status</th>
				<th>Created At</th>
				<th>Updated At</th>
			</tr>
		</thead>
		<tbody>
			<% for(Category category: categories) {
				%>
				<tr>
					<td><%=category.getId() %></td>
					<td><%=category.getTitle() %></td>
					<td><%=category.getImageURL() %></td>
					<td><%=category.getDescription() %></td>
					<td><%=category.isStatus() %></td>
					<td><%=category.getCreatedAt() %></td>
					<td><%=category.getUpdateAt() %></td>
				</tr>
				<%
			} %>
		</tbody>
	</table>
	</div>
	<script type="text/javascript" src="/webjars/jquery/3.7.1/jquery.min.js"></script>
	<script type="text/javascript" src="/webjars/bootstrap/5.3.2/js/bootstrap.min.js"></script>
</body>
</html>	