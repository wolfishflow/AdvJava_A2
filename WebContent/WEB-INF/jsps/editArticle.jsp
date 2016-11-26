<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<link href="http://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">

<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.7/css/materialize.min.css">
<script src='https://cdn.tinymce.com/4/tinymce.min.js'></script>
<script>
	tinymce.init({
		selector : '#contents'
	});
</script>
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>A2AlanSimon</title>
</head>
<body>
	<div class="container">
		<h1>Edit this Article</h1>
		<c:url value="/" var="home" />
		<div class="divider"></div>
		<br />
		<div class="row">
			<div class="col s6">
				<a href="${home}">Head to Home</a>
			</div>
		</div>
		<div class="divider"></div>
		<br />
		<c:url value="/editArticle" var="url" />
		<form:form class="col s12" commandName="article" method="post" action="${url}">
		
		<div class="row">
			<div class="input-field col s12">
				<form:input path="articleName" required="required" />
				<label for="articleName">Article Name</label>
			</div>
		</div>
		<div class="row">
			<div class="input-field col s12">
				<form:input path="editor" required="required" />
				<label for="editor">User Name</label>
			</div>
		</div>
		<div class="row">
			<div class="input-field col s12">
				<form:textarea class="materialize-textarea" path="contents" required="required" />
				<label for="contents">Contents:</label>
			</div>
		</div>
			<input type="submit" value="Save edits" />
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