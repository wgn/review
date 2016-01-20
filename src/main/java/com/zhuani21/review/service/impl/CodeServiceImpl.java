package com.zhuani21.review.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.zhuani21.review.auto.bean.Code;
import com.zhuani21.review.auto.bean.CodeExample;
import com.zhuani21.review.auto.mapper.CodeMapper;
import com.zhuani21.review.bean.CodeCustom;
import com.zhuani21.review.service.CodeService;
import com.zhuani21.review.util.BeanCopyUtils;

public class CodeServiceImpl implements CodeService {
	@Autowired
	private CodeMapper codeMapper;
	@Override
	public List<CodeCustom> queryCodeList(String codeType) throws Exception {
		CodeExample codeExample = null;
		if (StringUtils.isNotBlank(codeType)) {
			codeExample = new CodeExample();
			codeExample.createCriteria().andTypeEqualTo(codeType);
		}
		List<Code> codeList = codeMapper.selectByExample(codeExample);
		List<CodeCustom> codeCustomList = BeanCopyUtils.getCustomBeanList(codeList, CodeCustom.class);
		return codeCustomList;
	}
	@Override
	public CodeCustom queryCodeById(String codeId) throws Exception {
		CodeCustom codeCustom = new CodeCustom();
		Integer id = null; 
		if(StringUtils.isNotBlank(codeId)){
			id = Integer.parseInt(codeId);
		}
		Code code = codeMapper.selectByPrimaryKey(id);
		BeanUtils.copyProperties(code, codeCustom);
		return codeCustom;
	}
}
