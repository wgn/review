package com.zhuani21.review.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zhuani21.review.auto.bean.Code;
import com.zhuani21.review.service.CodeService;

@Controller
@RequestMapping("/code")
public class CodeController {
	@Autowired
	CodeService codeService;

	@RequestMapping("/list")
	public ModelAndView list(HttpServletRequest req,HttpServletResponse resp) throws Exception {
		String codeType = req.getParameter("codeType");
		ModelAndView modelAndView = new ModelAndView();
		List<Code> codeList = codeService.queryCodeList(codeType);
		Set<String> codeTypeSet = new HashSet<String>();
		for(Code code : codeList){
			codeTypeSet.add(code.getType());
		}
		modelAndView.addObject("codeList", codeList);
		modelAndView.addObject("codeTypeSet",codeTypeSet);
		modelAndView.setViewName("codeList");
		return modelAndView;
	}
}
