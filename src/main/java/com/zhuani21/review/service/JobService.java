package com.zhuani21.review.service;

import java.util.List;

import com.zhuani21.review.auto.bean.Job;
import com.zhuani21.review.bean.JobCustom;

public interface JobService {
	public List<Job> queryJobList() throws Exception;
}
