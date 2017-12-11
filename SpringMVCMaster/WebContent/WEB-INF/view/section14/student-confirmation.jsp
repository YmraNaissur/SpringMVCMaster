<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
		<br />
		Student's country code is ${student.country}.
		<br />
		Student's favorite programming language is ${student.favoriteLang}.
		<p>Operating systems:
		<ul>
			<c:forEach var="os" items="${student.operatingSystems}">
				<li>${os}</li>
			</c:forEach>
		</ul>
	</body>
</html>