<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<span>Status:<%=request.getParameter("status") %></span>
<form action="Register.jsp" method="post">  
Name:<input type="text" name="name" required/><br><br/>  
Password:<input type="password" name="password" required/><br><br/>  
Email ID:<input type="email" name="email" required/><br/><br/>  
<input type="submit" value="Register"/> 
</form>  
</body>
</html>