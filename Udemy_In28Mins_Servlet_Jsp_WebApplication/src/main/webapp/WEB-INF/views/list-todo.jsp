<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Todos</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">

<style>
.footer {
	position: absolute;
	bottom: 0;
	width: 100%;
	height: 60px;
	background-color: #f5f5f5;
}
</style>
</head>

<body>

	<nav class="navbar navbar-default">

		<a href="/" class="navbar-brand">Brand</a>

		<ul class="nav navbar-nav">
			<li class="active"><a href="#">Home</a></li>
			<li><a href="/list-todo.do">Todos</a></li>
			<li><a href="http://www.in28minutes.com">In28Minutes</a></li>
		</ul>

		<ul class="nav navbar-nav navbar-right">
			<li><a href="/logout.do">Logout</a></li>
		</ul>

	</nav>

	<div class="container">
		<H1>Welcome ${name}</H1>
		<p>Your To dos are:</p>
		<ol>
			<c:forEach items="${todos}" var="todo">
				<li>${todo.name}&nbsp; &nbsp;${todo.category}&nbsp; &nbsp;<a href="/deleteTodo.do?todo=${todo.name}&category=${todo.category}">Delete</a></li>
			</c:forEach>
		</ol>
		
		<a href="/add-todo.do">Add New Todo</a>
		
		<p><font color="red">${errorMessage}</font></p>
					
		<!-- <form action="/add-todo.do" method="post">
			Add Your To Do <input type="text" name="todo" /><input type="submit" name="submit"
				value="Add" />
		</form> -->
	</div>

	<footer class="footer">
		<div>footer content</div>
	</footer>

	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</body>

</html>