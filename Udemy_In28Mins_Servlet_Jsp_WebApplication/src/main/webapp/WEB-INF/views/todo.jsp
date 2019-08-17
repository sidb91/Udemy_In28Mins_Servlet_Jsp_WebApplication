<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>TODO</title>
</head>
<body>
	<p>${name} your To dos are:</p>
	<ol>
		<c:forEach items="${todos}" var="todo">
			<li>${todo.name} &nbsp; &nbsp;<a href="/deleteTodo.do?todo=${todo.name}">Delete</a></li>
		</c:forEach>
	</ol>

	<form action="/todo.do" method="post">
		<input type="text" name="todo" /><input type="submit" name="submit"
			value="Add" />
	</form>
</body>
</html>