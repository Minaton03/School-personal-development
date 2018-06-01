package com.internousdev.miamiburger.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.internousdev.miamiburger.util.DBConnector;
import com.internousdev.miamiburger.util.DateUtil;

public class InsertCreateBurgerDAO {

	public int insertCreateBurger(String user_id, int price, List<Integer> selectOptionIdList) {
		DateUtil date = new DateUtil();
		int check = 0;

		Connection con = null;
		DBConnector db = new DBConnector();
		con = db.getConnection();

		// selectOptionIdListに格納されているoptionに対応するようSQL文を生成する。
		String sql = "INSERT INTO create_burger (createUser_id,price,regist_date";
		String values = "";
		for (int i = 1; i < selectOptionIdList.size() + 1; i++) {
			sql += ",option" + i;
			values += ",?";
		}
		;
		sql += ") VALUES (?,?,?";
		sql += values + ")";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, user_id);
			ps.setInt(2, price);
			ps.setString(3, date.getDate());
			// selectOptionIdListに格納されている値をSQL文に格納していく
			for (int i = 0; i < selectOptionIdList.size(); i++) {
				ps.setInt(i + 4, selectOptionIdList.get(i));
			}

			check = ps.executeUpdate();

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
		return check;

	}

}
