package com.zhuani21.review.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.zhuani21.review.auto.bean.Code;
import com.zhuani21.review.bean.CodeCustom;
import com.zhuani21.review.bean.CodeVO;
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
		List<CodeCustom> codeList = codeService.queryCodeList(codeType);
		Set<String> codeTypeSet = new HashSet<String>();
		for(CodeCustom code : codeList){
			codeTypeSet.add(code.getType());
		}
		modelAndView.addObject("codeList", codeList);
		modelAndView.addObject("codeTypeSet",codeTypeSet);
		modelAndView.setViewName("codeList");
		return modelAndView;
	}
	@RequestMapping(value={"/add"},method={RequestMethod.GET})
	public ModelAndView add(HttpServletRequest req,HttpServletResponse resp) throws Exception {
		return addAndEditView(req,resp,"add");
	}
	@RequestMapping(value={"/add"},method={RequestMethod.POST})
	public ModelAndView save(Code code) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		if(StringUtils.isBlank(code.getType()) || StringUtils.isBlank(code.getCode())){
			modelAndView.addObject("errorMsg", "编码和编码类型不能为空");
			modelAndView.addObject("code", code);
			modelAndView.addObject("opType", "add");
			modelAndView.setViewName("updateCode");
			return modelAndView;
		}
		return modelAndView;
	}
	@RequestMapping("/edit")
	public ModelAndView edit(HttpServletRequest req,HttpServletResponse resp) throws Exception {
		return addAndEditView(req,resp,"edit");
	}
	
	private ModelAndView addAndEditView(HttpServletRequest req,HttpServletResponse resp,String opType) throws Exception{
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("updateCode");
		modelAndView.addObject("opType",opType);
		String codeId = req.getParameter("id");
		if(StringUtils.isBlank(codeId)){
			return modelAndView;
		}
		CodeCustom code = codeService.queryCodeById(codeId);
		modelAndView.addObject("code", code);
		return modelAndView;
	}
}
