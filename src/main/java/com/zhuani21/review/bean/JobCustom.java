package com.zhuani21.review.bean;

public class JobCustom {
	private String jobId;
	//作业名称
	private String jobName;
	//作业类型
	private String jobCycleType;
	//详情描述
	private String jobDescription;
	//外部链接
	private String jobLink;
	//状态（进度）
	private String jobStatus;
	//地址（上传文件，下载作业）
	private String filePath;
	//当前进度日期（考虑应该计算获得）
	private String currentDate;
}
