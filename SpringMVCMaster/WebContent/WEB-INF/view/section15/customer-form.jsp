<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" type="text/css"
			href="${pageContext.request.contextPath}/resources/css/spring-hibernate.css" />
		<title>Section 15 - Customer form</title>
	</head>
	<body>
		<form:form action="processForm" modelAttribute="customer">
			First name: <form:input path="firstName" />
			<br/><br/>
			Last name (*): <form:input path="lastName" />
			<form:errors path="lastName" cssClass="error" />
			<br/><br/>
			<input type="submit" value="Submit" />
		</form:form>
	</body>
</html>