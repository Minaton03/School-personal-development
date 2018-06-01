package com.internousdev.miamiburger.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.miamiburger.dto.DestinationInfoDTO;
import com.internousdev.miamiburger.util.DBConnector;

public class GetAddressDAO {

	public List<DestinationInfoDTO> getAddress(String userId) {
		DestinationInfoDTO dto;
		List<DestinationInfoDTO> destinationDTOList = new ArrayList<>();
		Connection con = null;
		DBConnector db = new DBConnector();
		con = db.getConnection();

		String sql = "SELECT * FROM destination_info WHERE user_id = ?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				dto = new DestinationInfoDTO();
				dto.setUserId(rs.getString("user_id"));
				dto.setFamilyName(rs.getString("family_name"));
				dto.setFirstName(rs.getString("first_name"));
				dto.setFamilyNameKana(rs.getString("family_name_kana"));
				dto.setFirstNameKana(rs.getString("first_name_kana"));
				dto.setEmail(rs.getString("email"));
				dto.setTelNumber(rs.getString("tel_number"));
				dto.setUserAddress(rs.getString("user_address"));

				destinationDTOList.add(dto);
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

		return destinationDTOList;
	}

}
