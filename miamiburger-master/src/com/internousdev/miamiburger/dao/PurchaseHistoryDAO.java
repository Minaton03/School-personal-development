package com.internousdev.miamiburger.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.miamiburger.dto.PurchaseHistoryDTO;
import com.internousdev.miamiburger.util.DBConnector;

public class PurchaseHistoryDAO {

	private ArrayList<PurchaseHistoryDTO> purchaseList = new ArrayList<>();

	public ArrayList<PurchaseHistoryDTO> getPurchaseHistory(String userId){

		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();

		//商品履歴からユーザーが買ったものすべてを、買った順に並べる
		String sql = "SELECT * FROM purchase_history_info WHERE user_id = ? ORDER BY id DESC ";

		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, userId);
			ResultSet resultSet = preparedStatement.executeQuery();

			while(resultSet.next()){
				PurchaseHistoryDTO purchaseHistoryDTO = new PurchaseHistoryDTO();
				purchaseHistoryDTO.setPurchseHistoryId(resultSet.getInt("id"));
				purchaseHistoryDTO.setUserId(resultSet.getString("user_id"));
				purchaseHistoryDTO.setProductId(resultSet.getInt("product_id"));
				purchaseHistoryDTO.setProductCount(resultSet.getInt("product_count"));
				purchaseHistoryDTO.setPrice(resultSet.getInt("price"));
				purchaseHistoryDTO.setRegistDate(resultSet.getString("regist_date"));
				purchaseList.add(purchaseHistoryDTO);
			}
	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		try{
		connection.close();
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	return purchaseList;
		}

	}
