<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" type="text/css"
			href="${pageContext.request.contextPath}/resources/css/spring-hibernate.css" />
		<title>Section 14 - Student confirmation</title>
	</head>
	<body>
		<h2>Section 14 - Student confirmation</h2>
		The student is confirmed: ${student.firstName} ${student.lastName}.
	</body>
</html>