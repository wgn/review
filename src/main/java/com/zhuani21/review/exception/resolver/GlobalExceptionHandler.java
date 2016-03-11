package com.zhuani21.review.exception.resolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import com.zhuani21.review.exception.ReviewBaseException;

public class GlobalExceptionHandler implements HandlerExceptionResolver {

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
		ModelAndView modelAndView = new ModelAndView();
		
		ReviewBaseException baseEx = null;
		if(ex instanceof ReviewBaseException){
			baseEx = (ReviewBaseException) ex;
		}else{
			baseEx = new ReviewBaseException("Sorry！看起来好像发生了什么不愉快的事。");
		}
		String errorMsg = baseEx.getMessage();
		modelAndView.addObject("errorMsg", errorMsg);
		modelAndView.setViewName("errorMsg");
		return modelAndView;
	}

}
