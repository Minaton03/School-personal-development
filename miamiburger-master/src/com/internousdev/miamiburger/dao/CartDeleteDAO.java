package com.internousdev.miamiburger.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.internousdev.miamiburger.util.DBConnector;

public class CartDeleteDAO {


	public int deleteCart(String user_id, String temp_user_id ,List<Integer> cartId) {
		Connection con = null;
		DBConnector db = new DBConnector();

		con = db.getConnection();

		int check = 0;

		String sql = "DELETE FROM cart_info WHERE (user_id=? OR temp_user_id=?) AND id=?";


		try{
			PreparedStatement ps = con.prepareStatement(sql);
			for(int CI : cartId){
			ps.setString(1, user_id);
			ps.setString(2, temp_user_id);
			ps.setInt(3, CI);
			check = ps.executeUpdate();
			}
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
	public int deleteAllCart(String user_id, String temp_user_id ) {

		Connection con = null;
		DBConnector db = new DBConnector();

		con = db.getConnection();

		int check = 0;

		String sql = "DELETE FROM cart_info WHERE user_id=? OR temp_user_id=?";


		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, user_id);
			ps.setString(2, temp_user_id);
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
