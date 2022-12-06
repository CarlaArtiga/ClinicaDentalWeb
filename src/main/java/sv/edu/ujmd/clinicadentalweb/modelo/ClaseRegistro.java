/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.edu.ujmd.clinicadentalweb.modelo;

import sv.edu.ujmd.clinicadentalweb.utl.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.*;
/**
 *
 * @author LENOVO
 */
public class ClaseRegistro {
    
    private String sucursal = "Select * from sucursales";
    private Connection conectar;
    private Conexion c;

    public ClaseRegistro() {
    c = new Conexion();
        c.EstableceConexion();
        //conectar = (Connection) c;
    
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }
    
    public int InsertarUsuario(String user,String contra) throws SQLException{
        c.EstableceConexion();
        return c.ComandoSQL("call insertar_usuario('"+user+"','"+contra+"');");
    }
    
    public int InsertarPersona(String Nom, String Ape, 
                               String Fecha1, String Fecha2, int DUI, 
                               int Tel, String dir ) throws SQLException{
        c.EstableceConexion();
        //LocalDate hoy = LocalDate.now();
        //String Fecha2 = hoy.toString();
        char Estado = 'A';
        int cargo = 4;
        return c.ComandoSQL("call insertar_persona("+cargo+",'"+Nom+"','"+Ape+"','"+Fecha1+"',"
                            + "'"+Fecha2+"',"+DUI+","+Tel+",'"+dir+"','"+Estado+"');");
        
    }
}
