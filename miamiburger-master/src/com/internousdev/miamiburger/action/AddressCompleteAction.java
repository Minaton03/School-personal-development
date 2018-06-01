package com.internousdev.miamiburger.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.miamiburger.dao.InsertDestinationInfoDAO;
import com.internousdev.miamiburger.dto.DestinationInfoDTO;
import com.internousdev.miamiburger.util.DateUtil;
import com.opensymphony.xwork2.ActionSupport;

public class AddressCompleteAction extends ActionSupport implements SessionAware {

	public Map<String,Object> session;

	public String execute(){
		DestinationInfoDTO destinationInfoDTO = (DestinationInfoDTO) session.get("destinationInfoDTO");
		DateUtil date = new DateUtil();
		InsertDestinationInfoDAO dao = new InsertDestinationInfoDAO();

		int check = dao.insertDestination(destinationInfoDTO,date.getDate());
		if(check == 0){
			return ERROR;
		}
		
		session.remove("destinationInfoDTO");

		return SUCCESS;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


}
