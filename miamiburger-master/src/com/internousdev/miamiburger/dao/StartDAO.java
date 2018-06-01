package com.internousdev.miamiburger.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.miamiburger.dto.MCategoryDTO;
import com.internousdev.miamiburger.util.DBConnector;

public class StartDAO {
	public ArrayList<MCategoryDTO> categoryInfo(){

		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		MCategoryDTO dto = new MCategoryDTO();
		ArrayList<MCategoryDTO> mCategoryDTOList = new ArrayList<MCategoryDTO>();

		String sql = "SELECT * FROM m_category";

		try {
			PreparedStatement ps =con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				dto = new MCategoryDTO();

				dto.setCategoryId(rs.getInt("category_id"));
				dto.setCategoryName(rs.getString("category_name"));

				System.out.println(rs.getInt("category_id"));

				mCategoryDTOList.add(dto);
			}
			}catch(SQLException e){
				e.printStackTrace();
			}
			try{
				con.close();
			}catch(SQLException e){

			}
			return mCategoryDTOList;
	}
}
