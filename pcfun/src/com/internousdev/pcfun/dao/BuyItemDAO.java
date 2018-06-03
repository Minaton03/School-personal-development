package com.internousdev.pcfun.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.pcfun.dto.BuyItemDTO;
import com.internousdev.pcfun.util.DBConnector;
import com.sun.corba.se.pept.transport.Connection;

public class BuyItemDAO {
	public BuyItemDTO getBuyItemInfo(){
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		BuyItemDTO buyItemDTO = new BuyItemDTO();

		String sql="SELECT id,item_name,item_price FROM item_info_transaction";

		try{
			PreparedStatement preparedStatement=connection.preparedStatement(sql);

			if(ResultSet.next()){
				buyItemDTO.setId(resultSet.getInt ("id"));
				buyItemDTO.setItemName(resultSet.getString("item_name"));
				buyItemDTO.setItemPrice(resultSet.getString("item_price"));
			}
		}catch(Exception e){
			e.printStackTrace();
		}return buyItemDTO;
	}
}