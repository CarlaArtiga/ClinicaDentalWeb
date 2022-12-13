<%-- 
    Document   : EliminarPersona
    Created on : 12 dic. 2022, 12:17:50
    Author     : jose4
--%>

<%@page import="sv.edu.ujmd.clinicadentalweb.utl.Conexion" %>
<%@page import="sv.edu.ujmd.clinicadentalweb.modelo.Personas" %>
<%@page import="java.sql.*"%>
<%@page import="com.mysql.jdbc.Driver"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            Conexion conectar = new Conexion();

            conectar.EstableceConexion();
            Personas p = new Personas();
            int DUI = Integer.parseInt(request.getParameter("dui"));
            p.EliminarPersona(DUI);
            response.sendRedirect("People.jsp");
        %>
    </body>
</html>
