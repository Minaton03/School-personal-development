package com.internousdev.miamiburger.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.miamiburger.dto.BurgerOptionsDTO;
import com.opensymphony.xwork2.ActionSupport;

/*
 * 作成されたクリエイトバーガーのチェックと情報をsessionへ格納する。
 * optionは一つ以上含まれているか確認する。
 */
public class CreateBurgerConfirmAction extends ActionSupport implements SessionAware {

	public Map<String, Object> session;
	private int createPrice = 0;
	private int product_count;
	private int option1;
	private int option2;
	private int option3;
	private int option4;
	private int option5;
	private int option6;
	private int option7;
	private int option8;
	private int option9;
	private int option10;
	private List<Integer> selectOptionIdList = new ArrayList<>();

	private String errorMessage = null;

	@SuppressWarnings("unchecked")
	public String execute() {
		
		List<BurgerOptionsDTO> burgerOptionsDTOList = new ArrayList<>();
		burgerOptionsDTOList = (List<BurgerOptionsDTO>) session.get("burgerOptionsList");

		if((option1 > 0)&&((burgerOptionsDTOList.size()+1) > option1)){
			selectOptionIdList.add(option1);
		}else if(option1 == -1){
			errorMessage = "オプションが一つも選択されていません。";
			return ERROR;
		}else{
			errorMessage = "オプションが正しく選択されていません。";
			return ERROR;
		}
		
		if((option2 > 0)&&((burgerOptionsDTOList.size()+1) > option2) ){
			selectOptionIdList.add(option2);
		}else if(option2 == -1){
//			オプションなし
		}else{
			errorMessage = "オプションが正しく選択されていません。";
			return ERROR;
		}
		
		if((option3 > 0)&&((burgerOptionsDTOList.size()+1) > option3)){
			selectOptionIdList.add(option3);
		}else if(option3 == -1){
//			オプションなし
		}else{
			errorMessage = "オプションが正しく選択されていません。";
			return ERROR;
		}
		
		if((option4 > 0)&&((burgerOptionsDTOList.size()+1) > option4)){
			selectOptionIdList.add(option4);
		}else if(option4 == -1){
//			オプションなし
		}else{
			errorMessage = "オプションが正しく選択されていません。";
			return ERROR;
		}
		
		if((option5 > 0)&&((burgerOptionsDTOList.size()+1) > option5)){
			selectOptionIdList.add(option5);
		}else if(option5 == -1){
//			オプションなし
		}else{
			errorMessage = "オプションが正しく選択されていません。";
			return ERROR;
		}
		
		if((option6 > 0)&&((burgerOptionsDTOList.size()+1) > option6)){
			selectOptionIdList.add(option6);
		}else if(option6 == -1){
//			オプションなし
		}else{
			errorMessage = "オプションが正しく選択されていません。";
			return ERROR;
		}
		
		if((option7 > 0)&&((burgerOptionsDTOList.size()+1) > option7)){
			selectOptionIdList.add(option7);
		}else if(option7 == -1){
//			オプションなし
		}else{
			errorMessage = "オプションが正しく選択されていません。";
			return ERROR;
		}
		
		if((option8 > 0)&&((burgerOptionsDTOList.size()+1) > option8)){
			selectOptionIdList.add(option8);
		}else if(option8 == -1){
//			オプションなし
		}else{
			errorMessage = "オプションが正しく選択されていません。";
			return ERROR;
		}
		
		if((option9 > 0)&&((burgerOptionsDTOList.size()+1) > option9)){
			selectOptionIdList.add(option9);
		}else if(option9 == -1){
//			オプションなし
		}else{
			errorMessage = "オプションが正しく選択されていません。";
			return ERROR;
		}
		
		if((option10 > 0)&&((burgerOptionsDTOList.size()+1) > option10)){
			selectOptionIdList.add(option10);
		}else if(option10 == -1){
//			オプションなし
		}else{
			errorMessage = "オプションが正しく選択されていません。";
			return ERROR;
		}
		
		//合計金額の計算--------------------------------
			
		for(int i = 0; i<selectOptionIdList.size(); i++){
			createPrice += burgerOptionsDTOList.get(selectOptionIdList.get(i)-1).getOptionPrice() ;
		}
		//-------------------------------------------------
		//デバックモードで個数をマイナスにされたときの対応
		if(product_count < 1){
			product_count = 1;
		}
		
		
		session.put("createPrice", createPrice);
		session.put("createProduct_count", product_count);
		session.put("selectOptionIdList", selectOptionIdList);

		return SUCCESS;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public int getCreatePrice() {
		return createPrice;
	}

	public void setCreatePrice(int createPrice) {
		this.createPrice = createPrice;
	}

	public int getProduct_count() {
		return product_count;
	}

	public void setProduct_count(int product_count) {
		this.product_count = product_count;
	}

	public int getOption1() {
		return option1;
	}

	public void setOption1(int option1) {
		this.option1 = option1;
	}

	public int getOption2() {
		return option2;
	}

	public void setOption2(int option2) {
		this.option2 = option2;
	}

	public int getOption3() {
		return option3;
	}

	public void setOption3(int option3) {
		this.option3 = option3;
	}

	public int getOption4() {
		return option4;
	}

	public void setOption4(int option4) {
		this.option4 = option4;
	}

	public int getOption5() {
		return option5;
	}

	public void setOption5(int option5) {
		this.option5 = option5;
	}

	public int getOption6() {
		return option6;
	}

	public void setOption6(int option6) {
		this.option6 = option6;
	}

	public int getOption7() {
		return option7;
	}

	public void setOption7(int option7) {
		this.option7 = option7;
	}

	public int getOption8() {
		return option8;
	}

	public void setOption8(int option8) {
		this.option8 = option8;
	}

	public int getOption9() {
		return option9;
	}

	public void setOption9(int option9) {
		this.option9 = option9;
	}

	public int getOption10() {
		return option10;
	}

	public void setOption10(int option10) {
		this.option10 = option10;
	}

	public List<Integer> getSelectOptionIdList() {
		return selectOptionIdList;
	}

	public void setSelectOptionIdList(List<Integer> selectOptionIdList) {
		this.selectOptionIdList = selectOptionIdList;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}


}
