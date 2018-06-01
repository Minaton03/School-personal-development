package com.internousdev.miamiburger.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.miamiburger.dto.DestinationInfoDTO;
import com.internousdev.miamiburger.util.DBConnector;

public class InsertDestinationInfoDAO {

	public int insertDestination(DestinationInfoDTO dto, String date) {
		Connection con = null;
		DBConnector db = new DBConnector();
		con = db.getConnection();
		int check = 0;

		String sql = "INSERT INTO destination_info (user_id,family_name,first_name,family_name_kana,first_name_kana,email,tel_number,user_address,regist_date) VALUES(?,?,?,?,?,?,?,?,?)";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, dto.getUserId());
			ps.setString(2, dto.getFamilyName());
			ps.setString(3, dto.getFirstName());
			ps.setString(4, dto.getFamilyNameKana());
			ps.setString(5, dto.getFirstNameKana());
			ps.setString(6, dto.getEmail());
			ps.setString(7, dto.getTelNumber());
			ps.setString(8, dto.getUserAddress());
			ps.setString(9, date);
			
			check = ps.executeUpdate();
		} catch (SQLException e) {
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
