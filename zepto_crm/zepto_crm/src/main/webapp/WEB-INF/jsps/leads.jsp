<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>lead</title>
</head>
<body>
	<h2> Create new lead</h2>
	<form action="saveLead" method="post">
	<pre>
		First Name	<input type="text" name="firstName" required/>
		Last Name	<input type="text" name="lastName" required/>
		Email		<input type="email" name="email" required/>
		Mobile		<input type="text" name="mobile" required/>
		Lead Source:	<select name="leadSource">
 						 <option value="new paper">News Paper</option>
 						 <option value="online">Online</option>
 						 <option value="radio">Radio</option>
  						 <option value="tv commercial">Tv Commercial</option>
					</select>
				<input type="submit" value="Save"/>
	</pre>
	</form>
</body>
</html>