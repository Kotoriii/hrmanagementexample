/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Servlets;

import com.Conexion;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author CarlosJB
 */
@WebServlet(name = "NuevoEmpleado", urlPatterns = {"/NuevoEmpleado"})
public class NuevoOModificarEmpleado extends HttpServlet {

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
        PrintWriter out = response.getWriter();
        
        String nombre = request.getParameter("nombre");
        String id = request.getParameter("id");
        String puesto = request.getParameter("puesto");
        String salario = request.getParameter("salario");
        String pagoHora = request.getParameter("pagoHora");
        String horaEntrada = request.getParameter("horaEntrada");
        String horaSalida = request.getParameter("horaSalida");
        String email = request.getParameter("email");
        String keywords = request.getParameter("keywords");
        String estado = request.getParameter("estado");
        
        String annadir = request.getParameter("annadir");
        String modificar = request.getParameter("modificar");
        String cambiarEstado = request.getParameter("estado");
        
        try {
            /* TODO output your page here. You may use following sample code. */
            if ("modificar".equals(modificar)){
                
                response.sendRedirect("administracion.jsp");
            } else if ("cambiarEstado".equals(cambiarEstado)) {
                
                response.sendRedirect("administracion.jsp");
            } else {
                Conexion.getInstancia().crearNuevoUsuario(id, nombre, id, puesto, salario, pagoHora, keywords, email, horaEntrada, horaSalida);
                response.sendRedirect("administracion.jsp");
            }
        } finally {
            out.close();
        }
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
        processRequest(request, response);
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
