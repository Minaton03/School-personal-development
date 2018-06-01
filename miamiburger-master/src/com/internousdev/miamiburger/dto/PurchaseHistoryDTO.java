package com.internousdev.miamiburger.dto;

public class PurchaseHistoryDTO {
	private String userId;				//ユーザーID
	private int productId;			//商品ID
	private int productCount;		//個数
	private int price;				//金額
	private int purchseHistoryId;
	private String registDate;			//登録日
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getProductCount() {
		return productCount;
	}
	public void setProductCount(int productCount) {
		this.productCount = productCount;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getRegistDate() {
		return registDate;
	}
	public void setRegistDate(String registDate) {
		this.registDate = registDate;
	}
	public int getPurchseHistoryId() {
		return purchseHistoryId;
	}
	public void setPurchseHistoryId(int purchseHistoryId) {
		this.purchseHistoryId = purchseHistoryId;
	}
	



}
