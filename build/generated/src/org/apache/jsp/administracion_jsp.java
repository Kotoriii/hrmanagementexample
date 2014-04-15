package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class administracion_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "template.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Administracion</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class='container'>\n");
      out.write("\n");
      out.write("            <div class=\"panel-group\" id=\"accordion\">\n");
      out.write("                <div class=\"panel panel-default\">\n");
      out.write("                    <div class=\"panel-heading\">\n");
      out.write("                        <h4 class=\"panel-title\">\n");
      out.write("                            <a data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapseOne\">\n");
      out.write("                                Ingresar Nuevo Empleado / Modificar Empleado\n");
      out.write("                            </a>\n");
      out.write("                        </h4>\n");
      out.write("                    </div>\n");
      out.write("                    <div id=\"collapseOne\" class=\"panel-collapse collapse in\">\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                            <form action=\"NuevoEmpleado\" method=\"post\">\n");
      out.write("\n");
      out.write("                                <div class=\"row\">\n");
      out.write("\n");
      out.write("                                    <div class=\"col-md-8\">\n");
      out.write("                                        <ul class=\"list-group\">\n");
      out.write("\n");
      out.write("                                            <ul class=\"list-group-item\">\n");
      out.write("                                                <div class=\"row\">\n");
      out.write("                                                    <div class=\"col-md-4\">\n");
      out.write("                                                        <h4> <span class='glyphicon glyphicon-user'></span> Nombre:</h4>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"col-md-8\">\n");
      out.write("                                                        <input type=\"text\" class=\"form-control\" id=\"nombre\" placeholder=\"Ingrese el Nombre\" name=\"nombre\"/>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </ul>\n");
      out.write("\n");
      out.write("                                            <ul class=\"list-group-item\">\n");
      out.write("                                                <div class=\"row\">\n");
      out.write("                                                    <div class=\"col-md-4\">\n");
      out.write("                                                        <h4> <span class='glyphicon glyphicon-glass'></span> ID:</h4>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"col-md-8\">\n");
      out.write("                                                        <input type=\"text\" class=\"form-control\" id=\"id\" placeholder=\"Ingrese el ID\" name=\"id\"/>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </ul>\n");
      out.write("\n");
      out.write("                                            <ul class=\"list-group-item\">\n");
      out.write("                                                <div class=\"row\">\n");
      out.write("                                                    <div class=\"col-md-4\">\n");
      out.write("                                                        <h4> <span class='glyphicon glyphicon-bullhorn'></span> Puesto:</h4>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"col-md-8\">\n");
      out.write("                                                        <input type=\"text\" class=\"form-control\" id=\"puesto\" placeholder=\"Ingrese el Puesto\" name=\"puesto\"/>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </ul>\n");
      out.write("\n");
      out.write("                                            <ul class=\"list-group-item\">\n");
      out.write("                                                <div class=\"row\">\n");
      out.write("                                                    <div class=\"col-md-4\">\n");
      out.write("                                                        <h4> <span class='glyphicon glyphicon-usd'></span> Salario Mensual:</h4>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"col-md-8\">\n");
      out.write("                                                        <input type=\"text\" class=\"form-control\" id=\"salario\" placeholder=\"Ingrese el Salario\" name=\"salario\"/>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </ul>\n");
      out.write("\n");
      out.write("                                            <ul class=\"list-group-item\">\n");
      out.write("                                                <div class=\"row\">\n");
      out.write("                                                    <div class=\"col-md-4\">\n");
      out.write("                                                        <h4> <span class='glyphicon glyphicon-usd'></span> Pago Por Hora:</h4>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"col-md-8\">\n");
      out.write("                                                        <input type=\"text\" class=\"form-control\" id=\"pagoHora\" placeholder=\"Ingrese el Monto por Hora\" name=\"pagoHora\"/>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </ul>\n");
      out.write("\n");
      out.write("                                            <ul class=\"list-group-item\">\n");
      out.write("                                                <div class=\"row\">\n");
      out.write("                                                    <div class=\"col-md-4\">\n");
      out.write("                                                        <h4> <span class='glyphicon glyphicon-time'></span> Hora Entrada:</h4>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"col-md-8\">\n");
      out.write("                                                        <input type=\"text\" class=\"form-control\" id=\"horaEntrada\" placeholder=\"Ingrese la hora con el formato HH/MM/SS\" name=\"horaEntrada\"/>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </ul>\n");
      out.write("\n");
      out.write("                                            <ul class=\"list-group-item\">\n");
      out.write("                                                <div class=\"row\">\n");
      out.write("                                                    <div class=\"col-md-4\">\n");
      out.write("                                                        <h4> <span class='glyphicon glyphicon-time'></span> Hora Salida:</h4>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"col-md-8\">\n");
      out.write("                                                        <input type=\"text\" class=\"form-control\" id=\"horaSalida\" placeholder=\"Ingrese la hora con el formato HH/MM/SS\" name=\"horaSalida\"/>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </ul>\n");
      out.write("\n");
      out.write("                                            <ul class=\"list-group-item\">\n");
      out.write("                                                <div class=\"row\">\n");
      out.write("                                                    <div class=\"col-md-4\">\n");
      out.write("                                                        <h4> <span class='glyphicon glyphicon-envelope'></span> Email:</h4>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"col-md-8\">\n");
      out.write("                                                        <input type=\"text\" class=\"form-control\" id=\"email\" placeholder=\"Ingrese el email\" name=\"email\"/>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </ul>\n");
      out.write("\n");
      out.write("                                            <ul class=\"list-group-item\">\n");
      out.write("                                                <div class=\"row\">\n");
      out.write("                                                    <div class=\"col-md-4\">\n");
      out.write("                                                        <h4> <span class='glyphicon glyphicon-text-width'></span> Keywords:</h4>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"col-md-8\">\n");
      out.write("                                                        <input type=\"text\" class=\"form-control\" id=\"keywords\" placeholder=\"Ingrese keyworks separandolas por medio de una coma ',' \" name=\"keywords\"/>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </ul>\n");
      out.write("\n");
      out.write("                                        </ul>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"col-md-4\">\n");
      out.write("                                        <div class=\"list-group\">\n");
      out.write("                                            <ul class=\"list-group-item\">\n");
      out.write("                                                <div class=\"jumbotron \" style=\"width: 100%; margin-top: 5%; margin-bottom: 5%\">\n");
      out.write("                                                    <input type=\"submit\" name=\"annadir\" id=\"annadir\" value=\"Ingresar Empleado\" class=\"btn btn-primary btn-lg\"/>\n");
      out.write("                                                </div>\n");
      out.write("                                            </ul>\n");
      out.write("                                            \n");
      out.write("                                            <ul class=\"list-group-item\">\n");
      out.write("                                                <div class=\"jumbotron \" style=\"width: 100%; margin-top: 5%; margin-bottom: 5%\">\n");
      out.write("                                                    <input type=\"submit\" name=\"modificar\" id=\"modificar\" value=\"Modificar Empleado\" class=\"btn btn-primary btn-lg\"/>\n");
      out.write("                                                </div>\n");
      out.write("                                            </ul>\n");
      out.write("                                            \n");
      out.write("                                            <ul class=\"list-group-item\">\n");
      out.write("                                                <div class=\"jumbotron \" style=\"width: 100%; margin-top: 5%; margin-bottom: 5%\">\n");
      out.write("                                                    <input type=\"submit\" name=\"despedirReContratar\" id=\"despedirReContratar\" value=\"Despedir/Re-contratar Empleado\" class=\"btn btn-primary btn-lg\"/>\n");
      out.write("                                                </div>\n");
      out.write("                                            </ul>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"panel panel-default\">\n");
      out.write("                    <div class=\"panel-heading\">\n");
      out.write("                        <h4 class=\"panel-title\">\n");
      out.write("                            <a data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapseThree\">\n");
      out.write("                                Ver Empleados\n");
      out.write("                            </a>\n");
      out.write("                        </h4>\n");
      out.write("                    </div>\n");
      out.write("                    <div id=\"collapseThree\" class=\"panel-collapse collapse\">\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                            <form action=\"ResultadoBusqueda\" method=\"post\">\n");
      out.write("\n");
      out.write("                                <div class=\"row\">\n");
      out.write("\n");
      out.write("                                    <div class=\"col-md-8\">\n");
      out.write("                                        <div class=\"list-group\">\n");
      out.write("                                            <ul class=\"list-group-item\">\n");
      out.write("                                                <div class=\"row\">\n");
      out.write("                                                    <div class=\"col-md-7\">\n");
      out.write("                                                        <input type=\"text\" class=\"form-control\" id=\"busqueda\" placeholder=\"Busqueda\" name=\"busqueda\"/>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"col-md-5\">\n");
      out.write("                                                        <select class=\"form-control\">\n");
      out.write("                                                            <option value=\"tipobusqueda\">Tipo Busqueda</option>\n");
      out.write("                                                            <option value=\"nommre\">Nombre</option>\n");
      out.write("                                                            <option value=\"id\">ID</option>\n");
      out.write("                                                            <option value=\"keyword\">Keyword</option>\n");
      out.write("                                                            <option value=\"estado\">Estado</option>\n");
      out.write("                                                        </select>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </ul>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"col-md-4\">\n");
      out.write("                                        <div class=\"list-group\">\n");
      out.write("                                            <ul class=\"list-group-item\">\n");
      out.write("                                                <div class=\"jumbotron \" style=\"width: 100%; margin-top: 5%; margin-bottom: 5%\">\n");
      out.write("                                                    <input type=\"submit\" name=\"buscar\" id=\"buscar\" value=\"Ejecutar Busqueda\" class=\"btn btn-primary btn-lg\"/>\n");
      out.write("                                                </div>\n");
      out.write("                                            </ul>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}