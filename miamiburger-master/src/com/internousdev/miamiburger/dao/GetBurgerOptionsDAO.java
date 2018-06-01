package com.internousdev.miamiburger.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.miamiburger.dto.BurgerOptionsDTO;
import com.internousdev.miamiburger.util.DBConnector;

public class GetBurgerOptionsDAO {
	/*
	 * クリエイトバーガーに使用するオプション全てをデーターベースから取り出し、List<BurgerOptionsDTO>に格納し戻す。
	 */
	private List<BurgerOptionsDTO> dtoList = new ArrayList<>();

	public List<BurgerOptionsDTO> getAllBurgerOptions() {
		Connection con = null;
		DBConnector db = new DBConnector();
		con = db.getConnection();

		String sql = "SELECT * FROM burger_options";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				BurgerOptionsDTO dto = new BurgerOptionsDTO();
				dto.setId(rs.getInt("id"));
				dto.setOptionName(rs.getString("optionName"));
				dto.setOptionPrice(rs.getInt("optionPrice"));
				dto.setImgUrl(rs.getString("imgUrl"));
				dto.setComment(rs.getString("comment"));
				dtoList.add(dto);
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
		return dtoList;
	}

}
