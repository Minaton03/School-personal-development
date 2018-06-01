package com.internousdev.miamiburger.dto;

public class PurchaseListDTO {
	private String registDate;
	private int totalPrice;
	private int allPurchaseListNumber;


	public String getRegistDate() {
		return registDate;
	}
	public void setRegistDate(String registDate) {
		this.registDate = registDate;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	public int getAllPurchaseListNumber() {
		return allPurchaseListNumber;
	}
	public void setAllPurchaseListNumber(int allPurchaseListNumber) {
		this.allPurchaseListNumber = allPurchaseListNumber;
	}




}
