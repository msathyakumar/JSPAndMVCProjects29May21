<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Customer</title>
</head>
<body>
<h1 style="text-align:center">
<a href="add">Add New Customers</a> &nbsp;&nbsp;|&nbsp;&nbsp;
<a href="view">All Customers</a> &nbsp;&nbsp;|&nbsp;&nbsp;
<a href="login">Logout</a>
</h1>
<hr />
<form method="POST"  action="customerprocess">
<table style="text-align:center">
<tr>
<td>Customer ID :</td>
<td><input type="text" name="txtCid" required /></td>
</tr>

<tr>
<td>Customer Name :</td>
<td><input type="text" name="txtCname" required /></td>
</tr>

<tr>
<td>Customer Address :</td>
<td>
<textarea name="txtAdrs" cols="30" rows="5" required>Address here</textarea>
</td>
</tr>

<tr>
<td>Customer Location :</td>
<td><input type="text" name="txtLoc" required /></td>
</tr>

<tr>
<td>Customer Phone :</td>
<td><input tyep="text" name="txtPhone" required /></td>
</tr>

<tr>
<td>Customer Email :</td>
<td><input type="email" name="txtEmail" required /></td>
</tr>

<tr>
<td>Password For Account :</td>
<td><input type="text" name="txtPass" required /></td>
</tr>

<tr>
<td><input type="submit"  value="Add Customer" /></td>
</tr>
</table>
</form>
</body>
</html>