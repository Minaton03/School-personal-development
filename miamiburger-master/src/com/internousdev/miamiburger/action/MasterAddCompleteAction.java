package com.internousdev.miamiburger.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.miamiburger.dao.MasterAddCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class MasterAddCompleteAction extends ActionSupport implements SessionAware{

	//session情報
		public Map<String, Object> session;

	public String execute() throws SQLException {
	//MasterAddCompleteDAOのインスタンス化
		MasterAddCompleteDAO dao = new MasterAddCompleteDAO();

		int productId = dao.getMaxProductId() + 1 ;

		int check = dao.cerateProduct(
			productId,
			session.get("productName").toString(),
			session.get("productNameKana").toString(),
			session.get("productDescription").toString(),
			Integer.parseInt(session.get("categoryId").toString()),
			Integer.parseInt(session.get("price").toString()),
			session.get("releaseDate").toString(),
			Integer.parseInt(session.get("Status").toString()),
			session.get("image_file_path").toString());


			if(check > 0){
				session.remove("productName");
				session.remove("productNameKana");
				session.remove("productDescription");
				session.remove("categoryId");
				session.remove("price");
				session.remove("releaseDate");
				session.remove("Status");
				session.remove("image_file_path");
				session.remove("image_file_name");
				session.remove("image_flg");
				System.out.println("商品の追加を行いました。");
			}
	//result結果、SUCCESSを挿入する
		String result = SUCCESS;
		return result;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
