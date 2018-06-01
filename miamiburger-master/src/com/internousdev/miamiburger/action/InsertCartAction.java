package com.internousdev.miamiburger.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.miamiburger.dao.InsertCartDAO;
import com.internousdev.miamiburger.dao.SelectCartInfoDAO;
import com.internousdev.miamiburger.dto.CartProductInfoDTO;
import com.internousdev.miamiburger.dto.UserInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class InsertCartAction extends ActionSupport implements SessionAware{

	public Map<String, Object> session;
	private int productId;
	private int price;
	private int productCount;
	private int totalPrice = 0;
	private List<CartProductInfoDTO> cartList = new ArrayList<>();

	public String execute(){
		String tempUserId = session.get("temp_user_id").toString();
		String userId = null;
		String result;

		if(session.containsKey("userInfoDTO")){
			UserInfoDTO loginDTO = (UserInfoDTO) session.get("userInfoDTO");
			userId = loginDTO.getUserId();
		}
		InsertCartDAO insertCartDAO = new InsertCartDAO();

		if(productCount < 6 && productCount>0){
		price = price*productCount;
//		cart_infoテーブルへの入力
		int check = insertCartDAO.insertCart(userId, tempUserId, productId, productCount, price);
		if(check == 0){
			result = ERROR;
		}

		session.put("userId", userId);

		SelectCartInfoDAO dao = new SelectCartInfoDAO();
//		カート情報の取得
		cartList = dao.selectCartInfo(userId, tempUserId);

//		カートの合計金額を算出
		for(int i = 0; i < cartList.size(); i++){
			totalPrice += cartList.get(i).getTotalPrice();
		}
		session.put("cartList", cartList);
		result = SUCCESS;

		}else{
			result = ERROR;
		}
		return result;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getProductCount() {
		return productCount;
	}

	public void setProductCount(int productCount) {
		this.productCount = productCount;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public List<CartProductInfoDTO> getCartList() {
		return cartList;
	}

	public void setCartList(List<CartProductInfoDTO> cartList) {
		this.cartList = cartList;
	}




}
