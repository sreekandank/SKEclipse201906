<%-- 
    Document   : stud_delete_db
    Created on : 27 Sep, 2019, 8:07:33 PM
    Author     : Sreekandan K
--%>

<%@page import="sk.controller.StudentController"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <%
       int rn = Integer.parseInt(request.getParameter("rno"));
       int status = StudentController.delete(rn);
       //int status = 0;
            if(status>0)
            {
        %>
                <script>
            alert("Record deleted successfully!");
            window.location = "stud_home.jsp";
        </script>
        <%
            }
            else
            {
        %>
        <script>
            alert("Failed! Try Again!");
            window.location = "stud_home.jsp";
        </script>
        <%
            }
        %>
    </body>
</html>
