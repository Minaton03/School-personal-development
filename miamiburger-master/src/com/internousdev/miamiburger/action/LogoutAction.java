package com.internousdev.miamiburger.action;

import java.util.ArrayList;
import java.util.Map;
import java.util.Random;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.miamiburger.dao.LogoutDAO;
import com.internousdev.miamiburger.dao.StartDAO;
import com.internousdev.miamiburger.dto.MCategoryDTO;
import com.internousdev.miamiburger.dto.UserInfoDTO;
import com.internousdev.miamiburger.util.DateUtil;
import com.opensymphony.xwork2.ActionSupport;

public class LogoutAction extends ActionSupport implements SessionAware {

	public Map<String, Object> session;

	public String execute() {

		ArrayList<MCategoryDTO> mCategoryDTOList = new ArrayList<MCategoryDTO>();
		/**
		 * ログアウト時にはセッションを一度空にしますが、再度買い物ができるようにゲストIDは残します また、検索用にカテゴリいれます
		 **/

		// ログイン時のみ動く
		if (session.containsKey("userInfoDTO")) {

			// loginedに1を入れる

			// DTOを取得し、その中からuserIdを取得
			UserInfoDTO dto = new UserInfoDTO();
			dto = (UserInfoDTO) session.get("userInfoDTO");

			// loginedに1を入れる
			LogoutDAO logoutDAO = new LogoutDAO();
			int check = logoutDAO.logout(dto.getUserId());
			if (check == 0) {
				return "errorDAO";
			}

			// 取得したID,ゲスト用ID,（idCheckはログイン時の情報保持）を保存

			String userId = dto.getUserId();
			int idCheck = (int) session.get("idCheck");
			session.clear(); // セッションクリア

			// 再度詰め直し

			// 999999までの乱数生成S
			Random ran = new Random();
			int random = ran.nextInt(899999) + 100000;

			String randomNum = String.valueOf(random);

			// ページを訪れた時の時間
			DateUtil date = new DateUtil();

			// 乱数と時間が仮ユーザーID
			String temp_user_id = randomNum + "&" + date.getLoginDate();
			System.out.println(temp_user_id); // 確認用

			session.put("temp_user_id", temp_user_id);
			session.put("userId", userId);
			session.put("idCheck", idCheck);
			StartDAO dao = new StartDAO();

			mCategoryDTOList = dao.categoryInfo();
			session.put("mCategoryDTOList", mCategoryDTOList);

		}
		return SUCCESS;

	}

	@Override
	public void setSession(Map<String, Object> session) {

		this.session = session;

	}
}
