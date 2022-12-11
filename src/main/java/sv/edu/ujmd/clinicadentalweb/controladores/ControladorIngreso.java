/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package sv.edu.ujmd.clinicadentalweb.controladores;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sv.edu.ujmd.clinicadentalweb.modelo.ClaseIngreso;

/**
 *
 * @author jose4
 */
@WebServlet(name = "ControladorIngreso", urlPatterns = {"/ControladorIngreso"})
public class ControladorIngreso extends HttpServlet {
    ClaseIngreso ci = new ClaseIngreso();

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
        //processRequest(request, response);
        
        
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
        String accion = request.getParameter("btnIngresar");
        
        String Usuario = request.getParameter("usuario");
        String Clave = request.getParameter("clave");
        
        if (accion.equals("Ingresar"))
        try {
            Boolean acceso = ci.VerificarUsuario(Usuario, Clave);
            if (acceso == true) {
                if(ci.getRol()==1){
                    request.getRequestDispatcher("FormularioPrincipal/Principal.jsp").forward(request, response);
                    
                }else{
                    if(ci.getRol()==2){
                        request.getRequestDispatcher("/FormularioCitaClientes/CitaCliente.jsp").forward(request, response);
                        //request.getRequestDispatcher("FormularioCitaClientes/CitaCliente.jsp").forward(request, response);

                    }
                   request.getRequestDispatcher("/FormularioCitaClientes/CitaCliente.jsp").forward(request, response);

                }
            } else {
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorIngreso.class.getName()).log(Level.SEVERE, null, ex);
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
