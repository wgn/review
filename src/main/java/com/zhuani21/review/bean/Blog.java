package com.zhuani21.review.bean;

import org.apache.commons.lang3.StringUtils;

public class Blog {
	private static String content = "";
	public static void add(String c){
		if(StringUtils.isNotBlank(c)){
			content = c + content;
		}
	}
	public static String get(){
		return content;
	}
}
