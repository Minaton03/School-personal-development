package com.internousdev.miamiburger.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.miamiburger.dto.CartProductInfoDTO;
import com.internousdev.miamiburger.util.DBConnector;

public class SelectCartInfoDAO {
	
	public List<CartProductInfoDTO> selectCartInfo(String userId, String tempUserId){
		CartProductInfoDTO dto;
		List<CartProductInfoDTO> dtoList = new ArrayList<>();
		Connection con = null;
		DBConnector db = new DBConnector();
		con = db.getConnection();
		
		String sql = "SELECT ci.id AS cartId, ci.product_id AS productId, ci.product_count AS productCount, ci.price AS totalPrice, pi.product_name AS productName, pi.product_name_kana AS productNameKana, pi.product_description AS productDescription, pi.category_id AS categoryId, pi.price AS priceProduct, pi.image_file_path, pi.image_file_name ,pi.release_date FROM cart_info ci LEFT JOIN product_info pi ON ci.product_id = pi.product_id WHERE ci.user_id=? OR ci.temp_user_id=?";
		
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,userId);
			ps.setString(2,tempUserId);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()){
				dto = new CartProductInfoDTO();
				dto.setCartId(rs.getInt("cartId"));
				dto.setProductId(rs.getInt("productId"));
				dto.setProductCount(rs.getInt("productCount"));
				dto.setTotalPrice(rs.getInt("totalPrice"));
				dto.setProductName(rs.getString("productName"));
				dto.setProductNameKana(rs.getString("productNameKana"));
				dto.setProductDescription(rs.getString("productDescription"));
				dto.setCategoryId(rs.getInt("categoryId"));
				dto.setPrice(rs.getInt("priceProduct"));
				dto.setImageFilePath(rs.getString("image_file_path"));
				dto.setImageFileName(rs.getString("image_file_name"));
				dto.setReleaseDate(rs.getString("release_date"));
				dtoList.add(dto);
			}
			
		}catch (SQLException e){
			e.printStackTrace();
		}finally{
			if(con != null){
				try{
					con.close();
				}catch (SQLException e){
					e.printStackTrace();
				}
			}
		}
		return dtoList;
	}

}
