package com.zhuani21.review.service;

import java.util.List;

import com.zhuani21.review.auto.bean.Code;

public interface CodeService {
	public List<Code> queryCodeList(String codeType) throws Exception;
}
