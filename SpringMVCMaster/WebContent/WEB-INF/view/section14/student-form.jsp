<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Section 14 - Student form</title>
	</head>
	<body>
		<form:form action="processForm" modelAttribute="student">
			First name: <form:input path="firstName" />
			<br />
			Last name: <form:input path="lastName" />
			<br />
			Country: 
			<form:select path="country">
				<%--
				<form:option value="Russian Federation" label="Russian Federation" />
				<form:option value="Ukraine" label="Ukraine" />
				<form:option value="Kazakhstan" label="Kazakhstan" />
				--%>
				<form:options items="${countryOptions}" />
			</form:select>
			<br />
			Favorite Programming Language:
			<br />
			<%-- 
			Java <form:radiobutton path="favoriteLang" value="Java" />
			Python <form:radiobutton path="favoriteLang" value="Python" />
			C# <form:radiobutton path="favoriteLang" value="C#" />
			Ruby <form:radiobutton path="favoriteLang" value="Ruby" />
			--%>
			<form:radiobuttons path="favoriteLang" items="${student.favoriteLangOptions}" />
			<br />
			<input type="submit" value="Submit" />
		</form:form>
	</body>
</html>