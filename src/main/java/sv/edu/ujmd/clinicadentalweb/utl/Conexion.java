/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.edu.ujmd.clinicadentalweb.utl;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.sql.*;

/**
 *
 * @author LENOVO
 */
public class Conexion {
    Connection conectar = null;
    String usuario = "root";
    String clave = "castillo999";
    String bd = "clinicadental";
    String ip = "localhost";
    String puerto = "3306";
    Statement stm;
    
    //private Connection con = null;
    //Connection conectar = null;
    //String user = "root";
    //static String pass = "castillo999";
    //static String url = "jdbc:mysql://localhost/clinicadental?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    //Statement stm;

    String cadena = "jdbc:mysql://" + ip + ":" + puerto + "/" + bd;

    public ResultSet Select;

    /**
     *
     * @return
     */
    public Connection EstableceConexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = DriverManager.getConnection(cadena, usuario, clave);
            this.stm = this.conectar.createStatement();

            //JOptionPane.showMessageDialog(null, "Conexion exitosa");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se  pudo hacer la conexion, error: " + e.toString());
        }
        return conectar;
    }

    public ResultSet Select(String query) throws SQLException {
        return this.stm.executeQuery(query);
    }

    public int ComandoSQL(String query) throws SQLException {
        return this.stm.executeUpdate(query);
    }

    /*
    public ArrayList GetListaSucursal() {
        ArrayList sucursal = new ArrayList();
        ComboSucursal suc;
        ClaseRegistro registro;
        Statement consulta;
        ResultSet resultado;
        try {
            registro = new ClaseRegistro();
            consulta = conectar.createStatement();
            resultado = consulta.executeQuery(registro.getSucursal());
            while (resultado.next()) {
                suc = new ComboSucursal();
                suc.setCd(resultado.getInt("CodSucursal"));
                suc.setNom(resultado.getString("Sucursal"));
                sucursal.add(suc);
            }
        } catch (SQLException ex) {
        }
        return sucursal;

    }

    public ArrayList GetListaCargos() {
        ArrayList cargos = new ArrayList();
        ComboCargos carg;
        Personas persona;
        Statement consulta;
        ResultSet resultado;
        try {
            persona = new Personas();
            consulta = conectar.createStatement();
            resultado = consulta.executeQuery(persona.getSelect_Cargos());
            while (resultado.next()) {
                carg = new ComboCargos();
                carg.setCodCargos(resultado.getInt("NumCargos"));
                carg.setCargos(resultado.getString("Cargos"));
                cargos.add(carg);
            }
        } catch (SQLException ex) {
        }
        return cargos;
    }

    public ArrayList GetListaClientes() {
        ArrayList clientes = new ArrayList();
        ComboCliente cliente;
        Citas cita;
        Statement consulta;
        ResultSet resultado;
        try {
            cita = new Citas();
            consulta = conectar.createStatement();
            resultado = consulta.executeQuery(cita.getSelect_Cliente());
            while (resultado.next()) {
                cliente = new ComboCliente();
                cliente.setCliente(resultado.getString("Cliente"));
                clientes.add(cliente);
            }
        } catch (SQLException ex) {
        }
        return clientes;
    }

    public ArrayList GetListaProducto() {
        ArrayList producto = new ArrayList();
        ComboProducto prod;
        Citas cita;
        Statement consulta;
        ResultSet resultado;
        try {
            cita = new Citas();
            consulta = conectar.createStatement();
            resultado = consulta.executeQuery(cita.getSelect_Producto());
            while (resultado.next()) {
                prod = new ComboProducto();
                prod.setProducto(resultado.getString("producto"));
                producto.add(prod);
            }
        } catch (SQLException ex) {
        }
        return producto;
    }

    public ArrayList GetListaDentista() {
        ArrayList dentista = new ArrayList();
        ComboDentista dent;
        Citas cita;
        Statement consulta;
        ResultSet resultado;
        try {
            cita = new Citas();
            consulta = conectar.createStatement();
            resultado = consulta.executeQuery(cita.getSelect_Dentista());
            while (resultado.next()) {
                dent = new ComboDentista();
                dent.setDentista(resultado.getString("Dentista"));
                dentista.add(dent);
            }
        } catch (SQLException ex) {
        }
        return dentista;
    }
    
    public ArrayList GetListaSecretaria(){
        ArrayList secretaria = new ArrayList();
        ComboSecretario sec;
        Citas cita;
        Statement consulta;
        ResultSet resultado;
        try {
            cita = new Citas();
            consulta = conectar.createStatement();
            resultado = consulta.executeQuery(cita.getSelect_Secretario());
            while (resultado.next()) {
                sec = new ComboSecretario();
                sec.setSecretario(resultado.getString("Secretario"));
                secretaria.add(sec);
            }
        } catch (SQLException ex) {
        }
        return secretaria;
    }

    public ArrayList GetListaCategoria() {
        ArrayList categoria = new ArrayList();
        ComboCategorias cat;
        Productos prod;
        Statement consulta;
        ResultSet resultado;
        try {
            prod = new Productos();
            consulta = conectar.createStatement();
            resultado = consulta.executeQuery(prod.getSelect_Categ());
            while (resultado.next()) {
                cat = new ComboCategorias();
                cat.setId(resultado.getInt("CodCategoria"));
                cat.setCategoria(resultado.getString("Categoria"));
                categoria.add(cat);
            }
        } catch (SQLException ex) {
        }
        return categoria;
    }
    
    public ArrayList GetListaClientesFact() {
        ArrayList clientes = new ArrayList();
        ComboClienteCita cliente;
        Factura factura;
        Statement consulta;
        ResultSet resultado;
        try {
            factura = new Factura();
            consulta = conectar.createStatement();
            resultado = consulta.executeQuery(factura.getSelect_Cliente());
            while (resultado.next()) {
                cliente = new ComboClienteCita();
                cliente.setCliente(resultado.getString("Cliente"));
                clientes.add(cliente);
            }
        } catch (SQLException ex) {
        }
        return clientes;
    }
    
     public ArrayList GetListaDentistaFact() {
        ArrayList dentista = new ArrayList();
        ComboDentistaFact dent;
        Factura factura;
        Statement consulta;
        ResultSet resultado;
        try {
            factura = new Factura();
            consulta = conectar.createStatement();
            resultado = consulta.executeQuery(factura.getSelect_Dentista());
            while (resultado.next()) {
                dent = new ComboDentistaFact();
                dent.setDentista(resultado.getString("Dentista"));
                dentista.add(dent);
            }
        } catch (SQLException ex) {
        }
        return dentista;
    }
     
     public ArrayList GetListaSecreFact() {
        ArrayList secretario = new ArrayList();
        ComboSecreFact secre;
        Factura factura;
        Statement consulta;
        ResultSet resultado;
        try {
            factura = new Factura();
            consulta = conectar.createStatement();
            resultado = consulta.executeQuery(factura.getSelect_Secretario());
            while (resultado.next()) {
                secre = new ComboSecreFact();
                secre.setSecretario(resultado.getString("Secretario"));
                secretario.add(secre);
            }
        } catch (SQLException ex) {
        }
        return secretario;
    } */

}
