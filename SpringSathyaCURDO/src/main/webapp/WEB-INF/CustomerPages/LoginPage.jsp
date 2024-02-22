<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="text-align:center">Login Here</h1>
<hr />
<form method="POST" action="loginprocess">
<table style="text-align:center">
<tr>
<td>Username/Email ID</td>
<td><input type="text" name="txtUser" /></td>
</tr>
<tr>
<td>Password</td>
<td><input type="password" name="txtPass" /></td>
</tr>
<tr>
<td colspan="2"><input type="submit" value="Login here"/></td>
</tr>
</table>
</form>
</body>
</html>