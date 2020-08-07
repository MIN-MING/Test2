package com.icia.board.service;

import org.springframework.web.servlet.ModelAndView;

public class MemberMM {

	public ModelAndView access() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "록인실패");
		mav.setViewName("home");
		return mav;
	}

}
