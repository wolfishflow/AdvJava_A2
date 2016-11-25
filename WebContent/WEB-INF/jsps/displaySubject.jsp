<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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
	
		<h1>List of Articles under ${subjectName}</h1>
		<c:url value="/addArticle/${subjectName}" var="addUrl" />
		<c:url value="/" var="home" />
		<div class="divider"></div>
		<br />
		<div class="row">
			<div class="col s6">
				<a href="${addUrl}">Add an Article!</a>
			</div>
			<div class="col s6">
				<a href="${home}">Home!</a>
			</div>
		</div>
		<div class="divider"></div>

		<br />
		<table class="striped">
			<thead>
				<tr>
					<th data-field="articleName">Article Name</th>
					<th data-field="editor">Editor</th>
					<th data-field="lastModified">Last Modified</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="item" items="${articleList}">
					<c:url value="/article/${item.articleName}" var="retrieveUrl" />
					<tr>
						<td><a href="${retrieveUrl}">${item.articleName}</a></td>
						<td>${item.editor}</td>
						<td><fmt:formatDate type="both" dateStyle="short"
								value="${item.lastModified}" /></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<br />
		<div class="divider"></div>
		<br />
		<div class="row">
			<div class="col s6">
				<a href="${addUrl}">Add an Article!</a>
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