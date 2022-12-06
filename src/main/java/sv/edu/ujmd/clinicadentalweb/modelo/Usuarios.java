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
//public class Usuarios {
//    
//    private String Select_Usuarios = "select CodUsuarios, Usuarios, md5(clave) as Clave, Rol from usuarios;";
//    public Usuarios() {
//    }
//
//    public String getSelect_Usuarios() {
//        return Select_Usuarios;
//    }
//
//    public void setSelect_Usuarios(String Select_Usuarios) {
//        this.Select_Usuarios = Select_Usuarios;
//    }
//    
//    public DefaultTableModel cargarUsuarios(){
//        DefaultTableModel tabla = new DefaultTableModel();
//        Conexion conectar = new Conexion();
//        try{
//            Connection c;
//            c = conectar.EstableceConexion();
//            Statement stm = c.createStatement();
//            ResultSet resultado = stm.executeQuery(this.getSelect_Usuarios());
//            ResultSetMetaData md = resultado.getMetaData();
//            int columnas = md.getColumnCount();
//            for(int i = 1;i<=columnas;i++){
//                tabla.addColumn(md.getColumnLabel(i));
//            }
//            while(resultado.next()){
//                Object[] fila = new Object[columnas];
//                for(int i = 0;i<columnas;i++){
//                    fila[i] = resultado.getObject(i+1);
//                }
//                tabla.addRow(fila);
//                fila = null;
//            }
//            
//        }catch(SQLException ex){
//            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return tabla;
//    }
//    
//    /**
//     *
//     * @param Usuario
//     * @param Clave
//     * @param Rol
//     * @return
//     * @throws SQLException
//     */
//    public int InsertarUser(String Usuario, String Clave, int Rol) throws SQLException{
//        Conexion c = new Conexion();
//        c.EstableceConexion();
//        return c.ComandoSQL("call insertarUsuario('"+Usuario+"',"+Clave+","+Rol+");");
//        
//    }
//    
//    public int ActualizarUser(String usuario, String clave, int rol, int cod)throws SQLException{
//        Conexion c = new Conexion();
//        c.EstableceConexion();
//        return c.ComandoSQL("call actualizar_usarios('"+usuario+"','"+clave+"',"+rol+","+cod+");");
//    }
//    
//    public int EliminarUsuario(int cod)throws SQLException{
//        Conexion c = new Conexion();
//        c.EstableceConexion();
//        return c.ComandoSQL("call eliminar_usuario("+cod+");");
//       
//    }
//}
