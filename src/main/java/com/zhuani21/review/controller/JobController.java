package com.zhuani21.review.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zhuani21.review.bean.JobCustom;
import com.zhuani21.review.service.JobService;

@Controller
@RequestMapping("/job")
public class JobController {
	@Autowired
	JobService jobService;

	@RequestMapping("/list")
	public ModelAndView list() throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		List<JobCustom> jobList = jobService.queryJobList();

		modelAndView.addObject("codeList", jobList);
		modelAndView.setViewName("jobList");
		return modelAndView;
	}

}
