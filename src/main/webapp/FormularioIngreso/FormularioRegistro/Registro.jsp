<%-- 
    Document   : Registro
    Created on : 22 nov. 2022, 17:27:32
    Author     : jose4
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="Registro.css">
        <title>Registro</title>
    </head>
    <body>
        <!-- Minified Bootstrap CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <!-- Minified JS library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <!-- Minified Bootstrap JS -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

        <link href="css/bootstrap-datetimepicker.min.css" rel="stylesheet">
        <script src="js/bootstrap-datetimepicker.min.js"></script>

        <form action="../../ControladorRegistro?accion=btnRegistrar" method="post">
            <section class="form-register" style="height: 890px;" >
                <h4>Bienvenido a Maxident</h4>
                <label for="sucursal">Elija la sucursal:</label>
                <select class="controls" name="nom-sucursales" id="nom-sucursales">
                    <option value="Clinica1S">Clinica1S</option>
                    <option value="Clinica2S">Clinica2S</option>
                </select>
                <input class="controls" type="text" name="nombre" id="nombre" placeholder="Nombres" required>
                <input class="controls" type="text" name="apellido" id="apellido" placeholder="Apellidos" required>
                <label for="fecharegis">Fecha de registro:</label>
                <input class="controls" type="date" name="fecharegistro" id="fecharegistro" step="1" min="1999
                       -01-01" max="2022-12-31" required>
                <label for="fechanac">Fecha de nacimiento:</label>
                <input class="controls" type="date" name="fechanacimiento" id="fechanacimiento" step="1" value="dd/mm/aaaa" required> 
                <input class="controls" type="text" name="dui" id="dui" placeholder="DUI" required>
                <input class="controls" type="text" name="tel" id="tel" placeholder="Telefono" required>
                <input class="controls" type="text" name="usuario" id="usuario" placeholder="Usuario" required>
                <input class="controls" type="password" name="clave" id="clave" placeholder="Clave" required>
                <input class="controls" type="text" name="dir" id="dir" placeholder="Direccion" required>
                <input class="botons" id="btnRegistrar" name="btnRegistrar" type="submit" value="Registrarse">
                <p><a href="../Ingreso.jsp">¿Ya tienes cuenta? Ingresa aqui</a></p>
            </section>
        </form>
    </body>
</html>
