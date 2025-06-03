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
	<h2>All Leads details</h2>
	<table border="1">
		<tr>
			<th>Id</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Leads Source</th>
		</tr>
		<c:forEach items="${leads}" var="lead">
		<tr>
			<td>${lead.id}</td>
			<td><a href="getLead?id=${lead.id}">${lead.firstName}</a></td>
			<td>${lead.lastName}</td>
			<td>${lead.email}</td>
			<td>${lead.mobile}</td>
			<td>${lead.leadSource}</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>