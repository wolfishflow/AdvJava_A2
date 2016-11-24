<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
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

	<h1>add Article</h1>
	
	<c:url value="/saveArticle" var="url" />
	<form:form commandName="subject" method="post" action="${url}">
	<form:label path="name">${subjectName}</form:label>
		Subject Name: <form:input path="name" value="${subjectName}" readonly="true"/><br/>
		Article name: <form:input path="article.articleName" /><br/>
		User name: <form:input path="article.editor" /><br/>
		Contents: <form:input path="article.contents" /><br/>
		<input type="submit" value="Save Subject"/>
	</form:form>
<script type="text/javascript">
	$(document).ready(function() {
	    $('select').material_select();
	  });
</script>
</body>
</html>