package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loginPge_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Online Timetable Generator</title>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <link type=\"text/css\" href=\"css/ionic.min.css\" rel=\"stylesheet\"/>\r\n");
      out.write("        <link type=\"text/css\" href=\"css/ottgstyle.css\" rel=\"stylesheet\"/><!---->\r\n");
      out.write("        <link type=\"text/css\" href=\"css/bootstrap.min.css\" rel=\"stylesheet\"/>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body >\r\n");
      out.write("        <!---->\r\n");
      out.write("\r\n");
      out.write("        ");
            String username = (String) session.getAttribute("username");
            if (username != null) {
                out.print("Nice having you " + username + "<a href=\"Logout.jsp\">Logout</a>");
            } else {
        
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\" >\r\n");
      out.write("                <div class=\"Absolute-Center is-Responsive  card \">\r\n");
      out.write("                    <h1 style=\"color:white;\">Online Timetable Generator</h1>\r\n");
      out.write("                    <div class=\"col-sm-12 col-md-10 col-md-offset-1\">\r\n");
      out.write("\r\n");
      out.write("                        <form action=\"verifyLogin.jsp\" id=\"loginForm\" method=\"post\">\r\n");
      out.write("                            <div class=\"form-group input-group\">\r\n");
      out.write("                                <span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-user\"></i></span>\r\n");
      out.write("                                <input required=\"true\" class=\"form-control\" type=\"text\" name='username' placeholder=\"username\"/>          \r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group input-group\">\r\n");
      out.write("                                <span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-tower\"></i></span>\r\n");
      out.write("                                <input required=\"true\" class=\"form-control\" type=\"password\" name='password' placeholder=\"password\"/>     \r\n");
      out.write("                            </div>\r\n");
      out.write("                            <br>\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-primary btn-block\">Login</button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group text-center\" >\r\n");
      out.write("                                <a href=\"#\">Forgot Password</a>&nbsp;|&nbsp;<a href=\"#\">Support</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </form>  \r\n");
      out.write("\r\n");
      out.write("                    </div>  \r\n");
      out.write("                </div>    \r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        ");

            }
        
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
