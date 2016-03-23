package com.zhuani21.review.service.impl;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhuani21.review.auto.bean.User;
import com.zhuani21.review.bean.LoginAuthCustom;
import com.zhuani21.review.dao.LoginAuthDao;
import com.zhuani21.review.service.LoginAuthService;
import com.zhuani21.review.vo.LoginAuthCustomVo;
@Service("loginAuthService")
public class LoginAuthServiceImpl implements LoginAuthService {
	@Autowired
	private LoginAuthDao LoginAuthDao;

	@Override
	public User findUserByUsernamePassword(String username, String password) throws Exception {
		User u = null;
		LoginAuthCustomVo loginAuthCustomVo = new LoginAuthCustomVo();
		LoginAuthCustom loginAuthCustom = new LoginAuthCustom();
		if(StringUtils.isNotBlank(username) && StringUtils.isNotBlank(password)){
			loginAuthCustom.setUsername(username);
			loginAuthCustom.setPassword(password);
			loginAuthCustomVo.setLoginAuthCustom(loginAuthCustom);
			u = LoginAuthDao.findUserByLoginAuth(loginAuthCustomVo);
		}
		return u;
	}

}
