package com.zhuani21.review.service;

import java.util.List;

import com.zhuani21.review.bean.CodeCustom;

public interface CodeService {
	public List<CodeCustom> queryCodeList(String codeType) throws Exception;

	public CodeCustom queryCodeById(String codeId) throws Exception;
}
