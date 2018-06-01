package com.internousdev.miamiburger.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.miamiburger.util.DBConnector;

public class PurchaseHistryDeleteDAO {

	public int deletePurchaseHistory(String userId){
		// String userId = session.get("mypageDTO?").toString();

		int check = 0;
		Connection connection = null;
		DBConnector dbConnector = new DBConnector();
		connection = dbConnector.getConnection();


		String sql = "DELETE FROM purchase_history_info WHERE user_id = ?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, userId);
			check = preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try{
			connection.close();
			}catch(SQLException e){
				e.printStackTrace();
			}

		}
		return check;
	}
}
