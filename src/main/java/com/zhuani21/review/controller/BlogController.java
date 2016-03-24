package com.zhuani21.review.controller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zhuani21.review.bean.Blog;
import com.zhuani21.review.util.WDate;

@Controller
@RequestMapping("/blog")
public class BlogController {
	
	private static Logger logger = Logger.getLogger(BlogController.class); 

	@RequestMapping("/admin")
	public ModelAndView admin(HttpServletRequest req,HttpServletResponse resp) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		
		/*String license = req.getParameter("license");
		if(StringUtils.isNoneBlank(license)){*/
			modelAndView.addObject("admin",true);
		/*}*/
		modelAndView.addObject("blog", Blog.get());
		modelAndView.setViewName("blogIndex");
		return modelAndView;
	}
	@RequestMapping("/index")
	public ModelAndView index(HttpServletRequest req,HttpServletResponse resp) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.addObject("blog", Blog.get());
		modelAndView.setViewName("blogIndex");
		return modelAndView;
	}
	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest req,HttpServletResponse resp) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		String content = req.getParameter("content");
		if(StringUtils.isNoneBlank(content)){
			String today = new WDate("yyyy/MM/dd").toString();
			String preStr = "--------------------- " + today + " ";
			Blog.add(preStr + content+"\r\n\r\n");
		}
		modelAndView.addObject("admin",true);
		modelAndView.addObject("blog", Blog.get());
		modelAndView.setViewName("redirect:/blog/admin.action");
		return modelAndView;
	}
}
