package com.zhuani21.review.dao;

import com.zhuani21.review.auto.bean.User;
import com.zhuani21.review.vo.LoginAuthCustomVo;

public interface LoginAuthDao {
	
	public User findUserByLoginAuth(LoginAuthCustomVo loginAuthCustomVo) throws Exception;
	
}
