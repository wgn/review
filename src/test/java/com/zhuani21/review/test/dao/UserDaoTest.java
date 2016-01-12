package com.zhuani21.review.test.dao;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.zhuani21.review.bean.LoginAuth;
import com.zhuani21.review.bean.User;
import com.zhuani21.review.dao.LoginAuthDao;
import com.zhuani21.review.dao.UserDao;

public class UserDaoTest {
	private static SqlSessionFactory sqlSessionFactory = null;
	static{
		if(null == sqlSessionFactory){
			String conf = "mybatis-config.xml";
			InputStream in = null;
			try {
				in = Resources.getResourceAsStream(conf);
			} catch (IOException e) {
				e.printStackTrace();
			}
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
		}
	}

	public static <T> T getMapper(Class<T> type) {
		return sqlSessionFactory.openSession().getMapper(type);
	}

	@Test
	public void test() throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		UserDao userDao = sqlSession.getMapper(UserDao.class);
		LoginAuthDao loginAuthDao = sqlSession.getMapper(LoginAuthDao.class);
		User u = new User();
		u.setNickname("zhuani21");
		userDao.insertUser(u);
		LoginAuth loginAuth = new LoginAuth();
		loginAuth.setUserId(u.getId());
		loginAuth.setUsername(u.getNickname());
		loginAuth.setPassword("1234");
		loginAuthDao.insertLoginAuth(loginAuth);
		sqlSession.commit();
		sqlSession.close();
	}
	@Test
	public void test1() throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		UserDao userDao = sqlSession.getMapper(UserDao.class);
		LoginAuthDao loginAuthDao = sqlSession.getMapper(LoginAuthDao.class);
		LoginAuth loginAuth = new LoginAuth();
		loginAuth.setUsername("zhuani21");
		loginAuth.setPassword("1234");
		int userId = loginAuthDao.findUserIdViaUsernamePassword(loginAuth);
		
		User u = userDao.findUserViaId(userId);
		sqlSession.close();
		
		System.out.println(u);
	}

}
