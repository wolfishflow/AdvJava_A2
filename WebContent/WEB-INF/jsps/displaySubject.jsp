<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- <link href="http://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">

<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.7/css/materialize.min.css"> -->
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- <script type="text/javascript"
		src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.7/js/materialize.min.js"></script> -->

	<div class="container">
		<h1>List of Articles under </h1>
		<c:url value="/addArticle" var="addUrl" />
		<a href="${addUrl}">Add an Article!</a>
		<table class="striped">
			<thead>
				<tr>
					<th data-field="articleName">Article Name</th>
					<th data-field="lastModified">Last Modified</th>
					<th data-field="editor">Editor</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="item" items="${subject}">
					<c:url value="/article/${item.id}" var="retrieveUrl" />
					<tr>
						<td><a href="${retrieveUrl}">${item.articleName}</a></td>
						<td>${item.lastModified}</td>
						<td>${item.editor}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

	<script type="text/javascript">
		$(document).ready(function() {
			$('select').material_select();
		});
	</script>
</body>
</html>