<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:form id="StdForm" modelAttribute="std" action="studentprocess" method="post">
<table align="center">
                    <tr>
                        <td>
                            <form:label path="id">Student id</form:label>
                        </td>
                        <td>
                            <form:input path="id" name="id" id="id" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="name">Student Name</form:label>
                        </td>
                        <td>
                            <form:input path="name" name="name" id="name" />
                        </td>
                    </tr>
 					<tr>
                        <td>
                            <form:label path="gender">Student Gender</form:label>
                        </td>
                        <td>
                            <form:input path="gender" name="gender" id="gender" />
                        </td>
                    </tr>     
                    	<tr>
                        <td>
                            <form:label path="college">College</form:label>
                        </td>
                        <td>
                            <form:input path="college" name="colleges" id="college" />
                        </td>
                    </tr>     
                          
                    	<tr>
                        <td colspan="2" style="text-align:center">
                            <form:button id="register" name="register">Register</form:button>
                        </td>
                    </tr>               
</table>
</form:form>
</body>
</html>