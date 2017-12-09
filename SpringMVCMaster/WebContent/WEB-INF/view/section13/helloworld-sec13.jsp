<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		
		<!-- link the CSS -->
		<link rel="stylesheet" type="text/css"
			href="${pageContext.request.contextPath}/resources/css/spring-hibernate.css" />
		
		<title>Hello World of Spring - Request Params and Request Mappings</title>
	</head>
	<body>
		<h2>Hello World of Spring - Request Params and Request Mappings</h2>
		<h3>Your name: ${param.studentName}</h3>
		<h3>Message: ${message}</h3>
		<p />
		<img src="${pageContext.request.contextPath}/resources/images/spring-hibernate.jpg" />
	</body>
</html>