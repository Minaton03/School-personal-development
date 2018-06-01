package com.internousdev.miamiburger.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.miamiburger.dao.CartDeleteDAO;
import com.internousdev.miamiburger.dao.InsertPurchaseHistoryDAO;
import com.internousdev.miamiburger.dto.CartProductInfoDTO;
import com.internousdev.miamiburger.dto.UserInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

/*
 * kessaiDTOListの内容をpurchase_history_infoテーブルへ入力する。
 * ログインユーザーのcart_infoの内容を削除する。
 */
public class SettlementCompleteAction extends ActionSupport implements SessionAware {

	Map<String,Object> session;
	
	private String eachSelectAddress;

	@SuppressWarnings("unchecked")
	public String execute(){
		int check = 0;
		
		InsertPurchaseHistoryDAO insertPurchaseHistoryDAO = new InsertPurchaseHistoryDAO();
		CartDeleteDAO cartDeleteDAO = new CartDeleteDAO();
		
		List<CartProductInfoDTO> cartDTOList = new ArrayList<>();
		if(session.containsKey("cartList")){
			cartDTOList = (List<CartProductInfoDTO>) session.get("cartList");
	
			UserInfoDTO loginDTO = (UserInfoDTO) session.get("userInfoDTO");
	
			for(int i = 0; i < cartDTOList.size(); i++){
				check = insertPurchaseHistoryDAO.insertPurchaseHistory(loginDTO.getUserId(), cartDTOList.get(i).getProductId(), cartDTOList.get(i).getProductCount(), cartDTOList.get(i).getTotalPrice());
				if(check == 0){
					return ERROR;
				}
			}
		
			check = cartDeleteDAO.deleteAllCart(loginDTO.getUserId(), "");
			if(check == 0){
				return ERROR;
			}
		}
		session.remove("cartList");

		return SUCCESS;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getEachSelectAddress() {
		return eachSelectAddress;
	}

	public void setEachSelectAddress(String eachSelectAddress) {
		this.eachSelectAddress = eachSelectAddress;
	}
	

}
