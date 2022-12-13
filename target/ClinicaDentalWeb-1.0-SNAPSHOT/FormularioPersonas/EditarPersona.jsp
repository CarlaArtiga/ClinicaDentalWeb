<%-- 
    Document   : EditarPersona
    Created on : 12 dic. 2022, 01:42:41
    Author     : jose4
--%>

<%@page import="java.sql.*"%>
<%@page import="com.mysql.jdbc.Driver"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="Personas.css">
        <title>Personas</title>
    </head>
    <form action="../ControladorPersonas?accion=btnGuardar" method="get">
        <body>
            <%
                Connection con = null;
                Statement st = null;
                ResultSet rs = null;
                String usuario = "root";
                String clave = "castillo999";
                String bd = "clinicadental";
                String ip = "localhost";
                String puerto = "3306";
                //Statement stm;
                
                String cadena = "jdbc:mysql://" + ip + ":" + puerto + "/" + bd;
                
                int cargos = Integer.parseInt(request.getParameter("cargos"));
                String Nom = request.getParameter("nombre");
                String Ape = request.getParameter("apellido");
                String FechaNac = request.getParameter("fechanacimiento");
                String FechaReg = request.getParameter("fecharegistro");
                int DUI = Integer.parseInt(request.getParameter("dui"));
                int Tel = Integer.parseInt(request.getParameter("tel"));
                String Dir = request.getParameter("dir");
                String Activo = request.getParameter("estado");
                String Desactivo = request.getParameter("estado");
            %>
            <div class="container">
                <div class="title">Gestion <b>Personas</b> </div>
                <div class="content">
                    <form action="#">
                        <div class="user-details">
                            <div class="user-details">
                                <div class="input-box">
                                    <span class="details">Cargo</span>
                                    <input type="text" id="cargos" name="cargos" value="<%=cargos %>" required>
                                </div>
                            </div>
                            <div class="user-details">
                                <div class="input-box">
                                    <span class="details">Nombre:</span>
                                    <input type="text" id="nombre" name="nombre" value="<%=Nom %>" required>
                                </div>
                            </div>
                            <div class="user-details">
                                <div class="input-box">
                                    <span class="details">Apellido:</span>
                                    <input type="text" id="apellido" name="apellido" value="<%=Ape %>" required>
                                </div>
                            </div>
                            <div class="input-box">
                                <span class="details" for="fechanac">Fecha de Nacimiento:</span>
                                <input class="controls" type="date" name="fechanacimiento" value="<%=FechaNac %>" id="fechanacimiento" step="1" value="dd/mm/aaaa" required> 
                            </div>
                            <div class="input-box">
                                <span class="details" for="fecharegis">Fecha de Registro:</span>
                                <input class="controls" type="date" name="fecharegistro" value="<%=FechaReg %>" id="fecharegistro" step="1" value="dd/mm/aaaa" required> 
                            </div>
                            <div class="input-box">
                                <span class="details">DUI:</span>
                                <input type="text" id="dui" name="dui" value="<%=DUI %>" required>
                            </div>
                            <div class="input-box">
                                <span class="details">Telefono:</span>
                                <input type="text" id="tel" name="tel" value="<%=Tel %>" required>
                            </div>
                            <div class="input-box">
                                <span class="details">Direccion:</span>
                                <input type="text" id="dir" name="dir" value="<%=Dir %>" required>
                            </div>
                        </div>
                        <div class="gender-details">
                            <input type="radio" name="estado1" id="dot-1">
                            <input type="radio" name="estado2" id="dot-2">
                            <input type="radio" name="estado" id="dot-3">
                            <span class="estado-title">Estado</span>
                            <div class="category">
                                <label for="dot-1">
                                    <span class="dot one"></span>
                                    <span class="estado">Activo</span> 
                                </label>
                                <label for="dot-2">
                                    <span class="dot two"></span>
                                    <span class="estado">Desactivo</span>
                                </label>
                            </div>
                        </div>
                        <div class="button">
                            <input type="submit" id="btnGuardar" name="btnGuardar" value="Guardar">
                        </div>
                        <table class="table table-striped table-hover" >
                            <thead>
                                <tr>
                                    <th scope="col" >Cargos</th>
                                    <th scope="col" >Nombre</th> 
                                    <th scope="col" >Apellido</th>
                                    <th scope="col" >Fecha de Nacimiento</th>
                                    <th scope="col" >Fecha de Registro</th>
                                    <th scope="col" >DUI</th>
                                    <th scope="col" >Telefono</th>
                                    <th scope="col" >Direccion</th>
                                    <th scope="col">Estado</th>
                                    <th scope="col" >Acciones</th>
                                </tr>
                            </thead>
                            <tbody >
                                <%
                                    try {
                                        Class.forName("com.mysql.jdbc.Driver");
                                        con = DriverManager.getConnection(cadena, usuario, clave);
                                        //con = DriverManager.getConnection("jdbc:mysql://localhost/clinicadental?user=root&password=castillo999");
                                        st = con.createStatement();
                                        rs = st.executeQuery("SELECT * FROM clinicadental.personas;");
                                        while (rs.next()) {
                                %>
                                <tr>
                                    <td scope="row" ><%= rs.getInt(2)%></td>
                                    <td><%= rs.getString(3)%></td> 
                                    <td><%= rs.getString(4)%></td>
                                    <td><%= rs.getString(5)%></td>
                                    <td><%= rs.getString(6)%></td>
                                    <td><%= rs.getInt(7)%></td>
                                    <td><%= rs.getString(8)%></td>
                                    <td><%= rs.getString(9)%></td>
                                    <td><%= rs.getString(10)%></td>
                                    <td>
                                        <a class="btn btn-danger" href="EditarPersona.jsp?cargos=<%=rs.getString(2)%>&nombre=<%=rs.getString(3)%>&apellido=<%=rs.getString(4)%>&fechanacimiento=<%=rs.getString(5)%>&fecharegistro=<%=rs.getString(6)%>&dui=<%=rs.getInt(7)%>&tel=<%=rs.getString(8)%>&dir=<%=rs.getString(9)%>&estado=<%=rs.getString(10)%>">Editar</a>
                                        <a class="btn btn-danger" href="EliminarPersona.jsp?dui=<%=rs.getInt(7)%>">Eliminar</a>
                                    </td>
                                </tr>
                                <%
                                        }
                                    } catch (Exception e) {
                                        out.print("error mysql" + e);
                                    }
                                %>
                            </tbody>
                        </table>
                    </form>
                </div>
            </div>
        </body>
    </form>
</html>
