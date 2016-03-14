package com.zhuani21.review.bean;

import com.zhuani21.review.auto.bean.Code;

public class CodeCustom extends Code {
	public static final String BASE_CODE_TYPE="base";

	@Override
	public String toString() {
		return "CodeCustom [getId()=" + getId() + ", getType()=" + getType() + ", getCode()=" + getCode() + ", getName()=" + getName() + ", getParentId()=" + getParentId() + "]";
	}
}
