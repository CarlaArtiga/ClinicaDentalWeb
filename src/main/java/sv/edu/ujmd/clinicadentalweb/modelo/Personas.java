/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.edu.ujmd.clinicadentalweb.modelo;

import sv.edu.ujmd.clinicadentalweb.utl.Conexion;
//import static com.mysql.cj.conf.PropertyKey.logger;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO
 */
public class Personas {
    private String Select_Cargos = "select * from cargos";
    private String Select_PersonaVw = "select * from personas_vw;";
    private int Cargo;
    private String Nombre;
    private String Apellido;
    private String FechaNac;
    private String FechaRegistro;
    private int DUI;
    private int Telefono;
    private String Estado;
    
    

    public Personas() {
    }

    public String getSelect_PersonaVw() {
        return Select_PersonaVw;
    }

    public void setSelect_PersonaVw(String Select_PersonaVw) {
        this.Select_PersonaVw = Select_PersonaVw;
    }

    
    public String getSelect_Cargos() {
        return Select_Cargos;
    }

    public void setSelect_Cargos(String Select_Cargos) {
        this.Select_Cargos = Select_Cargos;
    }

    public int getCargo() {
        return Cargo;
    }

    public void setCargo(int Cargo) {
        this.Cargo = Cargo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getFechaNac() {
        return FechaNac;
    }

    public void setFechaNac(String FechaNac) {
        this.FechaNac = FechaNac;
    }

    public String getFechaRegistro() {
        return FechaRegistro;
    }

    public void setFechaRegistro(String FechaRegistro) {
        this.FechaRegistro = FechaRegistro;
    }

    public int getDUI() {
        return DUI;
    }

    public void setDUI(int DUI) {
        this.DUI = DUI;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
    public DefaultTableModel CargarPersona(){
        DefaultTableModel tabla = new DefaultTableModel();
        Conexion conectar = new Conexion();
        try{
            Connection c;
            c = conectar.EstableceConexion();
            Statement stm = c.createStatement();
            ResultSet resultado = stm.executeQuery(this.getSelect_PersonaVw());
            ResultSetMetaData md = resultado.getMetaData();
            int columnas = md.getColumnCount();
            for(int i = 1; i<=columnas;i++){
                tabla.addColumn(md.getColumnLabel(i));
            }
            while(resultado.next()){
                Object[] fila = new Object[columnas];
                for(int i = 0;i< columnas;i++){
                    fila[i] = resultado.getObject(i+1);
                }
                tabla.addRow(fila);
                fila = null;
            }
            
        }catch(SQLException ex){
            Logger.getLogger(Personas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tabla;
    }
    
    public int InsertarPersonas(int cargo, String Nom, String Ape, String FechaNac, String FechaRegistro,
                                int DUI, int tel, String Dir, String Estado) throws SQLException{
        Conexion c = new Conexion();
        c.EstableceConexion();
        return c.ComandoSQL("Call insertar_vista_persona("+cargo+",'"+Nom+"','"+Ape+"','"+FechaNac+"',"
                + "'"+FechaRegistro+"',"+DUI+","+tel+",'"+Dir+"','"+Estado+"');");
    }
    
    public int ModificiarPersonas(int cargo,String Nom, String Ape, String FechaNac, String FechaRegistro,
                                int DUI, int tel, String Dir, String Estado )throws SQLException{
        
        Conexion c = new Conexion();
        c.EstableceConexion();
        return c.ComandoSQL("call update_vw("+cargo+",'"+Nom+"','"+Ape+"','"+FechaNac+"',"
                + "'"+FechaRegistro+"',"+DUI+","+tel+",'"+Dir+"','"+Estado+"');");    
    }
    
    public int EliminarPersona(int dui) throws SQLException{
        Conexion c = new Conexion();
        c.EstableceConexion();
        return c.ComandoSQL("call delete_persona("+dui+");");
    }

  
}
