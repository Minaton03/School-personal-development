package com.internousdev.miamiburger.action;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.miamiburger.dao.ChangePasswordCompleteDAO;
import com.internousdev.miamiburger.util.InputChecker;
import com.opensymphony.xwork2.ActionSupport;
public class ChangePasswordConfirmAction extends ActionSupport{

	private String userId;			//ユーザーID
	private String secretQuestion;	//秘密の質問
	private String secretAnswer;	//秘密の質問 答え
	private String password1;		//パスワード
	private String password2;		//パスワード 確認

	private String passCon1;            //パスワードを＊で暗号化
	private String passCon2;            //パスワードを＊で暗号化

	private String errorId = "";        //IDエラー
	private String errorPass = "";          //パスワードエラー
	private String errorRePass = "";          //確認用パスワードエラー
	private String errorQuestion;      //秘密の質問エラー
	private String errorAnswer = "";        //秘密の質問の回答エラー
	private String errorMessage="";

	int i;

	public List<String> ErrorUserIdList = new ArrayList<String>();
	public List<String> ErrorPasswordList1 = new ArrayList<String>();
	public List<String> ErrorReconfirmPassList = new ArrayList<String>();
	public List<String> ErrorAnswerList = new ArrayList<String>();


	public String execute(){

		String result = ERROR;
		InputChecker inp = new InputChecker();

		ErrorUserIdList = inp.doCheck("ユーザーID", userId, 1, 8, true, false, false, true, false,false,false);
		ErrorPasswordList1 = inp.doCheck("パスワード", password1, 1, 16, true, false, false, true, false,false,false);
		ErrorReconfirmPassList = inp.doCheck("確認用パスワード", password2, 1, 16, true, false, false, true, false,false,false);
		ErrorAnswerList = inp.doCheck("質問の答え", secretAnswer, 1, 10, true, true, true, true, true,true,true);

		if(
				ErrorUserIdList.size() == 0 &&
				ErrorReconfirmPassList.size() == 0 &&
				secretQuestion != null &&
				ErrorAnswerList.size() == 0
				){
			result = SUCCESS;
		}else{
			for(i=0;i < ErrorUserIdList.size();i++){
				errorId = errorId + ErrorUserIdList.get(i);
			}
			for(i=0;i < ErrorPasswordList1.size();i++){
				errorPass = errorPass + ErrorPasswordList1.get(i);
			}
			for(i=0;i < ErrorReconfirmPassList.size();i++){
				errorRePass = errorPass + ErrorReconfirmPassList.get(i);
			}
			for(i=0;i < ErrorAnswerList.size();i++){
				errorAnswer = errorAnswer + ErrorAnswerList.get(i);
			}

		}

		passCon1 = "";
		if(password1.length() > 0){
			for(int i = 0; i < password1.length(); i++){
				passCon1 += "*";
			}
		}

		passCon2 = "";
		if(password2.length() > 0){
			for(int i = 0; i < password2.length(); i++){
				passCon2 += "*";
			}
		}

		ChangePasswordCompleteDAO dao = new ChangePasswordCompleteDAO();
		boolean check = dao.passwordConfirm(userId, secretQuestion, secretAnswer);
System.out.println(check);
		if(!check){
			errorMessage += "ログインID、秘密の質問、または答えが違います。";
			result = ERROR;
		}

		if(!(password1.equals("") && password2.equals(""))){
		if(!(password1.equals(password2))){
				errorMessage += "入力されたパスワードが異なります";
				result = ERROR;
		}
		}


		return result;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getSecretQuestion() {
		return secretQuestion;
	}


	public void setSecretQuestion(String secretQuestion) {
		this.secretQuestion = secretQuestion;
	}


	public String getSecretAnswer() {
		return secretAnswer;
	}


	public void setSecretAnswer(String secretAnswer) {
		this.secretAnswer = secretAnswer;
	}


	public String getPassword1() {
		return password1;
	}


	public void setPassword1(String password1) {
		this.password1 = password1;
	}


	public String getPassword2() {
		return password2;
	}


	public void setPassword2(String password2) {
		this.password2 = password2;
	}


	public String getErrorId() {
		return errorId;
	}


	public void setErrorId(String errorId) {
		this.errorId = errorId;
	}


	public String getErrorPass() {
		return errorPass;
	}


	public void setErrorPass(String errorPass) {
		this.errorPass = errorPass;
	}


	public String getErrorQuestion() {
		return errorQuestion;
	}


	public void setErrorQuestion(String errorQuestion) {
		this.errorQuestion = errorQuestion;
	}


	public String getErrorAnswer() {
		return errorAnswer;
	}


	public void setErrorAnswer(String errorAnswer) {
		this.errorAnswer = errorAnswer;
	}


	public int getI() {
		return i;
	}


	public void setI(int i) {
		this.i = i;
	}


	public List<String> getErrorUserIdList() {
		return ErrorUserIdList;
	}


	public void setErrorUserIdList(List<String> errorUserIdList) {
		ErrorUserIdList = errorUserIdList;
	}


	public List<String> getErrorPasswordList1() {
		return ErrorPasswordList1;
	}


	public void setErrorPasswordList1(List<String> errorPasswordList1) {
		ErrorPasswordList1 = errorPasswordList1;
	}


	public List<String> getErrorReconfirmPassList() {
		return ErrorReconfirmPassList;
	}


	public void setErrorReconfirmPassList(List<String> errorReconfirmPassList) {
		ErrorReconfirmPassList = errorReconfirmPassList;
	}


	public List<String> getErrorAnswerList() {
		return ErrorAnswerList;
	}


	public void setErrorAnswerList(List<String> errorAnswerList) {
		ErrorAnswerList = errorAnswerList;
	}


	public String getErrorRePass() {
		return errorRePass;
	}


	public void setErrorRePass(String errorRePass) {
		this.errorRePass = errorRePass;
	}


	public String getPassCon1() {
		return passCon1;
	}


	public void setPassCon1(String passCon1) {
		this.passCon1 = passCon1;
	}


	public String getPassCon2() {
		return passCon2;
	}


	public void setPassCon2(String passCon2) {
		this.passCon2 = passCon2;
	}


	public String getErrorMessage() {
		return errorMessage;
	}


	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}



}
