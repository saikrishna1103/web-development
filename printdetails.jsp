<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h1>The details of the request user are:</h1>
<table>
<tr><td>Name:</td><td><%= session.getAttribute("name") %></td></tr><br>
<tr><td>Address:</td><td><%= session.getAttribute("add") %></td></tr><br>
<tr><td>Phone:</td><td><%= session.getAttribute("phone") %></td></tr><br>
<tr><td>Company:</td><td><%= session.getAttribute("company") %></td></tr><br>
<tr><td>Year:</td><td><%= session.getAttribute("year") %></td></tr><br>
<tr><td>compliant</td><td>:<%= session.getAttribute("compliant") %></td></tr><br>
<tr><td></td><td><a href="prof.html"><input type="submit" value="accepted"></a></td></tr>
</table>
</body>
</html>