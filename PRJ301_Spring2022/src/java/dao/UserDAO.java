/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.User;
import java.sql.*;

/**
 *
 * @author tuan anh
 */
public class UserDAO {

    private Connection con;

    public UserDAO(Connection con) {
        this.con = con;
    }

    public User login(String us, String pass) {

        User u = null;

        try {

            String sql = "select * from Users where  userID = ? and password = ?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, us);
            ps.setString(2, pass);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                u = new User(rs.getString("userID"), rs.getString("fullName"), rs.getString("roleID"), rs.getString("password"));

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return u;
    }

    public User checkUserID(String us) {

        User u = null;

        try {

            String sql = "select * from Users where userID = ?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, us);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                u = new User(rs.getString("userID"), rs.getString("fullName"), rs.getString("roleID"), rs.getString("password"));

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return u;
    }

    public User checkPassword(String pass) {

        User u = null;

        try {

            String sql = "select * from Users where password = ?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, pass);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                u = new User(rs.getString("userID"), rs.getString("fullName"), rs.getString("roleID"), rs.getString("password"));

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return u;
    }

}
