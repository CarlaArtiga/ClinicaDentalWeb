/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.edu.ujmd.clinicadentalweb.modelo;

import sv.edu.ujmd.clinicadentalweb.utl.Conexion;
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
/*public class Citas {
    private String Select_Cita = "select * from citas";
    private String Select_Cliente = "select * from clientes_vw";
    private String Select_Producto = "select * from producto_vw";
    private String Select_Dentista = "select * from Dentista";
    private String Select_Secretario = "select * from secretario_vw";

    public Citas() {
    }

    public String getSelect_Secretario() {
        return Select_Secretario;
    }

    public void setSelect_Secretario(String Select_Secretario) {
        this.Select_Secretario = Select_Secretario;
    }

    public String getSelect_Producto() {
        return Select_Producto;
    }

    public String getSelect_Dentista() {
        return Select_Dentista;
    }

    public void setSelect_Dentista(String Select_Dentista) {
        this.Select_Dentista = Select_Dentista;
    }

    public void setSelect_Producto(String Select_Producto) {
        this.Select_Producto = Select_Producto;
    }

    public String getSelect_Cliente() {
        return Select_Cliente;
    }

    public void setSelect_Cliente(String Select_Cliente) {
        this.Select_Cliente = Select_Cliente;
    }

    public String getSelect_Cita() {
        return Select_Cita;
    }

    public void setSelect_Cita(String Select_Cita) {
        this.Select_Cita = Select_Cita;
    }
    
    public DefaultTableModel CargarCita(){
        DefaultTableModel tabla = new DefaultTableModel();
        Conexion conectar = new Conexion();
        try{
            Connection c;
            c = conectar.EstableceConexion();
            Statement stm = c.createStatement();
            ResultSet resultado = stm.executeQuery(this.getSelect_Cita());
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
            Logger.getLogger(Citas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tabla;
    }
    
    public int AgendarCita(String per, String prod, String FechaHora, 
                           String desc,String dent,String sec ,String Estado) throws SQLException{
        Conexion c = new Conexion();
        c.EstableceConexion();
        return c.ComandoSQL("call insert_cita('"+per+"','"+prod+"','"+FechaHora+"','"+desc+"','"+dent+"','"+sec+"','"+Estado+"');");
    }
    
    public int EditarCita(int cod, String per, String prod, String FechaHora,
                          String desc,String dent,String sec,String Estado) throws SQLException {
        Conexion c = new Conexion();
        c.EstableceConexion();
        return c.ComandoSQL("call update_cita("+cod+",'"+per+"','"+prod+"',"
                + "'"+FechaHora+"','"+desc+"','"+dent+"','"+sec+"','"+Estado+"');");
        
    }
    
    public int EliminarCita(int cod) throws SQLException{
        Conexion c = new Conexion();
        c.EstableceConexion();
        return c.ComandoSQL("call eliminar_cita("+cod+");");
    }
    
    public int AgendarCitaCliente(String p, String prod, String fecha) throws SQLException{
        Conexion c = new Conexion();
        c.EstableceConexion();
        return c.ComandoSQL("call insertar_nueva_cita('"+p+"','"+prod+"','"+fecha+"');");
        
    }
    ;
}*/
