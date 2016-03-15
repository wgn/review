package com.zhuani21.review.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.zhuani21.review.auto.bean.Job;
import com.zhuani21.review.auto.mapper.JobMapper;
import com.zhuani21.review.service.JobService;

public class JobServiceImpl implements JobService {
	
	@Autowired
	private JobMapper jobMapper;

	@Override
	public List<Job> queryJobList() throws Exception {
		return jobMapper.selectByExample(null);
	}

}
