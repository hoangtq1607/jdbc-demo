package com.vti.repository;

import com.vti.config.ConnectionProvider;
import com.vti.entity.HangHoa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HangHoaRepository {

    public static void updateHangHoa(int id, String name) {

    }

    public static boolean deleteHangHoa(int id) {

        String sql = "DELETE FROM hang_hoa WHERE id = " + id;

        try {
            Connection connection = ConnectionProvider.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            int rows = statement.executeUpdate();
            if (rows > 0) {
                return true;
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
        return false;
    }

    public static List<HangHoa> getAllHangHoa() {

        List<HangHoa> hangHoaList = new ArrayList<>();
        try {
            Connection connection = ConnectionProvider.getConnection();
            String sql = "select * from hang_hoa limit 5";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {

                int id = resultSet.getInt("id");
                String maHang = resultSet.getString("ma_hang");
                String tenHang = resultSet.getString("ten_hang");
                String mota = resultSet.getString("mota");

                HangHoa hangHoa = new HangHoa(id, maHang, tenHang, mota);
                hangHoaList.add(hangHoa);

            }

        } catch (SQLException exception) {
            exception.printStackTrace();
        }

        return hangHoaList;
    }

}
