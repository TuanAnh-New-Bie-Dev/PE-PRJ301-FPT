/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import dao.AuthorDAO;
import dao.PaperDAO;
import entity.Author;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import jdbc.DBConnect;

/**
 *
 * @author tuan anh
 */
public class AddController extends HttpServlet {

    AuthorDAO authorDao = new AuthorDAO(DBConnect.getConnection());
    PaperDAO paperDao = new PaperDAO(DBConnect.getConnection());

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();

        List<Author> listA = authorDao.getAllAuthor();

        request.setAttribute("listA", listA);
        request.getRequestDispatcher("add.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();

        String[] author = request.getParameterValues("author");
        int pid = Integer.parseInt(request.getParameter("pid"));
        String title = request.getParameter("title");
        String date = request.getParameter("date");

        boolean f = paperDao.insert(pid, title, date, author);

        if (f = true) {
            out.println("Save Success!");
        } else {
            out.println("Save Fail!");  
        }

    }

}
