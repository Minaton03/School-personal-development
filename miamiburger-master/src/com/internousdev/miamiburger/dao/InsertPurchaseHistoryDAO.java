package com.internousdev.miamiburger.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.miamiburger.util.DBConnector;
import com.internousdev.miamiburger.util.DateUtil;

public class InsertPurchaseHistoryDAO {
	
	public int insertPurchaseHistory(String user_id,int product_id,int product_count,int price){
		int check = 0;
		Connection con = null;
		DBConnector db = new DBConnector();
		con = db.getConnection();
		
		String sql = "INSERT INTO purchase_history_info (user_id,product_id,product_count,price,regist_date) VALUES (?,?,?,?,?)";
		DateUtil date = new DateUtil();
		
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, user_id);
			ps.setInt(2,product_id);
			ps.setInt(3,product_count);
			ps.setInt(4, price);
			ps.setString(5, date.getDate());
			check = ps.executeUpdate();
		}catch (SQLException e){
			e.printStackTrace();
		}finally{
			if(con != null){
				try{
					con.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
		}
		return check;
	}

}
