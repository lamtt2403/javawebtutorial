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
        <script src="https://code.jquery.com/jquery-3.3.1.min.js" integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8=" crossorigin="anonymous"></script>
        <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css" integrity="sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/" crossorigin="anonymous">
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
            List<Lesson> listLesson = new ArrayList<>();
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
        <div class="container-fluid">
            <nav class="navbar navbar-expand-md navbar-dark bg-light static-top navbar-fixed-top">
                <div class="container-fluid">
                    <a class="navbar-brand" href="#">
                        <a href="/JavaWebTutorial/index.jsp" title=""><img src="logo/logo.png" alt="" ></a>
                        <p class="text-dark font-weight-bold">FTutorial</p>


                    </a>
                    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse" id="navbarResponsive">
                        <ul class="navbar-nav ml-auto ">
                            <li class="nav-item">
                                <a class="nav-link text-dark"  href="/JavaWebTutorial/index.jsp"><i class="fas fa-home"></i> Home
                                </a>
                            </li>
                            <li class="nav-item">
                                <a href="/JavaWebTutorial/content.jsp?lesson_id=1000" class="nav-link text-dark"><i class="fab fa-html5"></i> HTML</a>
                            </li>
                            <li class="nav-item">
                                <a href="/JavaWebTutorial/content.jsp?lesson_id=1028" class="nav-link text-dark"><i class="fab fa-css3"></i> CSS</a>
                            </li>
                            <li class="nav-item">
                                <a href="/JavaWebTutorial/content.jsp?lesson_id=1000" class="nav-link text-dark"><i class="fab fa-js-square"></i> JAVASCRIPT</a>
                            </li>
                            <li class="nav-item">
                                <a href="" class="nav-link text-dark"><i class="fas fa-user"></i> ACCOUNT</a>
                            </li>
                            <li class="nav-item">
                                <a href="" class="nav-link text-dark" action="LogoutServlet" method="post" value ="LOGOUT"><i class="fas fa-tools"></i> LOGOUT</a>
                            </li>
                        </ul>
                    </div>
                </div>
            </nav>
        </div>


        <div class ="main">
            <%                for (int i = 0; i < lsc.size(); i++) {
                    SectionContent sc = lsc.get(i);
                    String nameSection = ls.get(i).getName();
                    if (sc.getDescription()==null){
                        sc.setDescription("");                      
                    }
                    if (sc.getWarning() ==null) {
                        sc.setWarning("");                      
                    }
            %>
            <h5> <%=nameSection%></h5>
            <hr>
            <p><%=sc.getContent()%></p>
            <hr>
            <div class="alert alert-info">
                <strong><%=sc.getDescription()%></strong>
            </div>   
            <hr>
            <div class='alert alert-warning'>
                <strong><%=sc.getWarning()%></strong>
            </div>
            <hr>
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
        <script type="text/javascript" src="js/bootstrap.js"></script>         
    </body>
</html>
