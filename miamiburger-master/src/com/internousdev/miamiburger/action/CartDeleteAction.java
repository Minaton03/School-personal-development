package com.internousdev.miamiburger.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.miamiburger.dao.CartDeleteDAO;
import com.internousdev.miamiburger.dao.SelectCartInfoDAO;
import com.internousdev.miamiburger.dto.CartProductInfoDTO;
import com.internousdev.miamiburger.dto.UserInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class CartDeleteAction extends ActionSupport implements SessionAware {
	private List<Integer> cartId=null;
	private List<CartProductInfoDTO> cartList = new ArrayList<>();
	public Map<String, Object> session;
	String errorMes;
	private int totalPrice = 0;
 public String execute(){
	 String result=SUCCESS;
	 int check = 0;
	 String userId = null;
		if(session.containsKey("userInfoDTO")){
			UserInfoDTO loginDTO = (UserInfoDTO) session.get("userInfoDTO");
			userId = loginDTO.getUserId();
		}
	 String tempUserId = session.get("temp_user_id").toString();

	 //cartIdの中身が空の時はエラーメッセージを返す
	 if(!(cartId==null)){
		 CartDeleteDAO delete=new CartDeleteDAO();
		 check = delete.deleteCart(userId, tempUserId, cartId);
		 if(check == 0){
			 System.out.println("カートの消去に失敗しました");
			 result = ERROR;
		 }
	}else{
		errorMes = "【削除エラー】チェックボックスを一つ以上選択してください";
	}

	SelectCartInfoDAO dao = new SelectCartInfoDAO();
	cartList = dao.selectCartInfo(userId, tempUserId);

//		カートの合計金額を算出
	for(int i = 0; i < cartList.size(); i++){
		totalPrice += cartList.get(i).getTotalPrice();
	}

	session.put("cartList", cartList);


	 return result;
 }
public Map<String, Object> getSession() {
	return session;
}
public void setSession(Map<String, Object> session) {
	this.session = session;
}

public List<Integer> getCartId() {
	return cartId;
}
public void setCartId(List<Integer> cartId) {
	this.cartId = cartId;
}
public List<CartProductInfoDTO> getCartList() {
	return cartList;
}
public void setCartList(List<CartProductInfoDTO> cartList) {
	this.cartList = cartList;
}
public int getTotalPrice() {
	return totalPrice;
}
public void setTotalPrice(int totalPrice) {
	this.totalPrice = totalPrice;
}
public String getErrorMes() {
	return errorMes;
}
public void setErrorMes(String errorMes) {
	this.errorMes = errorMes;
}



}
