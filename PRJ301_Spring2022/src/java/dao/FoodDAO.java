/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Food;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tuan anh
 */
public class FoodDAO {

    private Connection con;

    public FoodDAO(Connection con) {
        this.con = con;
    }

    public List<Food> searchFoodByName(String name) {

        List<Food> listF = new ArrayList<>();

        try {

            String sql = "select * from Foods where status = 1 and name like ?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, "%" + name + "%");

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Food f = new Food(rs.getString("id"), rs.getString("name"), rs.getString("description"), rs.getDouble("price"), rs.getInt("cookingTime"), rs.getBoolean("status"));

                listF.add(f);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listF;
    }

    public boolean delete(String fid) {

        boolean f = false;

        try {

            String sql = "update Foods set status = 0 where id = ?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, fid);

            ps.executeUpdate();

            f = true;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return f;
    }

}
