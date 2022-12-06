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
/*public class Productos {
    private String Select_Categ = "select * from categorias";
    private String Select_Prod = "select * from productos";

    public Productos() {
    }

    public String getSelect_Prod() {
        return Select_Prod;
    }

    public void setSelect_Prod(String Select_Prod) {
        this.Select_Prod = Select_Prod;
    }

    public String getSelect_Categ() {
        return Select_Categ;
    }

    public void setSelect_Categ(String Select_Categ) {
        this.Select_Categ = Select_Categ;
    }
    
    public DefaultTableModel cargarCategorias(){
        DefaultTableModel tabla = new DefaultTableModel();
        Conexion conectar = new Conexion();
        try{
            Connection c;
            c = conectar.EstableceConexion();
            Statement stm = c.createStatement();
            ResultSet resultado = stm.executeQuery(this.getSelect_Categ());
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
    public DefaultTableModel cargarProductos(){
        DefaultTableModel tabla = new DefaultTableModel();
        Conexion conectar = new Conexion();
        try{
            Connection c;
            c = conectar.EstableceConexion();
            Statement stm = c.createStatement();
            ResultSet resultado = stm.executeQuery(this.getSelect_Prod());
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
    
    public int Insertar_Producto(String prod, int categoria) throws SQLException{
        Conexion c = new Conexion();
        c.EstableceConexion();
        return c.ComandoSQL("call insertar_producto('"+prod+"',"+categoria+");");
    }
    
    public int Actualizar_Producto(String prod, int categoria, int cod) throws SQLException{
        Conexion c = new Conexion();
        c.EstableceConexion();
        return c.ComandoSQL("call actualizar_producto('"+prod+"',"+categoria+","+cod+");");
    }
    
    public int Eliminar_Producto(int cod) throws SQLException{
        Conexion c = new Conexion();
        c.EstableceConexion();
        return c.ComandoSQL("call eliminar_productos("+cod+");");
    }
    
}*/
