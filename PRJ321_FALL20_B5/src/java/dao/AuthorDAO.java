/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Author;
import java.sql.*;
import java.util.*;

/**
 *
 * @author tuan anh
 */
public class AuthorDAO {

    private Connection con;

    public AuthorDAO(Connection con) {
        this.con = con;
    }

    public List<Author> getAllAuthor() {

        List<Author> listA = new ArrayList<>();

        try {

            String sql = "select * from Author";

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Author a = new Author(rs.getInt("authorid"), rs.getString("authorname"));

                listA.add(a);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listA;
    }

}
