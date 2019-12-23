<%-- 
    Document   : stud_home
    Created on : 27 Sep, 2019, 5:06:57 PM
    Author     : Sreekandan K
--%>

<%@page import="java.util.Iterator"%>
<%@page import="sk.controller.StudentController"%>
<%@page import="java.util.List"%>
<%@page import="sk.bean.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="bootstrap.min.css"/>
    </head>
<body>
    <h1>STUDENT RECORD MANAGEMENT SYSTEM</h1><hr/><br/>
<h3>Student Record</h3>
<table class="table table-bordered">
<tr>
<th>Roll Number</th>
<th>Name</th>
<th>Department</th>
<th>Action</th>
</tr>
<%
    List<Student> list = StudentController.getAllRecords();
    Iterator<Student> itr=list.iterator();
    while(itr.hasNext())
    {
        Student st=itr.next();
%>
<tr>
<td><%=st.getRno()%></td>
<td><%=st.getSname()%></td>
<td><%=st.getDept()%></td>
<td><a href="stud_update_form.jsp?rno=<%=st.getRno()%>">Update</a> || <a href="stud_delete_db.jsp?rno=<%=st.getRno()%>">Delete</a></td>
</tr>
<%
}
%>
</table>
<br/>
<a href="stud_insert_form.html">Add New Record</a>
</body>
</html>
