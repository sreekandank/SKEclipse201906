<%-- 
    Document   : stud_update_form
    Created on : 27 Sep, 2019, 8:06:23 PM
    Author     : Sreekandan K
--%>

<%@page import="sk.bean.Student"%>
<%@page import="sk.controller.StudentController"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="bootstrap.min.css"/>
    </head>
<body>
    <%
       int rn = Integer.parseInt(request.getParameter("rno"));
       Student st = StudentController.getRecordByRno(rn);      
    %>
<div class="jumbotron col-md-4" >
<form method="post" action="stud_update_db.jsp">
    <div class="form-group">
        <label>RollNo:</label>
        <input type="text" name="rno" class="form-control" value="<%=st.getRno()%>">
    </div>
    <div class="form-group">
        <label>Student Name:</label>
        <input type="text" name="stud_name" class="form-control" value="<%=st.getSname()%>">
    </div>
    <div class="form-group">
        <label>Department:</label>
        <input type="text" name="dept" class="form-control" value="<%=st.getDept()%>">
    </div>
    <button type="submit" class="btn btn-primary">Save</button> 
</form>
</div>
</body>
</html>
