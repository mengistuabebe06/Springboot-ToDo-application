<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add ToDo</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ"
	crossorigin="anonymous">
<link href="webjars/bootstrap/5.1.3/css/bootstrap .min.css"
	rel="stylesheet"></link>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.10.0/css/bootstrap-datepicker.min.css"
	integrity="sha512-34s5cpvaNG3BknEWSuOncX28vz97bRI59UnVtEEpFX536A7BtZSJHsDyFoCl8S7Dt2TPzcrCEoHBGeM4SUBDBw=="
	crossorigin="anonymous" referrerpolicy="no-referrer"></link>
</head>
<body>
	<%@ include file="common/navigation.jspf" %>
	<h1>Add To Do list</h1>
	<div class="container">
		<form:form action="" method="post" modelAttribute="todo">
			<fieldset class="mb-3">
				<form:label path="description">description:</form:label>
				<form:input type="text" path="description" />
				<form:errors path="description" />
			</fieldset>
			<fieldset class="mb-3">
				<form:label path="targetDate">targetDate:</form:label>
				<form:input type="text" path="targetDate" id="targetDate" />
				<form:errors path="targetDate" />
			</fieldset>
			ID:<form:input type="hidden" path="id" />
			
			Done:<form:input type="hidden" path="done" />

			<input type="submit" class="btn btn-primary">
		</form:form>
		<h5>${description }</h5>
	</div>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.10.0/js/bootstrap-datepicker.min.js"
		integrity="sha512-LsnSViqQyaXpD4mBBdRYeP6sRwJiJveh2ZIbW41EBrNmKxgr/LFZIiWT6yr+nycvhvauz8c2nYMhrP80YhG7Cw=="
		crossorigin="anonymous" referrerpolicy="no-referrer"></script>
	<script type="text/javascript">
		$('#targetDate').datepicker({
			format : 'dd-mm-yyyy'
		});
	</script>
</body>
</html>