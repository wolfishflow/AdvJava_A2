<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="http://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">

<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.7/css/materialize.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<script type="text/javascript"
		src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.7/js/materialize.min.js"></script>
	<h1> - update</h1>

	<h3></h3>
	<c:url value="/saveStudent" var="url" />
	<form:form commandName="student" method="post" action="${url}">
		Name: <form:input path="name" /><br/>
		Instrument: <form:input path="music.instrument" /><br/>
		Song Writer: <form:checkbox path="music.songWriter" /><br/>
		Genre: <form:select path="music.genre" items="${student.music.genres}"/><br/>
		<input type="submit" value="Save Student"/>
	</form:form>
</body>
</html>