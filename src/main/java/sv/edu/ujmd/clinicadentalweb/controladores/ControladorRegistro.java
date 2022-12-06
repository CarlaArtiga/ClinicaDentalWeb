/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package sv.edu.ujmd.clinicadentalweb.controladores;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Integer.parseInt;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import sv.edu.ujmd.clinicadentalweb.modelo.ClaseRegistro;

/**
 *
 * @author jose4
 */
@WebServlet(name = "ControladorRegistro", urlPatterns = {"/ControladorRegistro"})
public class ControladorRegistro extends HttpServlet {
    ClaseRegistro cr = new ClaseRegistro();

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        
        //Este String accion nos va a permitir ejecutar el metodo de guardado (el parametro que guardamos es el nombre del boton para ingresar datos)
        String accion = request.getParameter("btnRegistrar");
        if (accion.equals("Registrarse")) {
            
            //aqui adaptamos lo que teniamos en el boton de ingresar datos del proyecto de escritorio
            String Usuario = request.getParameter("usuario");
            String Clave = request.getParameter("clave");

            String Nombre = request.getParameter("nombre");
            String Apellido = request.getParameter("apellido");
            String Fecha1 = request.getParameter("fecharegistro");
            String Fecha2 = request.getParameter("fechanacimiento");
            int Dui = parseInt(request.getParameter("dui"));
            int Tel = parseInt(request.getParameter("tel"));
            String dir = request.getParameter("dir");
            try {
                if ((cr.InsertarUsuario(Usuario, Clave) > 0) && cr.InsertarPersona(Nombre, Apellido, Fecha1, Fecha2, Dui, Tel, dir) > 0) {
                    //LUEGO DE QUE GUARDE LOS DATOS DEBERIA DE HABER UN MENSAJE QUE INDIQUE QUE LOS DATOS HAN SIDO GUARDADOS
                    //PUSE EL DIRECCIONAMIENTO A LA PAGINA DE INICIO COMO UNA SEÑAL DE QUE SE HAN GUARDADO LOS DATOS (DEBE DE HABER UN MENSAJE)
                    request.getRequestDispatcher("index.jsp").forward(request, response);
                }
            } catch (SQLException ex) {
                Logger.getLogger(ControladorRegistro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
