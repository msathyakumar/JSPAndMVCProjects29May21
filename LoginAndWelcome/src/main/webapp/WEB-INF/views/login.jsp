<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Login page</h1>
	<form name="f1" method="POST" action="welcome" style="text-align: center">
		<table border="1"  style="align: center">
			<tr>
				<td>username</td>
				<td><input type="text" name="user"></td>
			</tr>
			<tr>
				<td>password</td>
				<td><input type="text" name="password"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Click Me" /></td>
				<td><input type="reset" value="Reset" /></td>
			</tr>


		</table>


	</form>
</body>
</html>