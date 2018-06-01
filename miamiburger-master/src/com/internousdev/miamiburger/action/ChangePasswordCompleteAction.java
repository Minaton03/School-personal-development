package com.internousdev.miamiburger.action;

import java.sql.SQLException;

import com.internousdev.miamiburger.dao.ChangePasswordCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;
public class ChangePasswordCompleteAction extends ActionSupport{

	private String userId;			//ユーザーID
	private String secretQuestion;	//秘密の質問
	private String secretAnswer;	//秘密の質問 答え
	private String password1;		//パスワード
	private String password2;		//パスワード 確認
	private String errorMessage;

	public String execute() throws SQLException{

		String result = ERROR;
		ChangePasswordCompleteDAO dao = new ChangePasswordCompleteDAO();
		int check = 0;
		check = dao.ChangePassword(password1, userId);
		if(check > 0){

		result = SUCCESS;
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
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}


}
