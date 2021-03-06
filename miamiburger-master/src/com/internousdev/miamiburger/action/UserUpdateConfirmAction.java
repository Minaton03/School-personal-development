package com.internousdev.miamiburger.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.miamiburger.dao.UserCreateConfirmDAO;
import com.internousdev.miamiburger.util.InputChecker;
import com.opensymphony.xwork2.ActionSupport;

public class UserUpdateConfirmAction extends ActionSupport implements SessionAware {
	// session情報
	public Map<String, Object> session;
	// 情報を受け取る為の変数の定義
	private String new_familyName;
	private String new_firstName;
	private String new_familyNameKana;
	private String new_firstNameKana;
	private int new_sex;
	private String new_email;
	private String new_secretQuestion;
	private String new_secretAnswer;
	// InputChecker用のリスト（InputCheckerからの戻り値を格納する）
	int i;

	private String errorName = ""; // 姓名エラー
	private String errorNameKana = ""; // 姓名（ひらがな）エラー
	private String errorEmail = ""; // メールアドレスエラー
	private String errorQuestion; // 秘密の質問エラー
	private String errorAnswer = ""; // 秘密の質問の回答エラー

	private InputChecker inputChecker = new InputChecker();
	private List<String> ErrorReconfirmPassList = new ArrayList<>();
	private List<String> ErrorFamilyNameList = new ArrayList<>();
	private List<String> ErrorFirstNameList = new ArrayList<>();
	private List<String> ErrorFamilyNameKanaList = new ArrayList<>();
	private List<String> ErrorFirstNameKanaList = new ArrayList<>();
	private List<String> ErrorEmailList = new ArrayList<>();
	private List<String> ErrorQuestionList = new ArrayList<>();
	private List<String> ErrorAnswerList = new ArrayList<>();
	// userIdの被り確認の為にuserIdを抽出するメソッドを持つuserCreateConfirmDAOのインスタンス生成
	private UserCreateConfirmDAO userCreateConfirmDAO = new UserCreateConfirmDAO();

	public String execute() throws SQLException {
		// デフォルトのresultはERRORを設定
		String result = ERROR;

		// 男性と女性の判別、文字列の挿入(既存)

		if((new_sex < 0)||(new_sex > 1)){
			return result;
		}

			try {
				switch (new_sex) {
				case 0:
					session.put("new_sex_Name", "男性");
					break;
				case 1:
					session.put("new_sex_Name", "女性");
					break;

				}
			} catch (Exception e) {
				e.printStackTrace();
			}


		// 変更予定のユーザー情報を格納する
		session.put("new_familyName", new_familyName);
		session.put("new_firstName", new_firstName);
		session.put("new_familyNameKana", new_familyNameKana);
		session.put("new_firstNameKana", new_firstNameKana);
		session.put("new_sex", new_sex);
		session.put("new_email", new_email);
		session.put("new_secretQuestion", new_secretQuestion);
		session.put("new_secretAnswer", new_secretAnswer);

		// InputCheckerのメソッドを使用し記述内容をチェックする。
		ErrorFamilyNameList = inputChecker.doCheck("姓", new_familyName, 1, 16, true, true, true, false, false, false,
				false);
		ErrorFirstNameList = inputChecker.doCheck("名", new_firstName, 1, 16, true, true, true, false, false, false,
				false);
		ErrorFamilyNameKanaList = inputChecker.doCheck("姓ふりがな", new_familyNameKana, 1, 16, false, false, true, false,
				false, false, false);
		ErrorFirstNameKanaList = inputChecker.doCheck("名ふりがな", new_firstNameKana, 1, 16, false, false, true, false,
				false, false, false);
		ErrorEmailList = inputChecker.doCheck("メールアドレス", new_email, 14, 32, true, false, false, true, true, false,
				false);
		ErrorAnswerList = inputChecker.doCheck("秘密の質問", new_secretAnswer, 1, 16, true, true, true, true, true, true,
				true);
		// もし記載内容に問題がなければSUCCESSを挿入する
		if (ErrorFamilyNameList.size() == 0 && ErrorFirstNameList.size() == 0 && ErrorFamilyNameKanaList.size() == 0
				&& ErrorFirstNameKanaList.size() == 0 && ErrorEmailList.size() == 0 && ErrorAnswerList.size() == 0) {
			result = SUCCESS;

			// 記載内容に不備があれば、各項目ごとにエラーメッセージを挿入する。
		} else {
			for (i = 0; i < ErrorFamilyNameList.size(); i++) {
				errorName = errorName + ErrorFamilyNameList.get(i);
			}
			for (i = 0; i < ErrorFirstNameList.size(); i++) {
				errorName = errorName + ErrorFirstNameList.get(i);
			}
			for (i = 0; i < ErrorFamilyNameKanaList.size(); i++) {
				errorNameKana = errorNameKana + ErrorFamilyNameKanaList.get(i);
			}
			for (i = 0; i < ErrorFirstNameKanaList.size(); i++) {
				errorNameKana = errorNameKana + ErrorFirstNameKanaList.get(i);
			}
			for (i = 0; i < ErrorEmailList.size(); i++) {
				errorEmail = errorEmail + ErrorEmailList.get(i);
			}
			for (i = 0; i < ErrorAnswerList.size(); i++) {
				errorAnswer = errorAnswer + ErrorAnswerList.get(i);
			}
		}
		return result;
	}

