package com.zhuani21.review.vo;

import com.zhuani21.review.auto.bean.LoginAuth;
import com.zhuani21.review.bean.LoginAuthCustom;

public class LoginAuthCustomVo {
	LoginAuth loginAuth = null;
	LoginAuthCustom loginAuthCustom = null;
	public LoginAuth getLoginAuth() {
		return loginAuth;
	}
	public void setLoginAuth(LoginAuth loginAuth) {
		this.loginAuth = loginAuth;
	}
	public LoginAuthCustom getLoginAuthCustom() {
		return loginAuthCustom;
	}
	public void setLoginAuthCustom(LoginAuthCustom loginAuthCustom) {
		this.loginAuthCustom = loginAuthCustom;
	}
}
