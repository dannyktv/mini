package kh.spring.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

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
	
	@RequestMapping("/login.mem")
	public String toLogin() {
		return "redirect:login.jsp";
	}
	
	@RequestMapping("/loginProc.mem")
	public ModelAndView login(MemberDTO dto, HttpSession session) {
		List<MemberDTO> login = this.service.login(dto);
		
		boolean result = false;
		if(login.isEmpty()) {
			result = false;
		}
		else {
			session.setAttribute("loginId", dto.getId());
			result = true;
		}
		ModelAndView mav = new ModelAndView();
		mav.addObject("result",result);
		mav.setViewName("loginproc.jsp");
		return mav;
	}
	
	@RequestMapping("/join.mem")
	public String toJoin() {
		return "redirect:join.jsp";
	}
	
	@RequestMapping("/joinProc.mem")
	public ModelAndView join(MemberDTO dto) {
		int result = this.service.addMember(dto);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("result",result);
		mav.setViewName("joinproc.jsp");
		
		return mav;
		
	}
}
