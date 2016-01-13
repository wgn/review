package com.zhuani21.review.vo;

import com.zhuani21.review.auto.bean.User;
import com.zhuani21.review.bean.UserCustom;

public class UserCustomVo {
	User user = null;
	UserCustom userCustom = null;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public UserCustom getUserCustom() {
		return userCustom;
	}
	public void setUserCustom(UserCustom userCustom) {
		this.userCustom = userCustom;
	}
}
