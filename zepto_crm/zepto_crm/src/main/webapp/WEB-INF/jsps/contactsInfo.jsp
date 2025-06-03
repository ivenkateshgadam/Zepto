<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contacts info</title>
</head>
<body>
	<h2>contacts Details</h2>
	First name:	  ${contact.firstName} <br/>
	Last name:	  ${contact.lastName} <br/>
	Email:		  ${contact.email} <br/>
	Mobile:		  ${contact.mobile} <br/>
	Lead Source:  ${contact.leadSource} <br/>
	
				  <form action="sendEmail" method="post">
				  <input type="hidden" name="email" value="${contact.email}">
			   	  <input type="submit" value="send email">
				  </form>
</body>
</html>