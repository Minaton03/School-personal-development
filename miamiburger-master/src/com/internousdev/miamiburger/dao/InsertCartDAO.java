package com.internousdev.miamiburger.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.miamiburger.util.DBConnector;
import com.internousdev.miamiburger.util.DateUtil;

public class InsertCartDAO {

	/*
	 * cart_infoテーブルに情報を格納するメソッド
	 * user_idはゲストユーザーの場合はnullを、ログインユーザーの場合はuser_idを入力してください。
	 * temp_user_idはゲストユーザー、ログインユーザー関係なく入力してください。
	 * priceは商品の価格×個数の合計金額を入力してください。
	 */
	public int insertCart(String user_id, String temp_user_id, int product_id, int product_count, int price) {
		boolean userIdExist = false;
		DateUtil date = new DateUtil();
		int check = 0;

		Connection con = null;
		DBConnector db = new DBConnector();
		con = db.getConnection();

		String sql = "INSERT INTO cart_info (product_id,product_count,price,regist_date,temp_user_id";
		// ゲストユーザーかログインユーザーか判別しSQL文を操作する。
		if (user_id != null) {
			sql += ",user_id";
			userIdExist = true;
		}
		sql += ") VALUES (?,?,?,?,?";
		if (userIdExist) {
			sql += ",?";
		}
		sql += ")";
		
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, product_id);
			ps.setInt(2, product_count);
			ps.setInt(3, price);
			ps.setString(4, date.getDate());
			ps.setString(5, temp_user_id);
			if(userIdExist){
				ps.setString(6, user_id);
			}
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
