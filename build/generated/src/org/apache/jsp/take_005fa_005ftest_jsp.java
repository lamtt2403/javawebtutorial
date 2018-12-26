package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import dto.Quiz;
import java.util.List;
import java.util.List;
import dao.QuizDaoImpl;

public final class take_005fa_005ftest_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Take a test</title>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            div#test{\n");
      out.write("                border: #8BC34A 2px solid;\n");
      out.write("                padding: 10px 20px 20px 20px;\n");
      out.write("            }\n");
      out.write("            .button {\n");
      out.write("                background-color: #00BCD4;\n");
      out.write("                border: none;\n");
      out.write("                color: white;\n");
      out.write("                padding: 10px 20px;\n");
      out.write("                text-align: center;\n");
      out.write("                text-decoration: none;\n");
      out.write("                display: inline-block;\n");
      out.write("                font-size: 16px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .button:hover{\n");
      out.write("                background-color:#4CAF50;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            String lessonId = request.getParameter("lesson_id");
            lessonId = "1000";
            QuizDaoImpl quizDaoImpl = new QuizDaoImpl();
            List<Quiz> quizList = quizDaoImpl.getListQuizByLesson(Integer.parseInt(lessonId));
            System.out.println("Quiz size : " + quizList.size());
        
      out.write("\n");
      out.write("\n");
      out.write("        <h2 id = \"test_status\"></h2>\n");
      out.write("        <div id = \"test\">hello</div>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        /*\n");
      out.write("         var questionsJS = [\n");
      out.write("         [\"Which of the following is a server-side Java Script object?\", \"A. Function\", \"B. File\", \"C. FileUpload\", \"B\"],\n");
      out.write("         [\"To insert a JavaScript into an HTML page, which tag is used?\", \"\", \"\", \"\", \"\"],\n");
      out.write("         [\"\", \"\", \"\", \"\", \"\"],\n");
      out.write("         [\"\", \"\", \"\", \"\", \"\"],\n");
      out.write("         [\"\", \"\", \"\", \"\", \"\"],\n");
      out.write("         [\"\", \"\", \"\", \"\", \"\"],\n");
      out.write("         [\"\", \"\", \"\", \"\", \"\"],\n");
      out.write("         [\"\", \"\", \"\", \"\", \"\"],\n");
      out.write("         [\"\", \"\", \"\", \"\", \"\"],\n");
      out.write("         [\"\", \"\", \"\", \"\", \"\"],\n");
      out.write("         [\"\", \"\", \"\", \"\", \"\"],\n");
      out.write("         ];\n");
      out.write("         \n");
      out.write("         var questionsCSS = [\n");
      out.write("         [\"What does the a stand for in RGBa? \", \"A. alpha\", \"B. aqua \", \"C. Apple \", \"A\"],\n");
      out.write("         [\"How do four values work on border-radius \", \"A. top, bottom, left, right\", \"B. up, down, front, behind \", \"\tC. top-left, top-right, bottom-right, bottom-left \", \"C\"],\n");
      out.write("         [\"How can you created rounded corners using CSS3?\", \"A. border[round]: 30px; \", \"B. corner-effect: round; \", \"\tC. border-radius: 30px; \", \"C\"],\n");
      out.write("         [\"How do you add shadow to elements in CSS3? \", \"A. box-shadow: 10px 10px 5px grey\", \"\tB. shadow-right: 10px shadow-bottom: 10px; shadow-color: grey; \", \"\tC. shadow-color: grey; \", \"A\"],\n");
      out.write("         [\"How to you modify a border image using CSS3? \", \"A. border: url(image.png); \", \"\tB. border-variable: image url(image.png); \", \"C. border-image: url(border.png) 30 30 round; \", \"C\"],\n");
      out.write("         [\"How to resize a background image using CSS3? \", \" A. background-size: 80px 60px; \", \"B. bg-dimensions: 80px 60px; \", \"C. background-proportion: 80px 60px; \", \"A\"],\n");
      out.write("         [\"How to force a word wrap using CSS3? \", \"\tA. word-wrap: break-word; \", \"\tB. text-wrap: break-word; \", \"C. text-wrap: force; \", \"A\"],\n");
      out.write("         [\"Which of these are valid CSS3 transformation statements (select only one): \", \"A. matrix() \", \"B. modify() \", \"\tC. skip()\", \"A\"],\n");
      out.write("         [\"How to rotate objects using CSS3? \", \"A. object-rotation: 30deg; \", \"\tB. transform: rotate(30deg); \", \"\tC. rotate-object: 30deg; \", \"B\"],\n");
      out.write("         [\"The ____________ property specifies the stack order of an element \", \"A. d-index \", \"\tB. s-index \", \"\tC. z-index \", \"C\"],\n");
      out.write("         [\"The _____________ selector is used to specify a style for a single, unique element \", \"A. id\", \"B. class \", \"C. text \", \"A\"]\n");
      out.write("         ];\n");
      out.write("         \n");
      out.write("         \n");
      out.write("         var questions = [\n");
      out.write("         [\"What is the difference between XML and HTML? \", \"\tA. HTML is used for exchanging data, XML is not.\", \"B. XML is used for exchanging data, HTML is not \", \"C. HTML can have user defined tags, XML cannot \", \"B\"],\n");
      out.write("         [\"Opening Tag of HTML Tag is called as ________.\", \"A. Closed Tag\", \"B. Starting Tag\", \"\tC. Forward Tag\", \"A\"],\n");
      out.write("         [\"HTML stands for ________.\", \"A. Hyper Text Markup Language\", \"B. Hyper Text Makeup Language\", \"C. None of these \", \"A\"],\n");
      out.write("         [\"HTML program is saved using _________ extension.\", \"A. .htl\", \" B. .html \", \" C. .hml\", \"B\"],\n");
      out.write("         [\" Who was the primary author of HTML?\", \"\tA. Brendan Eich\", \"B. Sabeer Bhatiya\", \"C. Tim Berners-Lee\", \"C\"],\n");
      out.write("         [\"Which of the following is valid colour code ?\", \"A. #000000;\", \"\tB. #0000000;\", \"C. #00000000;\", \"A\"],\n");
      out.write("         [\"Caption Tag in HTML ?\", \"A. Is used to display the Title for table at the top\", \"B. Is used to display the Title for table at the bottom\", \"C. Both\", \"C\"],\n");
      out.write("         [\"Which of the following is used increase the row height?\", \"A. Cellspacing\", \"B. Cellpadding \", \"C. Row span\", \"C\"],\n");
      out.write("         [\"DOM stands for \", \"A. Document object model\", \"B. Data object model\", \"C. Document Oriented model\", \"C\"],\n");
      out.write("         [\"The href attribute in the link tag specifies the:\", \"A. Destination of a link\", \"\tB. Link\", \"C. Hypertext\", \"A\"]\n");
      out.write("         \n");
      out.write("         ];\n");
      out.write("         \n");
      out.write("         */\n");
      out.write("\n");
      out.write("        var pos = 0, test, test_status, question, choice, choices, chA, chB, chC, correct = 0;\n");
      out.write("        var questions = new Array();\n");
      out.write("//            \n");
      out.write("        ");
for (int i = 0; i < quizList.size(); i++) {
      out.write("\n");
      out.write("//                   Quiz q = quizList.get(i);\n");
      out.write("        questions[");
      out.print(i);
      out.write("] = [\"");
      out.print(quizList.get(i).getQuestion());
      out.write("\",\"");
      out.print(quizList.get(i).getAnswerA());
      out.write("\",\"");
      out.print(quizList.get(i).getAnswerB());
      out.write("\",\"");
      out.print(quizList.get(i).getAnswerC());
      out.write("\",\"");
      out.print(quizList.get(i).getCorrectAnswer());
      out.write("\"];   \n");
      out.write("        ");
}
      out.write("\n");
      out.write("//            \n");
      out.write("        var anserwerUser = [\"D\", \"D\", \"D\", \"D\"];\n");
      out.write("\n");
      out.write("        function _(x) {\n");
      out.write("            return document.getElementById(x);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function renderQuestion() {\n");
      out.write("            test = _(\"test\");\n");
      out.write("            _(\"test_status\").innerHTML = \"Question \" + (pos + 1) + \" of \" + questions.length;\n");
      out.write("            question = questions[pos][0];\n");
      out.write("            chA = questions[pos][1];\n");
      out.write("            chB = questions[pos][2];\n");
      out.write("            chC = questions[pos][3];\n");
      out.write("            test.innerHTML = \"<h3>\" + (pos + 1) + \".\" + question + \"<h3>\";\n");
      out.write("            test.innerHTML += \"<input type ='radio' name='choices' value='A'> \" + chA + \"<br>\";\n");
      out.write("            test.innerHTML += \"<input type ='radio' name='choices' value='B'> \" + chB + \"<br>\";\n");
      out.write("            test.innerHTML += \"<input type ='radio' name='choices' value='C'> \" + chC + \"<br><br>\";\n");
      out.write("            test.innerHTML += \"<button onclick='checkAnswer()' class='button'>SubmitAnswer</button>\";\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function checkAnswer() {\n");
      out.write("            choices = document.getElementsByName(\"choices\");\n");
      out.write("            for (var i = 0; i < choices.length; i++) {\n");
      out.write("                if (choices[i].checked) {\n");
      out.write("                    choice = choices[i].value;\n");
      out.write("                    anserwerUser[pos] = choice\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            if (choice == questions[pos][4]) {\n");
      out.write("                correct++;\n");
      out.write("            }\n");
      out.write("            pos++;\n");
      out.write("            if (pos < questions.length) {\n");
      out.write("                renderQuestion();\n");
      out.write("            } else {\n");
      out.write("                test.innerHTML = \"<h2>correct \" + correct + \" / \" + questions.length;\n");
      out.write("                _(\"test_status\").innerHTML = \"Ahihi\";\n");
      out.write("                pos = 0;\n");
      out.write("                correct = 0;\n");
      out.write("\n");
      out.write("                for (var i = 0; i < questions.length; i++) {\n");
      out.write("                    test.innerHTML += \"<h3>\" + (i + 1) + \".\" + questions[i][0] + \"<h3>\";\n");
      out.write("                    if (questions[i][4] == \"A\") {\n");
      out.write("\n");
      out.write("                        test.innerHTML += \"<input type ='radio' checked='checked'><font color='green'>\" + questions[i][1] + \"<font><br>\";\n");
      out.write("                        if (anserwerUser[i] == \"B\") {\n");
      out.write("                            test.innerHTML += \"<input type ='radio'><font color='red'>\" + questions[i][2] + \"<font><br>\";\n");
      out.write("                        } else {\n");
      out.write("                            test.innerHTML += \"<input type ='radio' >\" + questions[i][2] + \"<br>\";\n");
      out.write("                        }\n");
      out.write("\n");
      out.write("                        if (anserwerUser[i] == \"C\") {\n");
      out.write("                            test.innerHTML += \"<input type ='radio' ><font color='red'>\" + questions[i][3] + \"<font><br>\";\n");
      out.write("                        } else {\n");
      out.write("                            test.innerHTML += \"<input type ='radio' >\" + questions[i][3] + \"<br>\";\n");
      out.write("                        }\n");
      out.write("\n");
      out.write("                    } else if (questions[i][4] == \"B\") {\n");
      out.write("\n");
      out.write("                        if (anserwerUser[i] == \"A\") {\n");
      out.write("                            test.innerHTML += \"<input type ='radio' ><font color='red'>\" + questions[i][1] + \"<font><br>\";\n");
      out.write("                        } else {\n");
      out.write("                            test.innerHTML += \"<input type ='radio' >\" + questions[i][1] + \"<br>\";\n");
      out.write("                        }\n");
      out.write("\n");
      out.write("                        test.innerHTML += \"<input type ='radio' checked='checked'><font color='green' >\" + questions[i][2] + \"<font><br>\";\n");
      out.write("\n");
      out.write("                        if (anserwerUser[i] == \"C\") {\n");
      out.write("                            test.innerHTML += \"<input type ='radio' ><font color='red'>\" + questions[i][3] + \"<font><br>\";\n");
      out.write("                        } else {\n");
      out.write("                            test.innerHTML += \"<input type ='radio' >\" + questions[i][3] + \"<br>\";\n");
      out.write("                        }\n");
      out.write("\n");
      out.write("\n");
      out.write("                    } else {\n");
      out.write("\n");
      out.write("                        if (anserwerUser[i] == \"A\") {\n");
      out.write("                            test.innerHTML += \"<input type ='radio'><font color='red'>\" + questions[i][1] + \"<font><br>\";\n");
      out.write("                        } else {\n");
      out.write("                            test.innerHTML += \"<input type ='radio'>\" + questions[i][1] + \"<br>\";\n");
      out.write("                        }\n");
      out.write("\n");
      out.write("                        if (anserwerUser[i] == \"B\") {\n");
      out.write("                            test.innerHTML += \"<input type ='radio' ><font color='red'>\" + questions[i][2] + \"<font><br>\";\n");
      out.write("                        } else {\n");
      out.write("                            test.innerHTML += \"<input type ='radio' >\" + questions[i][2] + \"<br>\";\n");
      out.write("                        }\n");
      out.write("\n");
      out.write("                        test.innerHTML += \"<input type ='radio' checked='checked'><font color='green'>\" + questions[i][3] + \"<font><br>\";\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        window.addEventListener(\"load\", renderQuestion, false);\n");
      out.write("    </script>\n");
      out.write("\n");
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
