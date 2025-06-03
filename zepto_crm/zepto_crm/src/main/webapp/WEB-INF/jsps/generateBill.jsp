<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Generate bill</title>
</head>
<body>
	<h2>Generate Bill</h2>
	<form>
	<pre>
		First Name   <input type="text" name="firstName" value="${contact.firstName}" readonly>
		Last Name    <input type="text" name="lastName" value="${contact.lastName}" readonly>
		Email        <input type="email" name="email" value="${contact.email}" readonly>
		Mobile       <input type="text" name="mobile" value="${contact.mobile}" readonly>
		Amount       <input type="text" name="amount">
		Payment Mode:<input type="radio" name="paymentMode" value="Cash"> Cash <input type="radio" name="paymentMode" value="Online"> Online
			     <input type="submit"value="Save">   <input type="reset"value="Clear">
	</pre>
	</form>
</body>
</html>