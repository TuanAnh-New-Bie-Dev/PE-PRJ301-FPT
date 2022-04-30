/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import dao.FoodDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import jdbc.DBConnect;

/**
 *
 * @author tuan anh
 */
public class DeleteController extends HttpServlet {

    FoodDAO foodDao = new FoodDAO(DBConnect.getConnection());
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        
        String fid = request.getParameter("fid");
        
        boolean f = foodDao.delete(fid);
        
        if(f == true) {
            
            request.setAttribute("alert", "delete success!");
            request.getRequestDispatcher("search.jsp").forward(request, response);
            
        } else {
            
            request.setAttribute("alertMsg", "delete fail!");
            request.getRequestDispatcher("search.jsp").forward(request, response);
            
        }
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
    }
    
}
