package com.internousdev.miamiburger.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.miamiburger.dao.ProductInfoDAO;
import com.internousdev.miamiburger.dto.ProductInfoDTO;
import com.internousdev.miamiburger.util.PageNation;
import com.opensymphony.xwork2.ActionSupport;

public class ProductInfoAction extends ActionSupport implements SessionAware {
	public Map<String, Object> session;

	// カテゴリID(初期値0で全検索)
	private int categoryId = 0;

	// 検索ワード(初期値空白)
	private String search = "";

	// エラーメッセージ
	private String errorMessage;

	// 商品情報取得DAO
	private ProductInfoDAO productInfoDAO = new ProductInfoDAO();

	// 商品情報をリストに格納
	public ArrayList<ProductInfoDTO> productInfoList = new ArrayList<ProductInfoDTO>();

	// 商品情報を9個ずつ格納
	private ArrayList<ArrayList<ProductInfoDTO>> mainList = new ArrayList<>();

	// ページング関連
	public int pageSelect;
	private List<Integer> pageList = new ArrayList<>();

	// 以下実行メソッド
	public String execute() throws SQLException {

		// productInfoList = productInfoDAO.getProductListInfo(categoryId,
		// search);

		// 検索結果（カテゴリーなし(=0)のときとそうでない場合で呼び出すメソッドを変える）
		if (categoryId == 0) {
			productInfoList = productInfoDAO.getProductListInfoAll(search);
		} else {
			productInfoList = productInfoDAO.getProductListInfo(categoryId, search);
		}

		if (productInfoList.size() == 0) {
			errorMessage = "検索結果がありません";
			session.put("productInfoList", productInfoList);
		} else {
			session.put("productInfoList", productInfoList);
		}

		// productListを9個づつ格納
		PageNation change = new PageNation();
		mainList = change.pageNation(productInfoList);

		for (int i = 0; i < mainList.size(); i++) {
			pageList.add(i + 1);
		}
		for (int i = 0; i < mainList.size(); i++) {
			if (i == pageSelect) {
				productInfoList = mainList.get(i);
				break;
			}
		}

		// イテレーター
		Iterator<ProductInfoDTO> iterator = productInfoList.iterator();
		if (!(iterator.hasNext())) {
			productInfoList = null;
		}
		
		session.put("categoryId", categoryId);
		session.put("search", search);

		return SUCCESS;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public ProductInfoDAO getProductInfoDAO() {
		return productInfoDAO;
	}

	public void setProductInfoDAO(ProductInfoDAO productInfoDAO) {
		this.productInfoDAO = productInfoDAO;
	}

	public ArrayList<ProductInfoDTO> getProductInfoList() {
		return productInfoList;
	}

	public void setProductInfoList(ArrayList<ProductInfoDTO> productInfoList) {
		this.productInfoList = productInfoList;
	}

	public ArrayList<ArrayList<ProductInfoDTO>> getMainList() {
		return mainList;
	}

	public void setMainList(ArrayList<ArrayList<ProductInfoDTO>> mainList) {
		this.mainList = mainList;
	}

	public List<Integer> getPageList() {
		return pageList;
	}

	public void setPageList(List<Integer> pageList) {
		this.pageList = pageList;
	}

	public Map<String, Object> getSession() {
		return this.session;
	}

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	public int getPageSelect() {
		return pageSelect;
	}

	public void setPageSelect(int pageSelect) {
		this.pageSelect = pageSelect;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
