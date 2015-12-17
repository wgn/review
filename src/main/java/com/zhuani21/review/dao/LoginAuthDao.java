package com.zhuani21.review.dao;

import com.zhuani21.review.bean.LoginAuth;

public interface LoginAuthDao {
	void insertLoginAuth(LoginAuth loginAuth) throws Exception;
	int findUserIdViaUsernamePassword(LoginAuth loginAuth) throws Exception;
}
