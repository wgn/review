package com.zhuani21.review.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.zhuani21.review.auto.bean.Job;
import com.zhuani21.review.auto.mapper.JobMapper;
import com.zhuani21.review.bean.JobCustom;
import com.zhuani21.review.service.JobService;

public class JobServiceImpl implements JobService {
	
	@Autowired
	private JobMapper jobMapper;

	@Override
	public List<Job> queryJobList() throws Exception {
		return jobMapper.selectByExample(null);
	}

	@Override
	public JobCustom queryJobById(Integer id) {
		Job job =  jobMapper.selectByPrimaryKey(id);
		JobCustom jobCustom = new JobCustom();
		BeanUtils.copyProperties(job, jobCustom);
		return jobCustom;
	}

	@Override
	public void insertJob(JobCustom job) {
		jobMapper.insert(job);
	}

}
