<%-- 
    Document   : Citas
    Created on : 22 nov. 2022, 17:59:15
    Author     : jose4
--%>

<%@page import="java.sql.*"%>
<%@page import="com.mysql.jdbc.Driver"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="Citas.css">
        <title>Citas</title>
    </head>
    <form action="../ControladorCitas?accion=btnAgendar" method="post">
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
            %>
            <div class="container">
                <div class="title"> <b>Citas</b> </div>
                <div class="content">
                    <form action="#">
                        <div class="user-details">
                            <div class="input-box">
                                <span class="details">Codigo:</span>
                                <input type="text" id="cod" name="cod" disabled="disabled" readonly="readonly" required>
                            </div>
                            <div class="user-details">
                                <div class="input-box">
                                    <span class="details">Clientes:</span>
                                    <input type="text" id="personas" name="personas" placeholder="ingrese el cliente" required>
                                </div>
                            </div>
                            <div class="user-details">
                                <div class="input-box">
                                    <span class="details">Productos:</span>
                                    <input type="text" id="productos" name="productos" placeholder="ingrese el producto" required>
                                </div>
                            </div>
                            <div class="input-box">
                                <label for="fecharegis">Fecha y hora</label>
                                <input class="controls" type="datetime-local" name="fechahora" id="fechahora" step="1">
                            </div>
                            <div class="input-box">
                                <span class="details">Descripcion</span>
                                <input type="text" id="desc" name="desc" required></input>
                            </div>
                            <div class="input-box">
                                <span class="details">Dentista:</span>
                                <input type="text" id="dentista" name="dentista" placeholder="ingrese el dentista" required>
                            </div>
                            <div class="input-box">
                                <span class="details">Secretario:</span>
                                <input type="text" id="secre" name="secre" placeholder="ingrese el secretario" required>
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
                                    <span class="estado">Atendido</span> 
                                </label>
                                <label for="dot-2">
                                    <span class="dot two"></span>
                                    <span class="estado">Cancelado</span>
                                </label>
                            </div>
                        </div>
                        <div class="button">
                            <input type="submit" id="btnAgendar" name="btnAgendar" value="Agendar">
                        </div>
                        <table class="table table-striped table-hover" >
                            <thead>
                                <tr >
                                    <th scope="col" >CodCita&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
                                    <th scope="col" >Persona</th> 
                                    <th scope="col" >Producto</th>
                                    <th scope="col" >Fecha Hora</th>
                                    <th scope="col" >Descripcion</th>
                                    <th scope="col" >Dentista</th>
                                    <th scope="col" >Secretario</th>
                                    <th scope="col" >Estado</th>
                                    <th scope="col" >Acciones</th>
                                </tr>
                            </thead>
                            <tbody >
                                
                            <c:forEach var="citas" in="clinicadental.citas">
                                <%
                                    try {
                                        Class.forName("com.mysql.jdbc.Driver");
                                        con = DriverManager.getConnection(cadena, usuario, clave);
                                        //con = DriverManager.getConnection("jdbc:mysql://localhost/clinicadental?user=root&password=castillo999");
                                        st = con.createStatement();
                                        rs = st.executeQuery("SELECT * FROM clinicadental.citas;");
                                        while (rs.next()) {
                                %>
                                <tr>
                                    <td scope="row" ><%= rs.getInt(1)%> <c:out value="${rs.getInt(1)}" /> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
                                    <td><%= rs.getString(2)%></td> 
                                    <td><%= rs.getString(3)%></td>
                                    <td><%= rs.getString(4)%></td>
                                    <td><%= rs.getString(5)%></td>
                                    <td><%= rs.getString(6)%></td>
                                    <td><%= rs.getString(7)%></td>
                                    <td><%= rs.getString(8)%></td>
                                    <td>
                                        <a class="btn btn-danger" href="EditarCita.jsp?cod=<%=rs.getInt(1)%>&personas=<%=rs.getString(2)%>&productos=<%=rs.getString(3)%>&fechahora=<%=rs.getString(4)%>&desc=<%=rs.getString(5)%>&dentista=<%=rs.getString(6)%>&secre=<%=rs.getString(7)%>&estado=<%=rs.getString(8)%>">Editar</a>
                                        <a class="btn btn-danger" href="EliminarCita.jsp?cod=<%=rs.getInt(1)%>">Eliminar</a>
                                    </td>
                                </tr>
                                <%
                                        }
                                    }catch (Exception e){
                                        out.print("error mysql" + e);
                                    }
                                %>

                                </c:forEach>
                            </tbody>
                        </table>
                    </form>
                </div>
            </div>
        </body>
    </form>
</html>