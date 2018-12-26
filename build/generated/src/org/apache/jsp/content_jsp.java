package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import utils.MyUtils;
import dao.SubjectDaoImpl;
import dao.LessonDaoImpl;
import dto.Lesson;
import dao.SectionContentDaoImpl;
import dto.SectionContent;
import dto.Section;
import java.util.List;
import java.util.ArrayList;
import dao.SectionDaoImpl;

public final class content_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("\r\n");
      out.write("        <link href=\"css/content.css\" rel='stylesheet' type='text/css' />\r\n");
      out.write("        <link href=\"css/menu_vertical.css\" rel='stylesheet' type='text/css'/>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"libs/bootstrap/dist/css/bootstrap.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"libs/font/Open-Sans/style.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"libs/font/Righteous-Regular/style.css\">\r\n");
      out.write("        <link rel='stylesheet' href='css/index.css'>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"libs/font-awesome/web-fonts-with-css/css/fontawesome-all.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"libs/prismjs/prism.css\">\r\n");
      out.write("\r\n");
      out.write("        <script src=\"libs/jquery/dist/jquery.js\"></script>\r\n");
      out.write("        <script src=\"libs/bootstrap/dist/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <script src=\"libs/prismjs/prism.min.js\" data-manual></script>     \r\n");
      out.write("        <title>Content</title>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        ");

            
            String msv = null;
            if (session.getAttribute("msv") == null) {
                response.sendRedirect("/JavaWebTutorial/login.jsp");
                return;
            }

            String name = null;
            String sessionId = null;
            Cookie[] cookies = request.getCookies();
            if (cookies != null) {
                for (Cookie cookie : cookies) {
                    if (cookie.getName().equals("msv")) {
                        name = cookie.getValue();
                    }
                }
            }

            String lessonId = request.getParameter("lesson_id");
            String subjectId = request.getParameter("subject_id");
            int idLesson = 1000;
            int idSubject = 1000;
            if (lessonId != null) {
                idLesson = Integer.parseInt(lessonId);
            }
            if (subjectId != null) {
                idSubject = Integer.parseInt(subjectId);
            }

            LessonDaoImpl ldi = new LessonDaoImpl();
            SubjectDaoImpl sdi = new SubjectDaoImpl();
            List<Lesson> listLesson = ldi.getListLessonBySubjectID(idSubject);

            SectionDaoImpl secdi = new SectionDaoImpl();
            SectionContentDaoImpl scdi = new SectionContentDaoImpl();
            List<SectionContent> lsc = new ArrayList();
            List<Section> sections = secdi.getListSectionById(idLesson);
            for (Section s : sections) {
                lsc.add(scdi.getSectionContentBySecID(s.getIdSection()));
                System.out.println(s.getName());
            }
            String lessonName = "";
            int positionLesson = MyUtils.getPostionLesson(idLesson, listLesson);
        
      out.write("\r\n");
      out.write("        <div>\r\n");
      out.write("            <nav class='navbar navbar-default static-navbar'>\r\n");
      out.write("                <div class='navbar-header'>\r\n");
      out.write("                    <button type='button' class='navbar-toggle'>\r\n");
      out.write("                        <span class='sr-only'>Toggle navigation</span>\r\n");
      out.write("                        <span class='icon-bar'></span>\r\n");
      out.write("                        <span class='icon-bar'></span>\r\n");
      out.write("                        <span class='icon-bar'></span>\r\n");
      out.write("                    </button>\r\n");
      out.write("                    <a class='navbar-brand logo' href='/JavaWebTutorial/index.jsp'>\r\n");
      out.write("                        <img class='logo-img' src='images/logo-small.png' alt='logo'/>\r\n");
      out.write("                        <span class='hidden-sm hidden-md hidden-xs' style='font-family: Righteous'>FTutorial</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class='navbar-collapse'>\r\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                        <li class=\"dropdown pointer\">\r\n");
      out.write("                            <a class=\"dropdown-toggle nav-font\" href=\"/JavaWebTutorial/content.jsp?subject_id=1000&lesson_id=1000\">\r\n");
      out.write("                                <i class=\"fab fa-html5\"></i>\r\n");
      out.write("                                <span class=\"hidden-sm hidden-md\">\r\n");
      out.write("                                    HTML\r\n");
      out.write("                                </span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"dropdown pointer\">\r\n");
      out.write("                            <a class=\"dropdown-toggle nav-font\" href=\"/JavaWebTutorial/content.jsp?subject_id=1001&lesson_id=1028\">\r\n");
      out.write("                                <i class=\"fab fa-css3\"></i>\r\n");
      out.write("                                <span class=\"hidden-sm hidden-md\">\r\n");
      out.write("                                    CSS\r\n");
      out.write("                                </span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"dropdown pointer\">\r\n");
      out.write("                            <a class=\"dropdown-toggle nav-font\" href=\"/JavaWebTutorial/content.jsp?subject_id=1002&lesson_id=1000\">\r\n");
      out.write("                                <i class=\"fab fa-js\"></i>\r\n");
      out.write("                                <span class=\"hidden-sm hidden-md\">\r\n");
      out.write("                                    JAVASCRIPT\r\n");
      out.write("                                </span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"dropdown pointer\">\r\n");
      out.write("                            <a class=\"dropdown-toggle nav-font\" href=\"/JavaWebTutorial/editor.jsp\">\r\n");
      out.write("                                <i class=\"fas fa-terminal\"></i>\r\n");
      out.write("                                <span class=\"hidden-sm hidden-md\">\r\n");
      out.write("                                    EDITOR\r\n");
      out.write("                                </span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"dropdown pointer\">\r\n");
      out.write("                            <a class=\"dropdown-toggle nav-font\" href=\"\" id=\"account-menu\" data-toggle='dropdown'>\r\n");
      out.write("                                <span>\r\n");
      out.write("                                    <i class=\"fas fa-user\"></i>\r\n");
      out.write("                                    <span class=\"hidden-sm hidden-md\">\r\n");
      out.write("                                        ACCOUNT\r\n");
      out.write("                                    </span>\r\n");
      out.write("                                    <b class=\"caret\"></b>\r\n");
      out.write("                                </span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <ul class=\"dropdown-menu\" role=\"menu\">\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <a>\r\n");
      out.write("                                        <i class=\"fas fa-info-circle\"></i>\r\n");
      out.write("                                        <span>Details</span>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <a>\r\n");
      out.write("                                        <i class=\"fas fa-wrench\"></i>\r\n");
      out.write("                                        <span>Settings</span>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <a id=\"logout\" action=\"LogoutServlet\" method=\"post\">\r\n");
      out.write("                                        <i class=\"fas fa-sign-out-alt\"></i>\r\n");
      out.write("                                        <span>Sign out</span>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <!-- <li>\r\n");
      out.write("                                    <a id=\"login\">\r\n");
      out.write("                                        <i class=\"fas fa-sign-in-alt\"></i>\r\n");
      out.write("                                        <span>Sign in</span>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </li> -->\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"progress-bar-left\">\r\n");
      out.write("            <div class=\"list-group list-group-flush sidenav hidden-xs hidden-sm\">\r\n");
      out.write("                ");

                    for (Lesson l : listLesson) {
                        if (l.getId() == idLesson) {
                            lessonName = l.getName();
                
      out.write("\r\n");
      out.write("                <a class=\"list-group-item list-group-item-action active\" href=\"content.jsp?subject_id=");
      out.print(idSubject);
      out.write("&lesson_id=");
      out.print(l.getId());
      out.write('"');
      out.write('>');
      out.print(l.getName());
      out.write("</a>\r\n");
      out.write("                ");

                } else {
                
      out.write("\r\n");
      out.write("                <a class=\"list-group-item list-group-item-action\" href=\"content.jsp?subject_id=");
      out.print(idSubject);
      out.write("&lesson_id=");
      out.print(l.getId());
      out.write('"');
      out.write('>');
      out.print(l.getName());
      out.write("</a>\r\n");
      out.write("                ");

                    }
                
      out.write("\r\n");
      out.write("                ");

                    }
                
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"progress-bar-right\">\r\n");
      out.write("            <div class=\"hidden-xs hidden-sm sidenav\" style=\"padding-left: 10px; padding-right: 10px;\">\r\n");
      out.write("                <h5>Follow us</h5>\r\n");
      out.write("                <iframe src=\"https://www.facebook.com/plugins/page.php?href=https%3A%2F%2Fwww.facebook.com%2Fftutorialnth%2F&tabs=timeline&width=250&height=500&small_header=false&adapt_container_width=true&hide_cover=false&show_facepile=true&appId=557851737992275\" width=\"225\" height=\"350\" style=\"border: none; overflow: hidden;\" scrolling=\"no\" frameborder=\"0\" allowTransparency=\"true\" allow=\"encrypted-media\"></iframe>\r\n");
      out.write("                <div style=\"margin-top: 20px;\">\r\n");
      out.write("                    <h5>Color Picker</h5>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"container well\" style=\"margin-top: 65px;\">\r\n");
      out.write("            <div class=\"lesson-nav\">\r\n");
      out.write("                <div style=\"display: flex; align-items: center;\">\r\n");
      out.write("                    <button type=\"button\" class=\"btn btn-default\" \r\n");
      out.write("                            onclick=\"openPage('");
      out.print(MyUtils.setUrlBack(positionLesson, idSubject, listLesson));
      out.write("')\">\r\n");
      out.write("                        <i class=\"fas fa-chevron-left\"></i>\r\n");
      out.write("                    </button>\r\n");
      out.write("                </div>\r\n");
      out.write("                <span style=\"font-weight: bold; font-size:40px; flex-grow: 1; text-align: center;\">");
      out.print( lessonName);
      out.write("</span>\r\n");
      out.write("                <div style=\"display: flex; align-items: center;\">\r\n");
      out.write("                    <button type=\"button\" class=\"btn btn-default\" \r\n");
      out.write("                            onclick=\"openPage('");
      out.print(MyUtils.setUrlNext(positionLesson, idSubject, listLesson));
      out.write("')\">\r\n");
      out.write("                        <i class=\"fas fa-chevron-right\"></i>\r\n");
      out.write("                    </button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <ol>\r\n");
      out.write("                <div class=\"content-frame\">\r\n");
      out.write("                    ");

                        for (int i = 0; i < lsc.size(); i++) {
                            SectionContent sc = lsc.get(i);
                            String nameSection = sections.get(i).getName();
                    
      out.write("\r\n");
      out.write("                    <li style=\"font-weight: bold; font-size: 24px;\">");
      out.print( nameSection);
      out.write("</li>\r\n");
      out.write("                    <p>");
      out.print( sc.getContent());
      out.write("</p>\r\n");
      out.write("                    ");

                        if (sc.getDescription() != null) {
                    
      out.write("\r\n");
      out.write("                    <p class=\"description\">");
      out.print( sc.getDescription());
      out.write("</p>\r\n");
      out.write("                    ");

                        }
                        if (sc.getWarning() != null) {
                    
      out.write("\r\n");
      out.write("                    <p class='warning-frame'>");
      out.print( sc.getWarning());
      out.write("</p>\r\n");
      out.write("                    ");

                        }
                    
      out.write("\r\n");
      out.write("                    <hr>\r\n");
      out.write("                    ");

                        }
                    
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </ol>\r\n");
      out.write("\r\n");
      out.write("            <div style=\"margin-bottom: 70px; display: flex; justify-content: center;\">\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-default\" style=\"float: left;\" \r\n");
      out.write("                        onclick=\"openPage('");
      out.print(MyUtils.setUrlBack(positionLesson, idSubject, listLesson));
      out.write("')\">\r\n");
      out.write("                    <i class=\"fas fa-chevron-left\"></i>\r\n");
      out.write("                </button>\r\n");
      out.write("                <div style=\"flex-grow: 1; justify-content: center; display: flex;\">\r\n");
      out.write("                    <button type=\"button\" class=\"btn btn-success\" \r\n");
      out.write("                            onclick=\"openPage('take_a_test.jsp?lesson_id=");
      out.print(lessonId);
      out.write("')\">\r\n");
      out.write("                        <i class=\"fas fa-check-circle\"></i>&nbsp;<span>Take a Test</span>\r\n");
      out.write("                    </button>\r\n");
      out.write("                </div>\r\n");
      out.write("                        <button type=\"button\" class=\"btn btn-default\" style=\"float: right;\"\r\n");
      out.write("                                onclick=\"openPage('");
      out.print(MyUtils.setUrlNext(positionLesson, idSubject, listLesson));
      out.write("')\">\r\n");
      out.write("                    <i class=\"fas fa-chevron-right\"></i>\r\n");
      out.write("                </button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        function openPage(pageURL)\r\n");
      out.write("        {\r\n");
      out.write("            window.location.href = pageURL;\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("</html>");
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
