package com.zhuani21.review.dao;

import com.zhuani21.review.bean.User;

public interface UserDao {
	void insertUser(User u) throws Exception;
	User findUserViaId(int id) throws Exception;
}
