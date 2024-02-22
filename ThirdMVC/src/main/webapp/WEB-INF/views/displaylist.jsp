<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.spring.beanpack.emp.Employee,java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee details</title>
</head>
<body>
<%
List<Employee> mylist = (List<Employee>)request.getAttribute("employee");
for(Employee emp:mylist){
	out.println(emp);
}

%>

</body>
</html>