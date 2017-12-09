<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<!-- link CSS -->
		<link rel="stylesheet" type="text/css"
			href="${pageContext.request.contextPath}/resources/css/spring-hibernate.css">
		<!-- link JavaScript file -->
		<script src="${pageContext.request.contextPath}/resources/js/script.js"></script>
		<title>Hello World of Spring</title>
	</head>
	<body>
		<h2>Hello World of Spring!</h2>
		<h3>Student name: ${param.studentName}</h3>
		<h3>The message: ${message}</h3>
		<img src="${pageContext.request.contextPath}/resources/images/spring-hibernate.jpg">
		<p />
		<input type="button" onclick="doSomeWork()" value="Click me!!!" />
	</body>
</html>