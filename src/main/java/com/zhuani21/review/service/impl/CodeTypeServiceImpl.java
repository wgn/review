package com.zhuani21.review.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.zhuani21.review.bean.CodeType;
import com.zhuani21.review.dao.CodeTypeDao;
import com.zhuani21.review.service.CodeTypeService;

public class CodeTypeServiceImpl implements CodeTypeService {
	@Autowired
	private CodeTypeDao codeTypeDao;
	
	@Override
	public List<CodeType> selectCodeTypeList() throws Exception {
		return codeTypeDao.selectCodeTypeList();
	}
}
