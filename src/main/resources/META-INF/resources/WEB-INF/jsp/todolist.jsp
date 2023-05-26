<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ"
	crossorigin="anonymous">

</head>
<body>

	<%@ include file="common/navigation.jspf" %>

	<div class="container">
		<h1>to do list of users ${name }</h1>
		<p>${todo }</p>
		<table class="table">
			<thead>
				<tr>
					<th>ID</th>
					<th>Description</th>
					<th>Target Date</th>
					<th>Is Done?</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${todo}" var="todo">
					<tr>
						<td>${todo.id}</td>
						<td>${todo.description}</td>
						<td>${todo.targetDate }</td>
						<td>${todo.done }</td>
						<td><a href="delete-todo?id=${todo.id }"><button
									class="btn btn-danger">Delete ${todo.id }</button></a> <a
							href="add-todo"><button class="btn btn-success">Add</button></a>
							<a href="update-todo?id=${todo.id }"><button
									class="btn btn-primary">Update ${todo.id }</button></a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<a href="add-todo"><button class="btn btn-success">Add
				ToDo</button></a>
	</div>

	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.7.0/jquery.min.js"
		integrity="sha512-3gJwYpMe3QewGELv8k/BX9vcqhryRdzRMxVfq6ngyWXwo03GFEzjsUm8Q7RZcHPHksttq7/GFoxjCVUjkjvPdw=="
		crossorigin="anonymous" referrerpolicy="no-referrer"></script>


</body>
</html>