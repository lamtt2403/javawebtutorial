<%-- 
    Document   : content
    Created on : Dec 23, 2018, 9:07:58 AM
    Author     : Admin
--%>

<%@page import="dao.SubjectDaoImpl"%>
<%@page import="dao.LessonDaoImpl"%>
<%@page import="dto.Lesson"%>
<%@page import="dao.SectionContentDaoImpl"%>
<%@page import="dto.SectionContent"%>
<%@page import="dto.Section"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.SectionDaoImpl"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/content.css" rel='stylesheet' type='text/css' />
        <link href="css/menu_vertical.css" rel='stylesheet' type='text/css' />
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>

        <title>Content</title>
    </head>
    <body>
        <%

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
            int idLesson = 1000;
            if (lessonId != null) {
                idLesson = Integer.parseInt(lessonId);
            }
            List<Lesson> listLesson = new ArrayList<Lesson>();
            LessonDaoImpl ldi = new LessonDaoImpl();
            SubjectDaoImpl sdi = new SubjectDaoImpl();
            listLesson = ldi.getListLessonBySubjectID(1000);
            String state = sdi.getSubjectBySubjectID(1000).getState();

            SectionDaoImpl secdi = new SectionDaoImpl();
            SectionContentDaoImpl scdi = new SectionContentDaoImpl();
            List<Section> ls = new ArrayList();
            List<SectionContent> lsc = new ArrayList();
            ls = secdi.getListSectionById(idLesson);
            for (Section s : ls) {
                lsc.add(scdi.getSectionContentBySecID(s.getIdSection()));
                System.out.println(s.getName());
            }
        %>
        <div class="header">
            <a href="/JavaWebTutorial/index.jsp" class="logo">FTUTORIAL</a>
            <div class="header-right">
                <a class="active" href="/JavaWebTutorial/content.jsp?lesson_id=1000">HTML</a>
                <a href="/JavaWebTutorial/content.jsp?lesson_id=1028">CSS</a>
                <a href="/JavaWebTutorial/content.jsp?lesson_id=1000">JAVASCRIP</a>
                <form action="LogoutServlet" method="post">
                    <!--<a href="/JavaWebTutorial/index.jsp">LOGOUT</a>-->
                    <input type="submit" value ="LOGOUT"/>
                </form>
                
            </div>
        </div>


        <div class ="main">
            <%                for (int i = 0; i < lsc.size(); i++) {
                    SectionContent sc = lsc.get(i);
                    String nameSection = ls.get(i).getName();
            %>
            <h5> <%=nameSection%></h5>
            <p><%=sc.getContent()%></p>
            <p><%=sc.getDescription()%></p>
            <%
                }
            %>
        </div>


        <div class ="left">
            <div class="vertical-menu" id="menu">
                <%
                    for (Lesson l : listLesson) {
                        boolean isActice = false;
                        if (l.getId() == idLesson) {
                            isActice = true;
                        }
                %>
                <a href="content.jsp?lesson_id=<%=l.getId()%>"<%
                    if (isActice) { %>
                   class="active" 
                   <%} else {%>
                   class=""
                   <%}%>><%=l.getName()%></a>
                <%
                    }
                %>
            </div> 

        </div>

    </body>
</html>
