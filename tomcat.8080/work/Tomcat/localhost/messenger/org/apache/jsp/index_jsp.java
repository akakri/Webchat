/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.0.20
 * Generated at: 2024-01-21 16:30:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import java.util.ArrayList;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Web Chat</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("  <div style=\"width:100%; border:1px solid #000; height:200px; text-align:center;\">\r\n");
      out.write("  <h1>Register User</h1>\r\n");
      out.write("  <form action=\"");
      out.print( request.getContextPath() );
      out.write("/register\" method=\"post\">\r\n");
      out.write("   <table style=\"width: 80%\">\r\n");
      out.write("    <tr>\r\n");
      out.write("     <td>UserName</td>\r\n");
      out.write("     <td><input type=\"text\" name=\"usern\" /></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("     <td>Password</td>\r\n");
      out.write("     <td><input type=\"password\" name=\"pas\" /></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("   </table>\r\n");
      out.write("   <input type=\"submit\" value=\"Submit\" />\r\n");
      out.write("  </form>\r\n");
      out.write("  ");


      String mesg = (String) request.getAttribute("message");
      if(mesg!=null){
            if (mesg=="Successfully registered") {
                out.println("<p style='color: green;'>" + mesg + "</p>");
            }
            if(mesg=="Failed to register"){
                 out.println("<p style='color: red;'>" + mesg + "</p>");

            }
          }
  
      out.write("\r\n");
      out.write("  ");


  
      out.write("\r\n");
      out.write(" </div>\r\n");
      out.write("\r\n");
      out.write(" <div style=\"width:100%; border:1px solid #000; height:200px; text-align:center;\">\r\n");
      out.write("   <h1>Send message</h1>\r\n");
      out.write("   <form action=\"");
      out.print( request.getContextPath() );
      out.write("/message\" method=\"post\">\r\n");
      out.write("    <table style=\"width: 80%\">\r\n");
      out.write("     <tr>\r\n");
      out.write("      <td>sending to: </td>\r\n");
      out.write("      <td><input type=\"text\" name=\"usernam\" /></td>\r\n");
      out.write("     </tr>\r\n");
      out.write("     <tr>\r\n");
      out.write("      <td>message: </td>\r\n");
      out.write("      <td><input type=\"text\" name=\"message\" /></td>\r\n");
      out.write("     </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("    <input type=\"submit\" value=\"send\" />\r\n");
      out.write("   </form>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  <div style=\"width:100%; border:1px solid #000; text-align:center;\">\r\n");
      out.write("    <h1>Inbox</h1>\r\n");
      out.write("    <form action=\"");
      out.print( request.getContextPath() );
      out.write("/message\" method=\"get\">\r\n");
      out.write("     <table style=\"width: 80%\">\r\n");
      out.write("      <tr>\r\n");
      out.write("       <td>UserName</td>\r\n");
      out.write("       <td><input type=\"text\" name=\"username\" /></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("       <td>Password</td>\r\n");
      out.write("       <td><input type=\"password\" name=\"password\" /></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("     </table>\r\n");
      out.write("     <input type=\"submit\" value=\"log-in\" />\r\n");
      out.write("    </form>\r\n");
      out.write("    <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty messages}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("         ");
 if (request.getAttribute("messages") != null) { 
      out.write("\r\n");
      out.write("                    <h2>Received:</h2>\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        ");
 for (String message : (ArrayList<String>) request.getAttribute("messages")) { 
      out.write("\r\n");
      out.write("                            <li>");
      out.print( message );
      out.write("</li>\r\n");
      out.write("                        ");
 } 
      out.write("\r\n");
      out.write("                    </ul>\r\n");
      out.write("          ");
 } 
      out.write("\r\n");
      out.write("    </c:if>\r\n");
      out.write("   </div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
