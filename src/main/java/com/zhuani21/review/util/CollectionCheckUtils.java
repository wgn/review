package com.zhuani21.review.util;

import java.util.List;

public class CollectionCheckUtils {
	public static final <T> boolean isBlankList(List<T> list) {
		if(null!=list && list.size()>0){
			return false;
		}
		return true;
	}
	
	public static final <T> boolean isNotBlankList(List<T> list) {
		if(isBlankList(list)){
			return false;
		}
		return true;
	}
}
