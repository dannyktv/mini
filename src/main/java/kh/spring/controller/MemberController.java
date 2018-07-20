package kh.spring.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kh.spring.dto.MemberDTO;
import kh.spring.interfaces.MemberService;

@Controller
public class MemberController {
	@Autowired
	private MemberService service;
	@RequestMapping("/mypage.mem")
	public ModelAndView toOutput(HttpServletRequest req) throws Exception{
		ModelAndView mav = new ModelAndView();
		String id = (String)req.getSession().getAttribute("loginId");
		List<MemberDTO> result = this.service.getAllData(id);
		mav.setViewName("mypage.jsp");
		mav.addObject("result", result.get(0));
		return mav;
	}
	
}
