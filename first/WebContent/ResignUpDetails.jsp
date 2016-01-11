<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Learning Web Application</title>
<style type="text/css">
body {background-color:grey;font-size:20;font-family:arial;}
</style>
</head>
<body>

<p align = right>Passwords mismatch. Pleasse reenter password.<br/>
Please fill in all the details.<br/><hr/>
<%
RequestDispatcher rd= request.getRequestDispatcher("/signUpDetails.html");
rd.forward(request, response);
%>

</body>
</html>