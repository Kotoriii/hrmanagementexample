/*
 * To change this template, choose Tools | Templates
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
import permiso.Permiso;
import permiso.PermisoFactory;

/**
 *
 * @author laboratorio
 */


@WebServlet(name = "SolicitarPermiso", urlPatterns = {"/SolicitarPermiso"})
public class SolicitarPermiso extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
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
        //String nombre = request.getParameter("nombre");
        String id = request.getParameter("id");
        String fechainicio = request.getParameter("fechainicio");
        String fechafinal = request.getParameter("fechafinal");
        String solicitud = request.getParameter("solicitud");
        String departamento = request.getParameter("departamento");
        String enviar = request.getParameter("enviar");
      
        String permiso = request.getParameter("permiso");
        Conexion con = Conexion.getInstancia();
        PermisoFactory permisofactory = new PermisoFactory();
        try {
            if ("enviar".equals(enviar)){ 
            
             String tipopermiso = permisofactory.getPermiso(permiso);
             String estado ="0";
              con.crearPermiso(id, fechainicio, fechafinal, tipopermiso, estado);
               response.sendRedirect("MenuTrabajadores.jsp");
            }
            else{
                 response.sendRedirect("MenuTrabajadores.jsp");
            }
          
        } finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
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
     * Handles the HTTP
     * <code>POST</code> method.
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
