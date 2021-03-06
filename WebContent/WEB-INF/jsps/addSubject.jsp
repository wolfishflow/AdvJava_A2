<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="http://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">

<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.7/css/materialize.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>A2AlanSimon</title>
</head>
<body>
	<div class="container">
		<h1>Add a Subject</h1>
		<c:url value="/" var="home" />
		<c:url value="/saveSubject" var="url" />
		<div class="divider"></div>
		<br />
		<div class="row">
			<div class="col s6">
				<a href="${home}">Head to Home</a>
			</div>
		</div>
		<div class="divider"></div>
		<br />
		<form:form commandName="subject" method="post" action="${url}">
		Subject Name: <form:input path="name" required="required"/>
			<br />
			<input type="submit" value="Save Subject" />
		</form:form>
	</div>
	<script type="text/javascript"
		src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.7/js/materialize.min.js"></script>
	<script type="text/javascript">
		$(document).ready(function() {
			$('select').material_select();
		});
	</script>
</body>
</html>