	// 以下、getter/setter
	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getNew_familyName() {
		return new_familyName;
	}

	public void setNew_familyName(String new_familyName) {
		this.new_familyName = new_familyName;
	}

	public String getNew_firstName() {
		return new_firstName;
	}

	public void setNew_firstName(String new_firstName) {
		this.new_firstName = new_firstName;
	}

	public String getNew_familyNameKana() {
		return new_familyNameKana;
	}

	public void setNew_familyNameKana(String new_familyNameKana) {
		this.new_familyNameKana = new_familyNameKana;
	}

	public String getNew_firstNameKana() {
		return new_firstNameKana;
	}

	public void setNew_firstNameKana(String new_firstNameKana) {
		this.new_firstNameKana = new_firstNameKana;
	}

	public int getNew_sex() {
		return new_sex;
	}

	public void setNew_sex(int new_sex) {
		this.new_sex = new_sex;
	}

	public String getNew_email() {
		return new_email;
	}

	public void setNew_email(String new_email) {
		this.new_email = new_email;
	}

	public String getNew_secretQuestion() {
		return new_secretQuestion;
	}

	public void setNew_secretQuestion(String new_secretQuestion) {
		this.new_secretQuestion = new_secretQuestion;
	}

	public String getNew_secretAnswer() {
		return new_secretAnswer;
	}

	public void setNew_secretAnswer(String new_secretAnswer) {
		this.new_secretAnswer = new_secretAnswer;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public String getErrorName() {
		return errorName;
	}

	public void setErrorName(String errorName) {
		this.errorName = errorName;
	}

	public String getErrorNameKana() {
		return errorNameKana;
	}

	public void setErrorNameKana(String errorNameKana) {
		this.errorNameKana = errorNameKana;
	}

	public String getErrorEmail() {
		return errorEmail;
	}

	public void setErrorEmail(String errorEmail) {
		this.errorEmail = errorEmail;
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

	public InputChecker getInputChecker() {
		return inputChecker;
	}

	public void setInputChecker(InputChecker inputChecker) {
		this.inputChecker = inputChecker;
	}

	public List<String> getErrorReconfirmPassList() {
		return ErrorReconfirmPassList;
	}

	public void setErrorReconfirmPassList(List<String> errorReconfirmPassList) {
		ErrorReconfirmPassList = errorReconfirmPassList;
	}

	public List<String> getErrorFamilyNameList() {
		return ErrorFamilyNameList;
	}

	public void setErrorFamilyNameList(List<String> errorFamilyNameList) {
		ErrorFamilyNameList = errorFamilyNameList;
	}

	public List<String> getErrorFirstNameList() {
		return ErrorFirstNameList;
	}

	public void setErrorFirstNameList(List<String> errorFirstNameList) {
		ErrorFirstNameList = errorFirstNameList;
	}

	public List<String> getErrorFamilyNameKanaList() {
		return ErrorFamilyNameKanaList;
	}

	public void setErrorFamilyNameKanaList(List<String> errorFamilyNameKanaList) {
		ErrorFamilyNameKanaList = errorFamilyNameKanaList;
	}

	public List<String> getErrorFirstNameKanaList() {
		return ErrorFirstNameKanaList;
	}

	public void setErrorFirstNameKanaList(List<String> errorFirstNameKanaList) {
		ErrorFirstNameKanaList = errorFirstNameKanaList;
	}

	public List<String> getErrorEmailList() {
		return ErrorEmailList;
	}

	public void setErrorEmailList(List<String> errorEmailList) {
		ErrorEmailList = errorEmailList;
	}

	public List<String> getErrorQuestionList() {
		return ErrorQuestionList;
	}

	public void setErrorQuestionList(List<String> errorQuestionList) {
		ErrorQuestionList = errorQuestionList;
	}

	public List<String> getErrorAnswerList() {
		return ErrorAnswerList;
	}

	public void setErrorAnswerList(List<String> errorAnswerList) {
		ErrorAnswerList = errorAnswerList;
	}

	public UserCreateConfirmDAO getUserCreateConfirmDAO() {
		return userCreateConfirmDAO;
	}

	public void setUserCreateConfirmDAO(UserCreateConfirmDAO userCreateConfirmDAO) {
		this.userCreateConfirmDAO = userCreateConfirmDAO;
	}

}