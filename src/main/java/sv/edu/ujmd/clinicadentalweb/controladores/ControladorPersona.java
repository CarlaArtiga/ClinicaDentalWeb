/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package sv.edu.ujmd.clinicadentalweb.controladores;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sv.edu.ujmd.clinicadentalweb.modelo.Personas;

/**
 *
 * @author jose4
 */
@WebServlet(name = "ControladorPersonas", urlPatterns = {"/ControladorPersonas"})
public class ControladorPersona extends HttpServlet {
    Personas p = new Personas();

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
        
        String accion = request.getParameter("btnGuardar");

        if (accion.equals("Guardar")) {
            
            int cargos = Integer.parseInt(request.getParameter("cargos"));
            String Nom = request.getParameter("nombre");
            String Ape = request.getParameter("apellido");
            String FechaNac = request.getParameter("fechanacimiento");
            String FechaReg = request.getParameter("fecharegistro");
            int DUI = Integer.parseInt(request.getParameter("dui"));
            int Tel = Integer.parseInt(request.getParameter("tel"));
            String Dir = request.getParameter("dir");
            String Activo = request.getParameter("estado1");
            String Desactivo = request.getParameter("estado2");

            try {
                if (request.getParameter(Activo) != Activo) {
                    Activo = "A";
                    if (p.ModificiarPersonas(cargos, Nom, Ape, FechaNac, FechaReg, DUI, Tel, Dir, Activo) > 0) {
                        request.getRequestDispatcher("FormularioPersonas/Personas.jsp").forward(request, response);
                    }
                    //request.getRequestDispatcher("FormularioPersonas/Personas.jsp").forward(request, response);
                }

                if (request.getParameter(Desactivo) != Desactivo) {
                    Desactivo = "D";
                    if (p.ModificiarPersonas(cargos, Nom, Ape, FechaNac, FechaReg, DUI, Tel, Dir, Desactivo) > 0) {
                        request.getRequestDispatcher("FormularioPersonas/Personas.jsp").forward(request, response);
                    }
                    request.getRequestDispatcher("FormularioPersonas/Personas.jsp").forward(request, response);
                }
            } catch (SQLException ex) {
                Logger.getLogger(ControladorPersona.class.getName()).log(Level.SEVERE, null, ex);
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
        //processRequest(request, response);
        response.setContentType("text/html;charset=UTF-8");
        String accion = request.getParameter("btnGuardar");

        if (accion.equals("Guardar")) {
            
            int cargos = Integer.parseInt(request.getParameter("cargos"));
            String Nom = request.getParameter("nombre");
            String Ape = request.getParameter("apellido");
            String FechaNac = request.getParameter("fechanacimiento");
            String FechaReg = request.getParameter("fecharegistro");
            int DUI = Integer.parseInt(request.getParameter("dui"));
            int Tel = Integer.parseInt(request.getParameter("tel"));
            String Dir = request.getParameter("dir");
            String Activo = request.getParameter("estado1");
            String Desactivo = request.getParameter("estado2");

            try {
                if (request.getParameter(Activo) != Activo) {
                    Activo = "A";
                    if (p.InsertarPersonas(cargos, Nom, Ape, FechaNac, FechaReg, DUI, Tel, Dir, Activo) > 0) {
                        request.getRequestDispatcher("FormularioPersonas/Personas.jsp").forward(request, response);
                    }
                }

                if (request.getParameter(Desactivo) != Desactivo) {
                    Desactivo = "D";
                    if (p.InsertarPersonas(cargos, Nom, Ape, FechaNac, FechaReg, DUI, Tel, Dir, Desactivo) > 0) {
                        request.getRequestDispatcher("FormularioPersonas/Personas.jsp").forward(request, response);
                    }
                    request.getRequestDispatcher("FormularioPersonas/Personas.jsp").forward(request, response);
                }
            } catch (SQLException ex) {
                Logger.getLogger(ControladorPersona.class.getName()).log(Level.SEVERE, null, ex);
            }
            request.getRequestDispatcher("FormularioPersonas/Personas.jsp").forward(request, response);
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
