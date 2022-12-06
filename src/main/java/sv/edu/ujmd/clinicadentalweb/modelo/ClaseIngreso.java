
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.edu.ujmd.clinicadentalweb.modelo;

import sv.edu.ujmd.clinicadentalweb.utl.Conexion;
import static java.lang.Integer.parseInt;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class ClaseIngreso {
    private  String Usuario = "";
    private  String Clave = "";
    private  int rol;
    private Connection conectar;
    private Conexion c;
   

    public ClaseIngreso() {
        c = new Conexion();
        c.EstableceConexion();
        //conectar = (Connection) c;
    }

public int getRol() {
        return rol;
    }
    public void setRol(int rol) {
        this.rol = rol;
    }

    public Connection getConectar() {
        return conectar;
    }

    public void setConectar(Connection conectar) {
        this.conectar = conectar;
    }
    
    
    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }
    
    public boolean VerificarUsuario(String Usuario, String Clave) throws SQLException{
        Conexion c = new Conexion();
        c.EstableceConexion();
        
        ResultSet resultado;
        resultado = c.Select("CALL VerificarUsuario('"+Usuario+"','"+Clave+"');");

        if(resultado.next()){
            this.setUsuario(resultado.getString("usuarios"));
            this.setClave(resultado.getString("Clave"));
            this.setRol(resultado.getInt("Rol"));
            
            return true;
        }
        else{
            return false;
        }
    }
    /**
     *
     * @return
     * @throws SQLException
     */
     
}
