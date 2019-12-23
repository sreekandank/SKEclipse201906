<%-- 
    Document   : stud_update_db
    Created on : 27 Sep, 2019, 8:06:42 PM
    Author     : Sreekandan K
--%>

<%@page import="sk.controller.StudentController"%>
<%@page import="sk.bean.Student"%>
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
            String n = request.getParameter("stud_name");
            String d = request.getParameter("dept");
            Student st = new Student();
            st.setRno(rn);
            st.setSname(n);
            st.setDept(d);
            int status = StudentController.update(st);
            if(status>0)
            {
        %>
                <script>
            alert("Record updated successfully!");
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