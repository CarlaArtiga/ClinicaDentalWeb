<%-- 
    Document   : Principal
    Created on : 22 nov. 2022, 17:42:45
    Author     : jose4
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Principal</title>
        <link href="https://fonts.googleapis.com/css?family=Raleway|Open+Sans" rel="stylesheet">
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <style>
	body {
		background: #eeeeee;
		font-family: 'Open Sans', sans-serif;
	}
    .form-inline {
        display: inline-block;
    }
	.navbar {
		font-size: 14px;
		background: #fff;
		padding-left: 16px;
		padding-right: 16px;
		border-bottom: 1px solid #d6d6d6;
		box-shadow: 0 0 4px rgba(0,0,0,.1);		
	}
	.navbar .navbar-brand {
		color: #555;
		padding-left: 0;
		font-size: 20px;
		padding-right: 50px;
		font-family: 'Raleway', sans-serif;
		text-transform: uppercase;
	}
	.navbar .navbar-brand b {
		font-weight: bold;
		color: #f04f01;
	}
	.navbar ul.nav li {
		font-size: 96%;
		font-weight: bold;		
		text-transform: uppercase;
	}
	.navbar ul.nav li.active a, .navbar ul.nav li.active a:hover, .navbar ul.nav li.active a:focus {
		color: #f04f01 !important;
		background: transparent !important;
	}
	.search-box {
        position: relative;
    }
	.search-box input.form-control, .search-box .btn {
		font-size: 14px;
		border-radius: 2px !important;
	}
	.search-box .input-group-btn {
		padding-left: 4px;		
	}
	.search-box input.form-control:focus {
		border-color: #f04f01;
		box-shadow: 0 0 8px rgba(240,79,1,0.2);
	}
	.search-box .btn-primary, .search-box .btn-primary:active {
		font-weight: bold;
		background: #f04f01;
		border-color: #f04f01;
		text-transform: uppercase;
		min-width: 90px;
	}
	.search-box .btn-primary:focus {
		outline: none;
		background: #eb4e01;
		box-shadow: 0 0 8px rgba(240,79,1,0.2);
	}
	.search-box .btn span {
		transform: scale(0.9);
		display: inline-block;
	}
	.navbar ul li i {
		font-size: 18px;
	}
	.navbar .dropdown-menu i {
		font-size: 16px;
		min-width: 22px;
	}
	.navbar .dropdown.open > a {
		background: none !important;
	}
	.navbar .dropdown-menu {
		border-radius: 1px;
		border-color: #e5e5e5;
		box-shadow: 0 2px 8px rgba(0,0,0,.05);
	}
	.navbar .dropdown-menu li a {
		color: #777;
		padding: 8px 20px;
		line-height: normal;
		font-size: 14px;
	}
	.navbar .dropdown-menu li a:hover, .navbar .dropdown-menu li a:active {
		color: #333;
	}
	.navbar .navbar-form {
		border: none;
	}
	@media (min-width: 992px){
		.form-inline .input-group .form-control {
			width: 225px;			
		}
	}
	@media (max-width: 992px){
		.form-inline {
			display: block;
		}
	}
</style>
    </head>
    <body>
<nav class="navbar navbar-default navbar-expand-lg navbar-light">
	<div class="navbar-header">
		<a class="navbar-brand" style="color: rgba(38, 170, 187, 0.901);" href="#">Maxi<b>dent</b></a>  		
		<button type="button" data-target="#navbarCollapse" data-toggle="collapse" class="navbar-toggle">
			<span class="navbar-toggler-icon"></span>
			<span class="icon-bar"></span>
			<span class="icon-bar"></span>
			<span class="icon-bar"></span>
		</button>
	</div>
	<!-- Collection of nav links, forms, and other content for toggling -->
	<div id="navbarCollapse" class="collapse navbar-collapse">
		<ul class="nav navbar-nav">
			<li><a href="#">Inicio</a></li>
			<li><a href="#"></a></li>			
			<li class="dropdown">
				<a data-toggle="dropdown" class="dropdown-toggle" href="#">Personas <b class="caret"></b></a>
				<ul class="dropdown-menu">					
					<li><a href="FormularioPersonas/Personas.jsp">Personas</a></li>
					<li><a href="FormularioUsuarios/Usuarios.jsp">Usuarios</a></li>
				</ul>
			</li>
			<li class="active"><a href="FormularioCitas/Citas.jsp">Citas</a></li>
			<li><a href="#">Productos</a></li>
			<li class="dropdown">
				<a data-toggle="dropdown" class="dropdown-toggle" href="#">Ticket <b class="caret"></b></a>
				<ul class="dropdown-menu">					
					<li><a href="#">Factura</a></li>
					<li><a href="FormularioTicket/Ticket.jsp">Imprimir ticket</a></li>
				</ul>
			</li>
		</ul>
	</div>
</nav>
</body>
</html>
