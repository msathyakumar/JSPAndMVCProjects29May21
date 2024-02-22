<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form name="f1" method="POST" action="loginprocess">
		<!-- Here LoginProcess is @RequestMapping annotation -->
		<table style="text-align: center">
			<tr>
				<td>User Name</td>
				<td><input type="text" name="user" required /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password" required /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Login Here" /></td>
			</tr>
			<tr>
				<td colspan="2">
					<h2>${msg}</h2>
				</td>
			</tr>

		</table>
	</form>
</body>
</html>