package com.icia.board;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.icia.board.bean.Person;
import com.icia.board.bean.Student;
import com.icia.board.service.MemberMM;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Autowired // Type 으로 주입
	private Student std;

	@RequestMapping(value = "/", method = RequestMethod.GET)

	public ModelAndView home2() { // new Model 구현체()
		MemberMM mm = new MemberMM();
		ModelAndView mav = mm.access();
		return mav;
	}

	@RequestMapping(value = "/home2", method = RequestMethod.GET)
	public String home2(Model model, HttpServletResponse res) {
		logger.info("콘솔창에 기록용");
		// 서비스 클래스 -> Dao
		/*
		 * model.addAttribute("msg", "화이팅!"); String sleep = man.sleep();
		 * model.addAttribute("sleep", sleep);
		 * 
		 * res.setContentType("text/html;charset=utf-8");
		 */
		return "home2";
	}
}
