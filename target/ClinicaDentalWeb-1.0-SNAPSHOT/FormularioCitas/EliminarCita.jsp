<%-- 
    Document   : EliminarCita
    Created on : 11 dic. 2022, 13:04:27
    Author     : jose4
--%>

<%@page import="sv.edu.ujmd.clinicadentalweb.utl.Conexion" %>
<%@page import="sv.edu.ujmd.clinicadentalweb.modelo.Citas" %>
<%@page import="java.sql.*"%>
<%@page import="com.mysql.jdbc.Driver"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Eliminar Cita</title>
    </head>
    <body>
        <%
            Conexion conectar = new Conexion();

            conectar.EstableceConexion();
            Citas c = new Citas();
            int cod = Integer.parseInt(request.getParameter("cod"));
            
            c.EliminarCita(cod);
            response.sendRedirect("Citas.jsp");
        %>
    </body>
</html>
