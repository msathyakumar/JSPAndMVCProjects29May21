<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

  <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String st = request.getParameter("cinfo");
%>
<h1>Welcome to : <%=st %> 

</h1>

<table width="100%" border=1>
<tr>
	<th>Customer ID</th>
	<th>Customer Name</th>
	<th>Customer Address</th>
	<th>Location</th>
	<th>Phone Number</th>
	<th>Email</th>
	<th>Password</th>
	
</tr>
<c:forEach var="cs" items="${list}">   
   <tr>  
   <td>${cs.custid}</td>  
    <td>${cs.custname}</td>
    <td>${cs.caddress}</td>
    <td>${cs.location}</td>
    <td>${cs.phone}</td>
    <td>${cs.email}</td>
    <td>${cs.pwd}</td>   
   
   </tr>  
   </c:forEach> 
</table>

</body>
</html>