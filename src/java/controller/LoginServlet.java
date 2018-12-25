/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.sun.corba.se.spi.presentation.rmi.StubAdapter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.CookieHandler;
import java.net.CookieManager;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import utils.Qldt;

/**
 *
 * @author Admin
 */
@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

    public LoginServlet() {
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String msv = req.getParameter("msv");
        String pass = req.getParameter("password");
        String result = "Sai tài khoản hoặc mật khẩu";

        try {
            String mainQLDT = "http://qldt.ptit.edu.vn/";
            String defaultQLDT = "http://qldt.ptit.edu.vn/default.aspx";

            Qldt http = new Qldt();

            CookieHandler.setDefault(new CookieManager());
            http.GetCookie(mainQLDT);
            String postParams = http.getFormParams(msv, pass);
            http.sendPost(defaultQLDT, postParams);
            if (http.checkLogin(msv)) {
                HttpSession session = req.getSession();
                session.setAttribute("msv", msv);
                //setting session to expiry in 30 mins
                session.setMaxInactiveInterval(1 * 60);

                Cookie loginCookie = new Cookie("msv", msv);
                //setting cookie to expiry in 30 mins
                loginCookie.setMaxAge(30 * 60);
                resp.addCookie(loginCookie);
                resp.sendRedirect("/JavaWebTutorial/content.jsp?lesson_id=1000");
            } else {
                RequestDispatcher rd = getServletContext().getRequestDispatcher("/JavaWebTutorial/login.jsp");
			PrintWriter out= resp.getWriter();
			out.println("<font color=red>Either user name or password is wrong.</font>");
			rd.include(req, resp);
//                resp.sendRedirect("/JavaWebTutorial/login.jsp");
            }

        } catch (Exception ex) {

//        String err= "";
//        String url = "/login.jsp";
//        
//        
//        if(msv.equals("admin") && pass.equals("admin")){
//            resp.sendRedirect("/JavaWebTutorial/content.jsp?lesson_id=1000");
//        }else {
//            resp.sendRedirect("/login.jsp");
//        }
        }
    }

}