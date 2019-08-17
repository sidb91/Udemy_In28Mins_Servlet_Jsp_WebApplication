<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%-- <%@ page import="java.util.Date" %>  --%><!-- Import a java resource -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<!-- We can write java code in a JSP through a script let -->
<%-- <% 
	System.out.println("Testing a JSP scriptlet code"+request.getParameter("name"));

	Date date = new Date();
%> --%>

<%-- <div>Current Date is : <%=date%></div> --%> <!-- Scriplet expressions -->

<!-- Creating a form to do a post request from browser -->
	<div id="formContainer">
		<form action="/login.do" method="post">
			<label for="name">Please enter your name : <input type="text" id="name" name="name"/></label><br/>
			<label for="password">Please enter your password : <input type="password" id="password" name="password"/></label>
			<input type="submit" value="Login"/>
			<div style="color:red;"><p>${errorMessage}</p></div>
		</form>
	</div>
</body>
</html>