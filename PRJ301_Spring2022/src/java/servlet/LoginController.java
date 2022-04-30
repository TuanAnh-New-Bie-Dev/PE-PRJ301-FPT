/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import dao.UserDAO;
import entity.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import jdbc.DBConnect;

/**
 *
 * @author tuan anh
 */
public class LoginController extends HttpServlet {

    UserDAO userDao = new UserDAO(DBConnect.getConnection());

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();

        request.getRequestDispatcher("login.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();

        String us = request.getParameter("us");
        String pass = request.getParameter("pass");
        String alert = "";

        if (us.equals("") && pass.equals("")) {

            alert = "UserID and Password can't be empty!";
            request.setAttribute("alertMsg", alert);
            request.getRequestDispatcher("login.jsp").forward(request, response);
            return;

        }
        
        if (userDao.checkUserID(us) == null || userDao.checkPassword(pass) == null) {

            alert = "incorrect UserID or Password!";
            request.setAttribute("alertMsg", alert);
            request.getRequestDispatcher("login.jsp").forward(request, response);
            return;

        }

        User account = userDao.login(us, pass);

        if (account != null) {

            HttpSession session = request.getSession();

            session.setAttribute("account", account);

            request.getRequestDispatcher("admin.jsp").forward(request, response);

        }

    }

}
