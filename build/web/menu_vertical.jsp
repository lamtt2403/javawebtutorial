<%-- 
    Document   : menu_vertical
    Created on : Dec 23, 2018, 9:24:27 AM
    Author     : Admin
--%>

<%@page import="dao.SubjectDaoImpl"%>
<%@page import="dao.LessonDaoImpl"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dto.Lesson"%>
<%@page import="java.util.List"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/menu_vertical.css" rel='stylesheet' type='text/css' />
    </head>
    <body>
        <%
            List<Lesson> listLesson = new ArrayList<Lesson>();
            LessonDaoImpl ldi = new LessonDaoImpl();
            SubjectDaoImpl sdi = new SubjectDaoImpl();
            listLesson = ldi.getListLessonBySubjectID(1000);
            String state = sdi.getSubjectBySubjectID(1000).getState();
            int lessonID = 1002;
        %>
        <div class="vertical-menu" id="menu">
            <%
                for (Lesson l : listLesson) {
                    boolean isActice = false;
                    if (l.getId() == lessonID) {
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

        <script>
            // Add active class to the current button (highlight it)
            var header = document.getElementById("menu");
            var btns = header.getElementsByClassName("a");
            for (var i = 0; i < btns.length; i++) {
                btns[i].addEventListener("click", function () {
                    var current = document.getElementsByClassName("active");
                    current[0].className = current[0].className.replace("active", "");
                    this.className += "active";
                });
            }
        </script>
    </body>
</html>
