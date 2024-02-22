<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>hello</title>
</head>
<body>
	<h1>hello this is first simple page</h1>

	<%
	Integer id = (Integer) request.getAttribute("id");
	String name = (String) request.getAttribute("name");
	Integer sal = (Integer) request.getAttribute("sal");
	out.println("id" + id);
	out.println("name" + name);
	out.println("sal" + sal);
	%>

	<br /> Id:
	<b> ${id}</b> Name
	<b> ${name}</b> Salary:
	<b> ${sal}</b>
	
	
	${msg}
</body>
</html>