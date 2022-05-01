/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Paper;
import java.sql.*;
import java.util.*;

/**
 *
 * @author tuan anh
 */
public class PaperDAO {

    private Connection con;

    public PaperDAO(Connection con) {
        this.con = con;
    }

    public List<Paper> getPaperByAuthor(int authorid) {

        List<Paper> listP = new ArrayList<>();

        try {

            String sql = "select * from Paper join Author_paper on Paper.paperid = Author_paper.paperid where Author_paper.authorid = ?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, authorid);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Paper p = new Paper(rs.getInt("paperid"), rs.getString("title"), rs.getString("publisheddate"));

                listP.add(p);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listP;
    }

    public boolean insert(int pid, String title, String date, String[] author) {

        boolean f = false;

        try {

            String sql = "insert into Paper values(?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, pid);
            ps.setString(2, title);
            ps.setString(3, date);

            ps.executeUpdate();

            for (int i = 0; i < author.length; i++) {

                String sql234 = "insert into Author_Paper values(?, ?)";

                PreparedStatement ps3 = con.prepareStatement(sql234);
                int a1 = Integer.parseInt(author[i]);

                ps3.setInt(1, pid);
                ps3.setInt(2, a1);

                ps3.executeUpdate();

            }

            f = true;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return f;
    }

}
