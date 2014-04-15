package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AgregarTrabajador_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Agregar Trabajador</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class='container'>\n");
      out.write("            <form method=\"post\">\n");
      out.write("\n");
      out.write("                <table class=\"table\">\n");
      out.write("                    <tbody>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                <h2>\n");
      out.write("                                    Agregar Trabajador\n");
      out.write("                                </h2>\n");
      out.write("                                <table class=\"table table-striped\" style=\"width: 80%; margin-top: 5%;\">\n");
      out.write("                                    <tbody>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>\n");
      out.write("                                                <h4> <span class='glyphicon glyphicon-user'></span> Nombre:</h4>\n");
      out.write("                                            </td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" id=\"nombre\" placeholder=\"Ingrese el Nombre\" name=\"nombre\">\n");
      out.write("                                            </td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>\n");
      out.write("                                                <h4> <span class='glyphicon glyphicon-glass'></span> Id:</h4>\n");
      out.write("                                            </td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" id=\"id\" placeholder=\"Ingrese el Id\" name=\"id\">\n");
      out.write("                                            </td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>\n");
      out.write("                                                <h4> <span class='glyphicon glyphicon-usd'></span> Precio Por Hora:</h4>\n");
      out.write("                                            </td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input type=\"number\" class=\"form-control\" id=\"precioPorHora\" placeholder=\"Ingrese el Precio Por Hora\" name=\"precioPorHora\">\n");
      out.write("                                            </td>\n");
      out.write("                                        </tr>\n");
      out.write("\n");
      out.write("                                    </tbody>\n");
      out.write("                                </table>\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <div class=\"jumbotron \" style=\"width: 100%; margin-top: 25%\">\n");
      out.write("                                    <p>\n");
      out.write("                                        <button type=\"button\" class=\"btn btn-primary btn-lg\">Aceptar</button>\n");
      out.write("                                    </p>\n");
      out.write("                                    <p>\n");
      out.write("                                        <button type=\"button\" class=\"btn btn-primary btn-lg\">Cancelar</button>\n");
      out.write("                                    </p>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </td>\n");
      out.write("                        </tr> \n");
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("\n");
      out.write("                </table>\n");
      out.write("                 <p>                    \n");
      out.write("                    Tags del trabajador (Porfavor separarlos con una coma \",\" )\n");
      out.write("                    <textarea style=\"max-width: 100%; min-width: 100%\" class=\"form-control\" rows=\"4\" name=\"tags\">\"Tags\"</textarea>\n");
      out.write("                </p>\n");
      out.write("            </form>\n");
      out.write("            \n");
      out.write("        </div>\n");
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
