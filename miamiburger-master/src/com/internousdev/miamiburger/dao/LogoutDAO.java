package com.internousdev.miamiburger.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.miamiburger.util.DBConnector;

public class LogoutDAO {
	public int logout(String userId){
		int check = 0;
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		String sql = "UPDATE user_info SET logined = 0 WHERE user_id = ?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);

			check = ps.executeUpdate();

		}catch(SQLException e){
			e.printStackTrace();
		}
		try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return check;

	}
}
