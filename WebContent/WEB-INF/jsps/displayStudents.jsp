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

	<h1>disp</h1>
	<c:forEach var="student" items="${studentList}">
	<c:url value="/retrieve/${item.id}" var="updateUrl"/>
		<p>
			id: ${student.id}<br />
			Name: ${student.name}<br /> Song Writer: ${student.music.songWriter}<br />
			Instrument: ${student.music.instrument}<br /> Genre:
			${student.music.genre}<br />
			<a href="${updateUrl}">UPDATE</a><br />
		</p>
	</c:forEach>
	<c:url value="/" var="addUrl" />
	<a href="${addUrl}">Add a Student</a>

	<script type="text/javascript">
		$(document).ready(function() {
			$('select').material_select();
		});
	</script>
</body>
</html>