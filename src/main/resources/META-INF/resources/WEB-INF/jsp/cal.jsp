<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ"
	crossorigin="anonymous">
</head>
<body>
	<h2>calculator</h2>
	<div class="container">
	
		<form action="" method="post" class="form-control">
			Num1:<input type="number" name="numa" required="required"/>
			Num2:<input type="number" name="numb" required="required"/>
			Opration: <select name ="opt" id="opt" class="select">
				<option value="+" selected="selected">+</option>
				<option value="-">-</option>
				<option value="*">*</option>
				<option value="/">/</option>
			</select>
			<input type="submit" value="Equal" class="btn btn-primary">
		</form>
		
		<div>
			<p>Result:</p>
			<p>${add }</p>
			<p>${sub }</p>
			<p>${mul }</p>
			<p>${diva }</p>
			<p>${error }</p>
		</div>
	</div>
</body>
</html>