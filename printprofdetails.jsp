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
<h1>Professional details</h1>
<table>
<tr>
<td>professional name:</td><td><%= session.getAttribute("pname") %></td></tr><br>
<tr><td>
professional phone number:</td><td><%= session.getAttribute("pphone") %></td></tr><br>
<h2> pls contact .After completeing the service pls give feedback  </h2>
</body>
</html>