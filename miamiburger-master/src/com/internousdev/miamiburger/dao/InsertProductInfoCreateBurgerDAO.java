package com.internousdev.miamiburger.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.miamiburger.util.DBConnector;
import com.internousdev.miamiburger.util.DateUtil;

public class InsertProductInfoCreateBurgerDAO {
	DBConnector db = new DBConnector();
	Connection con = db.getConnection();

	public int getMaxProductId() {
		int maxProductId = -1;

		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "SELECT MAX(product_id) AS id FROM product_info";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				maxProductId = rs.getInt("id");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return maxProductId;
	}

	public int insertProductInfo(int productId, String product_description, int category_id, int price, String image_file_path, String image_file_name) {

		int check = 0;
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "INSERT INTO product_info (product_id,product_name,product_name_kana,product_description,category_id,price,image_file_path,image_file_name,release_date,status,regist_date) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
		String productName ="クリエイトバーガー"+productId;
		DateUtil date = new DateUtil();
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, productId);
			ps.setString(2, productName);
			ps.setString(3, productName);
			ps.setString(4, product_description);
			ps.setInt(5, category_id);
			ps.setInt(6, price);
			ps.setString(7, image_file_path);
			ps.setString(8, image_file_name);
			ps.setString(9, date.getDate());
			ps.setInt(10,1);
			ps.setString(11,date.getDate());

			check = ps.executeUpdate();
		}catch (SQLException e){
			e.printStackTrace();
		}finally{
			if(con != null){
				try{
					con.close();
				}catch (SQLException e){
					e.printStackTrace();
				}
			}
		}
		return check;
	}

}
