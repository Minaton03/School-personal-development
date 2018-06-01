package com.internousdev.miamiburger.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.miamiburger.dto.ProductInfoDTO;
import com.internousdev.miamiburger.util.DBConnector;

public class ProductInfoDescriptionDAO {

	private ProductInfoDTO productInfoDTO = new ProductInfoDTO();

	/**
	 * 商品情報取得メソッド
	 *
	 * @param productId
	 * @return ProductInfoDTO
	 */
	public ProductInfoDTO getProductDescription(int productId) {

		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();

		String sql = "SELECT * FROM product_info where product_id = ?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, productId);

			ResultSet resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				productInfoDTO.setProductName(resultSet.getString("product_name"));
				productInfoDTO.setProductNameKana(resultSet.getString("product_name_kana"));
				productInfoDTO.setProductDescription(resultSet.getString("product_description"));
				productInfoDTO.setCategoryId(resultSet.getInt("category_id"));
				productInfoDTO.setPrice(resultSet.getInt("price"));
				productInfoDTO.setImageFilePath(resultSet.getString("image_file_path"));
				productInfoDTO.setImageFileName(resultSet.getString("image_file_name"));
				productInfoDTO.setReleaseDate(resultSet.getString("release_date"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return productInfoDTO;
	}

	// おすすめ商品リスト
	public ArrayList<ProductInfoDTO> getSugestProductInfo(int category_id, int product_id) throws SQLException {
		ArrayList<ProductInfoDTO> sugestList = new ArrayList<ProductInfoDTO>();

		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();

		String sql = "SELECT * FROM product_info WHERE category_id=? AND product_id NOT IN(?) ORDER BY RAND() LIMIT 3 ";

		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setInt(1, category_id);
			statement.setInt(2, product_id);

			ResultSet resultSet = statement.executeQuery();

			while (resultSet.next()) {

				ProductInfoDTO dto = new ProductInfoDTO();

				dto.setProductId(resultSet.getInt("product_id"));
				dto.setProductName(resultSet.getString("product_name"));
				dto.setProductNameKana(resultSet.getString("product_name_kana"));
				dto.setProductDescription(resultSet.getString("product_description"));
				dto.setCategoryId(resultSet.getInt("category_id"));
				dto.setPrice(resultSet.getInt("price"));
				dto.setImageFilePath(resultSet.getString("image_file_path"));
				dto.setImageFileName(resultSet.getString("image_file_name"));
				sugestList.add(dto);

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}
		return sugestList;
	}

}