package com.internousdev.miamiburger.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.miamiburger.dto.PurchaseHistoryDetailsDTO;
import com.internousdev.miamiburger.util.DBConnector;


public class PurchaseHistoryDetailsDAO {

	public PurchaseHistoryDetailsDTO getPurchaseHistoryDetails(int purchseHistoryId){
		System.out.println(purchseHistoryId);
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		PurchaseHistoryDetailsDTO purchaseHistoryDetailsDTO = new PurchaseHistoryDetailsDTO();

			String sql ="SELECT pi.product_name, pi.product_name_kana, pi.price, phi.product_count, pi.image_file_path, pi.image_file_name, pi.release_date, pi.product_id, pi.category_id FROM product_info pi LEFT JOIN purchase_history_info phi ON pi.product_id = phi.product_id WHERE phi.id = ? ";
		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1,purchseHistoryId );
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()){
				purchaseHistoryDetailsDTO.setProductName(resultSet.getString("product_name"));
				purchaseHistoryDetailsDTO.setProductNameKana(resultSet.getString("product_name_kana"));
				purchaseHistoryDetailsDTO.setPrice(resultSet.getInt("price"));
				purchaseHistoryDetailsDTO.setProductCount(resultSet.getInt("phi.product_count"));
				purchaseHistoryDetailsDTO.setImageFilePath(resultSet.getString("image_file_path"));
				purchaseHistoryDetailsDTO.setImageFileName(resultSet.getString("image_file_name"));
				purchaseHistoryDetailsDTO.setReleaseDate(resultSet.getString("release_date").substring(0, 10));
				purchaseHistoryDetailsDTO.setProductId(resultSet.getInt("product_id"));
				purchaseHistoryDetailsDTO.setProductCategory(resultSet.getInt("category_id"));
			}
			}catch(SQLException e){
				e.printStackTrace();
			}finally{
				try{
					connection.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
		}
		return purchaseHistoryDetailsDTO;
	}
}
