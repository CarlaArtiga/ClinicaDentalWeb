<%-- 
    Document   : Ingreso
    Created on : 22 nov. 2022, 17:19:26
    Author     : jose4
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style.css">
        <title>Ingreso</title>
    </head>
    <body>

        <!-- Minified Bootstrap CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <!-- Minified JS library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <!-- Minified Bootstrap JS -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

        <form action="../ControladorIngreso?accion=btnIngresar" method="post">
            <div class="form-register">
                <h4>Bienvenido a Maxident</h4>
                <input class="controls" type="text" id="usuario" name="usuario" placeholder="Ingrese su usuario" required>
                <input class="controls" type="password" id="clave" name="clave" placeholder="Ingrese su clave" required>
                <!--<p>¿No tienes cuenta? <a href="#">Registrate</a></p>-->
                <!--<input class="botons" type="submit" value="Ingresar">-->
                <input class="botons" id="btnIngresar" name="btnIngresar" type="submit" value="Ingresar">
                <p><a  href="FormularioRegistro/Registro.jsp"> ¿No tienes cuenta? Registrate</a></p>
            </div> 
        </form>
    </body>
</html>
