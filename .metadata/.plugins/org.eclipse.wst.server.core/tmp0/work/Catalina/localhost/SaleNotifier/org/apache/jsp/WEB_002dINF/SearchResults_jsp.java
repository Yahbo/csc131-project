/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat (TomEE)/7.0.62 (1.7.2)
 * Generated at: 2015-11-30 09:18:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SearchResults_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/searchresults.css", Long.valueOf(1448846827000L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("<script src=\"modernizr-1.5.js\"></script>\n");
      out.write("<style>  ");
      out.write("/*\r\n");
      out.write("   Splash Page style sheet\r\n");
      out.write("   Author: Michael Haight & Mohamed Saleh\r\n");
      out.write("   Date:   10/31/2015\r\n");
      out.write("\r\n");
      out.write("   Filename:         searchresults.css\r\n");
      out.write("   Supporting Files: none\r\n");
      out.write("\r\n");
      out.write("*/\r\n");
      out.write("\r\n");
      out.write("/* Section Styles */\r\n");
      out.write("\r\n");
      out.write("body {\r\n");
      out.write("\tmargin: 0px auto;\r\n");
      out.write("\tpadding: 0px;\r\n");
      out.write("\tline-height: 1.5em;\r\n");
      out.write("\twidth: 98%;\r\n");
      out.write("\tmax-width: 980px;\r\n");
      out.write("\tmax-height: 780px;\r\n");
      out.write("\tmin-width: 250px;\r\n");
      out.write("\tfont-family: Verdana, Geneva, sans-serif\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("header {\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\tmargin-top: 2em;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("section {\r\n");
      out.write("\twidth: 66%;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Block Styles */\r\n");
      out.write("h1, h2, h3, h4, h5, h6 {\r\n");
      out.write("\tfont-family: Arial, Helvetica, sans-serif;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("header h1 {\r\n");
      out.write("   margin: 1em 0em;\r\n");
      out.write("   font-size: 2em;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("h2 {\r\n");
      out.write("   display: block;\r\n");
      out.write("   margin: 2em 5.1em;\r\n");
      out.write("   font-size: 1.5em;\r\n");
      out.write("   padding: 0px;\r\n");
      out.write("   float: right;\r\n");
      out.write("   position: relative;\r\n");
      out.write("   left: -120px;\r\n");
      out.write("   text-align: left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("img{\r\n");
      out.write("   display: block;\r\n");
      out.write("   height: 250px;\r\n");
      out.write("   width: 350px;\r\n");
      out.write("}");
      out.write("  </style>\t   \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\t\t\t\t<form id=\"survey\" name=\"survey\"\n");
      out.write("\t\t\t\t\taction=\"UserAccount\"\n");
      out.write("\t\t\t\t\tmethod=\"post\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\t<fieldset id=\"searchbar\">\n");
      out.write("\t\t\t\t\t\t<input type=\"search\" name=\"search\" id=\"search\" placeholder=\"Search\"/>\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" value=\"Go\" />\n");
      out.write("\t\t\t\t\t</fieldset>\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t");
 String table  = (String) request.getAttribute("table"); 
      out.write('\n');
      out.write('	');
      out.write('	');
      out.print( table );
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
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
