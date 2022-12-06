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
/*public class Sucursal {
    private String Select_Personal = "select * from sucursalxpersona_vw";
    private String Select_Inventario = "select * from sucursalxproducto_vw";

    public Sucursal() {
    }

    public String getSelect_Personal() {
        return Select_Personal;
    }

    public void setSelect_Personal(String Select_Personal) {
        this.Select_Personal = Select_Personal;
    }

    public String getSelect_Inventario() {
        return Select_Inventario;
    }

    public void setSelect_Inventario(String Select_Inventario) {
        this.Select_Inventario = Select_Inventario;
    }
    
    public DefaultTableModel cargarPersonal(){
        DefaultTableModel tabla = new DefaultTableModel();
        Conexion conectar = new Conexion();
        try{
            Connection c;
            c = conectar.EstableceConexion();
            Statement stm = c.createStatement();
            ResultSet resultado = stm.executeQuery(this.getSelect_Personal());
            ResultSetMetaData md = resultado.getMetaData();
            int columnas = md.getColumnCount();
            for(int i = 1;i<=columnas;i++){
                tabla.addColumn(md.getColumnLabel(i));
            }
            while(resultado.next()){
                Object[] fila = new Object[columnas];
                for(int i = 0;i<columnas;i++){
                    fila[i] = resultado.getObject(i+1);
                }
                tabla.addRow(fila);
                fila = null;
            }
            
        }catch(SQLException ex){
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tabla;
    }
    public DefaultTableModel cargarInventario(){
        DefaultTableModel tabla = new DefaultTableModel();
        Conexion conectar = new Conexion();
        try{
            Connection c;
            c = conectar.EstableceConexion();
            Statement stm = c.createStatement();
            ResultSet resultado = stm.executeQuery(this.getSelect_Inventario());
            ResultSetMetaData md = resultado.getMetaData();
            int columnas = md.getColumnCount();
            for(int i = 1;i<=columnas;i++){
                tabla.addColumn(md.getColumnLabel(i));
            }
            while(resultado.next()){
                Object[] fila = new Object[columnas];
                for(int i = 0;i<columnas;i++){
                    fila[i] = resultado.getObject(i+1);
                }
                tabla.addRow(fila);
                fila = null;
            }
            
        }catch(SQLException ex){
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tabla;
    }
}
*/