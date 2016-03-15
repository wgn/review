package com.zhuani21.review.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zhuani21.review.auto.bean.Job;
import com.zhuani21.review.bean.JobCustom;
import com.zhuani21.review.service.JobService;
import com.zhuani21.review.util.BeanCopyUtils;

@Controller
@RequestMapping("/job")
public class JobController {
	@Autowired
	JobService jobService;

	@RequestMapping("/list")
	public ModelAndView list() throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		List<Job> jobList = jobService.queryJobList();
		List<JobCustom> jobCustomList = BeanCopyUtils.getCustomBeanList(jobList, JobCustom.class);
		modelAndView.addObject("jobList", jobCustomList);
		modelAndView.setViewName("jobList");
		return modelAndView;
	}

}
