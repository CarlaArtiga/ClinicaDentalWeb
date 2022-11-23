<%-- 
    Document   : Citas
    Created on : 22 nov. 2022, 17:59:15
    Author     : jose4
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="Citas.css">
        <title>Citas</title>
    </head>
      <body>
        <div class="container">
          <div class="title"> <b>Citas</b> </div>
            <div class="content">
              <form action="#">
                <div class="user-details">
                  <div class="input-box">
                    <span class="details">Codigo:</span>
                    <input type="text" disabled="disabled" readonly="readonly" required>
                  </div>
                  <div class="user-details">
                    <div class="input-box">
                        <span class="details">Clientes:</span>
                            <select class="form-select" aria-label="Default select example">
                                <option value=""></option>
                                <option value="">alguien</option>
                            </select>
                      </div>
                  </div>
                  <div class="user-details">
                    <div class="input-box">
                        <span class="details">Productos:</span>
                          <select class="form-select" aria-label="Default select example">
                            <option value=""></option>
                            <option value="">algo</option>
                          </select>
                    </div>
                  </div>
                  <div class="input-box">
                    <label for="fecharegis">Fecha de registro:</label>
                        <input class="controls" type="datetime-local" name="fecharegistro" id="fecharegistro" step="1">
                  </div>
                  <div class="input-box">
                    <span class="details">Descripcion</span>
                    <input type="text"  required></input>
                  </div>
                  <div class="input-box">
                    <span class="details">Dentista:</span>
                      <select class="form-select" aria-label="Default select example">
                        <option value=""></option>
                        <option value="">Alguien</option>
                      </select>
                  </div>
                  <div class="input-box">
                    <span class="details">Secretario:</span>
                      <select class="form-select" aria-label="Default select example">
                        <option value=""></option>
                        <option value="">Alguien</option>
                      </select>
                  </div>
                </div>
                <div class="gender-details">
                  <input type="radio" name="estado" id="dot-1">
                  <input type="radio" name="estado" id="dot-2">
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
                  <input type="submit" value="Agendar">
                </div>
                <div class="button">
                  <input type="submit" value="Modificar">
                </div>
                <div class="button">
                  <input type="submit" value="Eliminar">
                </div>
                <table class="table table-striped table-hover" >
                  <thead>
                    <tr onclick="click">
                      <th >CodCita&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
                      <th>Persona</th> 
                      <th>Producto</th>
                      <th>Fecha Hora</th>
                      <th>Descripcion</th>
                      <th>Dentista</th>
                      <th>Secretario</th>
                      <th>Estado</th>
                    </tr>
                  </thead>
                  <tbody >
                    <tr onclick="click">
                      <th >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
                      <th></th> 
                      <th></th>
                      <th></th>
                      <th></th>
                      <th></th>
                      <th></th>
                      <th></th>
                    </tr>
                    <tr onclick="click">
                      <th >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
                      <th></th> 
                      <th></th>
                      <th></th>
                      <th></th>
                      <th></th>
                      <th></th>
                      <th></th>
                    </tr>
                    <tr onclick="click">
                      <th >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
                      <th></th> 
                      <th></th>
                      <th></th>
                      <th></th>
                      <th></th>
                      <th></th>
                      <th></th>
                    </tr>
                    <tr onclick="click">
                      <th >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
                      <th></th> 
                      <th></th>
                      <th></th>
                      <th></th>
                      <th></th>
                      <th></th>
                      <th></th>
                    </tr>				
                    <tr onclick="click">
                      <th >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
                      <th></th> 
                      <th></th>
                      <th></th>
                      <th></th>
                      <th></th>
                      <th></th>
                      <th></th>
                    </tr>
                  </tbody>
                </table>
              </form>
            </div>
        </div>
  </body>
</html>
