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

		<c:url value="/edit/${articleValue.articleName}" var="edit" />
		<c:url value="/" var="home" />
		<h1>Article: ${articleValue.articleName }</h1>
		<br />
		<div class="divider"></div>
		<br />
		<p>${articleValue.contents }</p>
		<br />
		<div class="divider"></div>
		<br />
		<div class="row">
			<div class="col s6">
				<a href="${edit}">Edit this Article!</a>
			</div>
			<div class="col s6">
				<a href="${home}">Home!</a>
			</div>
		</div>
		<div class="divider"></div>
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