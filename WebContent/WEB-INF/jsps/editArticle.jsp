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
		<form:form commandName="article" method="post" action="${url}">
		Article name: <form:input path="articleName"
				value="${articleValue.articleName}" />
			<br />
		User name: <form:input path="editor" value="${articleValue.editor}" />
			<br />
			Input Version: <form:input path="contents"
				value="${articleValue.contents }" />
			<br />
			<br />
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