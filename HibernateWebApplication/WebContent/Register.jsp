<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="sk.hibernate.dao.UserDao"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 
<jsp:useBean id="obj" class="sk.hibernate.pojo.User">  
</jsp:useBean>  
<jsp:setProperty property="*" name="obj"/>  
  
<%  
int i=UserDao.register(obj);
if(i>0)
	response.sendRedirect("RegisterForm.jsp?status=Registration Success");
else
	response.sendRedirect("RegisterForm.jsp?status=Registration Faild");
%>

</body>
</html>