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
import sv.edu.ujmd.clinicadentalweb.modelo.Citas;

/**
 *
 * @author jose4
 */
@WebServlet(name = "ControladorCitas", urlPatterns = {"/ControladorCitas"})
public class ControladorCitas extends HttpServlet {
    Citas c = new Citas();

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
        response.setContentType("text/html;charset=UTF-8");
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
        String accion = request.getParameter("btnAgendar");
        
        if (accion.equals("Agendar")) {
            int cod = parseInt(request.getParameter("cod"));
            String personas = request.getParameter("personas");
            String productos = request.getParameter("productos");
            String dent = request.getParameter("dentista");
            String secre = request.getParameter("secre");
            String FechaHora = request.getParameter("fechahora");
            String desc = request.getParameter("desc");
            String Atendido = request.getParameter("estado1");
            String Cancelado = request.getParameter("estado2");
            try {
                if (request.getParameter(Atendido) != Atendido ) {
                    Atendido = "Atendido";
                    if (c.EditarCita(cod, personas, productos, FechaHora, desc, dent, secre, Atendido) > 0) {
                        //request.getRequestDispatcher("/FormularioCitas/Citas.jsp").forward(request, response);
                    }
                    //request.getRequestDispatcher("/FormularioCitas/Citas.jsp").forward(request, response);
                }

                if (request.getParameter(Cancelado) != Cancelado) {
                    Cancelado = "Cancelado";
                    if (c.EditarCita(cod, personas, productos, FechaHora, desc, dent, secre, Cancelado) > 0) {
                        //request.getRequestDispatcher("/FormularioCitas/Citas.jsp").forward(request, response);
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(ControladorCitas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
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
        response.setContentType("text/html;charset=UTF-8");
        //processRequest(request, response);
        
        String accion = request.getParameter("btnAgendar");
        
        if (accion.equals("Agendar")) {
            //int cod = request.getParameter("cod")
            String personas = request.getParameter("personas");
            String productos = request.getParameter("productos");
            String dent = request.getParameter("dentista");
            String secre = request.getParameter("secre");
            String FechaHora = request.getParameter("fechahora");
            String desc = request.getParameter("desc");
            String Atendido = request.getParameter("estado1");
            String Cancelado = request.getParameter("estado2");
            try {
                if (request.getParameter(Atendido) != Atendido ) {
                    Atendido = "Atendido";
                    if (c.AgendarCita(personas, productos, FechaHora, desc, dent, secre, Atendido) > 0) {
                        
                    }
                    request.getRequestDispatcher("FormularioCitas/Citas.jsp").forward(request, response);
                }

                if (request.getParameter(Cancelado) != Cancelado) {
                    Cancelado = "Cancelado";
                    if (c.AgendarCita(personas, productos, FechaHora, desc, dent, secre, Cancelado) > 0) {
                        
                    }
                    request.getRequestDispatcher("FormularioCitas/Citas.jsp").forward(request, response);
                }
            } catch (SQLException ex) {
                Logger.getLogger(ControladorCitas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String accion = request.getParameter("urlEliminar");
        int cod = parseInt(request.getParameter("cod"));

        if (accion.equals("Eliminar")) {
            try {
                if (c.EliminarCita(cod) > 0) {
                    request.getRequestDispatcher("FormularioCitas/Citas.jsp").forward(request, response);
                }
            } catch (SQLException ex) {
                Logger.getLogger(ControladorCitas.class.getName()).log(Level.SEVERE, null, ex);
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
