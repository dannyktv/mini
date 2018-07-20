package kh.spring.controller;

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
	
	@RequestMapping("/delete.mem")
	public ModelAndView delete(MemberDTO dto) throws Exception{
		
		int resultDelete = this.service.memberDelete(dto);
		ModelAndView mav = new ModelAndView();
		mav.addObject("resultDelete", resultDelete);
		mav.setViewName("login.jsp");
		return mav;
	}
	
	@RequestMapping("/update.mem")
	public ModelAndView update(MemberDTO dto) throws Exception{
		
		int resultUpdate = this.service.memberUpdate(dto);
		ModelAndView mav = new ModelAndView();
		mav.addObject("resultUpdate", resultUpdate);
		mav.setViewName("login.jsp");
		return mav;
	}
}
