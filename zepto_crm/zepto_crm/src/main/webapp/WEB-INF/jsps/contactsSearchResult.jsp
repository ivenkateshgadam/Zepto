<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>leads result</title>
</head>
<body>
	<p><a href="lead">New Lead</a></p>
	<h2>All Contacts details</h2>
	<table border="1">
		<tr>
			<th>Id</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Leads Source</th>
			<th>Billing</th>
		</tr>
		<c:forEach items="${contacts}" var="contact">
		<tr>
			<td>${contact.id}</td>
			<td><a href="getContactById?id=${contact.id}">${contact.firstName}</a></td>
			<td>${contact.lastName}</td>
			<td>${contact.email}</td>
			<td>${contact.mobile}</td>
			<td>${contact.leadSource}</td>
			<td><a href="generateBill?contactId=${contact.id}">billing</a></td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>