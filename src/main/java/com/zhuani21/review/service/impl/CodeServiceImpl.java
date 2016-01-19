package com.zhuani21.review.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.zhuani21.review.auto.bean.Code;
import com.zhuani21.review.auto.bean.CodeExample;
import com.zhuani21.review.auto.mapper.CodeMapper;
import com.zhuani21.review.service.CodeService;

public class CodeServiceImpl implements CodeService {
	@Autowired
	private CodeMapper codeMapper;
	@Override
	public List<Code> queryCodeList(String codeType) throws Exception {
		CodeExample codeExample = null;
		if(StringUtils.isNotBlank(codeType)){
			codeExample = new CodeExample();
			codeExample.createCriteria().andTypeEqualTo(codeType);
		}
		return codeMapper.selectByExample(codeExample);
	}
}
