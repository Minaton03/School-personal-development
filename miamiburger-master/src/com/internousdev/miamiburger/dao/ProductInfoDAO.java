package com.internousdev.miamiburger.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.miamiburger.dto.ProductInfoDTO;
import com.internousdev.miamiburger.util.DBConnector;

public class ProductInfoDAO {


	/**
	 * 商品一覧取得
	 *
	 * @return ArrayList<ProductInfoDTO>
	 * @throws SQLException
	 */

	public ArrayList<ProductInfoDTO> getProductListInfoAll(String search) {
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();

		ArrayList<ProductInfoDTO> productInfoDTOList = new ArrayList<ProductInfoDTO>();

		String sql = "SELECT * FROM product_info WHERE ( product_name LIKE '%" + search
				+ "%' OR product_name_kana LIKE '%" + search + "%' ) AND category_id != 5";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				ProductInfoDTO dto = new ProductInfoDTO();
				dto.setId(resultSet.getInt("id"));
				dto.setProductId(resultSet.getInt("product_id"));
				dto.setProductName(resultSet.getString("product_name"));
				dto.setProductNameKana(resultSet.getString("product_name_kana"));
				dto.setProductDescription(resultSet.getString("product_description"));
				dto.setCategoryId(resultSet.getInt("category_id"));
				dto.setPrice(resultSet.getInt("price"));
				dto.setImageFilePath(resultSet.getString("image_file_path"));
				dto.setReleaseDate(resultSet.getString("release_date"));
				dto.setStatus(resultSet.getInt("status"));
				dto.setRegistDate(resultSet.getString("regist_date"));
				dto.setUpdateDate(resultSet.getString("update_date"));
				productInfoDTOList.add(dto);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		try{
			connection.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return productInfoDTOList;
	}

	public ArrayList<ProductInfoDTO> getProductListInfo(int categoryId, String search) throws SQLException {
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();

		ArrayList<ProductInfoDTO> productInfoDTOList = new ArrayList<ProductInfoDTO>();

		String sql = "SELECT * FROM product_info WHERE category_id = ? AND (product_name LIKE '%" + search
				+ "%' OR product_name_kana LIKE '%" + search + "%' )";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, categoryId);

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				ProductInfoDTO dto = new ProductInfoDTO();
				dto.setId(resultSet.getInt("id"));
				dto.setProductId(resultSet.getInt("product_id"));
				dto.setProductName(resultSet.getString("product_name"));
				dto.setProductNameKana(resultSet.getString("product_name_kana"));
				dto.setProductDescription(resultSet.getString("product_description"));
				dto.setCategoryId(resultSet.getInt("category_id"));
				dto.setPrice(resultSet.getInt("price"));
				dto.setImageFilePath(resultSet.getString("image_file_path"));
				dto.setReleaseDate(resultSet.getString("release_date"));
				dto.setStatus(resultSet.getInt("status"));
				dto.setRegistDate(resultSet.getString("regist_date"));
				dto.setUpdateDate(resultSet.getString("update_date"));
				productInfoDTOList.add(dto);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}

		return productInfoDTOList;
	}

}
