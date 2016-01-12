package com.zhuani21.review.mapper;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhuani21.review.bean.Code;
import com.zhuani21.review.bean.User;
import com.zhuani21.review.bean.UserExample;
import com.zhuani21.review.bean.UserExample.Criteria;

public class CodeMapperTest {
	UserMapper userMapper = null;

	@Before
	public void setUpBeforeClass() throws Exception {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-dao.xml");
		userMapper = (UserMapper) applicationContext.getBean("userMapper");
	}

	@Test
	public void test() {
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		criteria.andMobileLike("158%");
		List<User> code = userMapper.selectByExample(example);
		System.out.println(code);
	}

}
