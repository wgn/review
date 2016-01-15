package com.zhuani21.review.service;

import com.zhuani21.review.auto.bean.User;

public interface LoginAuthService {
	public User findUserByUsernamePassword(String username,String password) throws Exception;
}
