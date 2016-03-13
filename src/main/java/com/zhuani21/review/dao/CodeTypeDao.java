package com.zhuani21.review.dao;

import java.util.List;

import com.zhuani21.review.bean.CodeType;

public interface CodeTypeDao {

	public List<CodeType> selectCodeTypeList() throws Exception;

	public CodeType selectCodeTypeById(int id) throws Exception;

	public void insertCodeType(CodeType codeType) throws Exception;
}
