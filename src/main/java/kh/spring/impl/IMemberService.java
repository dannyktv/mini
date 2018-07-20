package kh.spring.impl;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

import kh.spring.dto.MemberDTO;
import kh.spring.interfaces.MemberDAO;
import kh.spring.interfaces.MemberService;

public class IMemberService implements MemberService{
	@Autowired
	private MemberDAO dao;
	
	@Override
	public int memberDelete(MemberDTO dto) throws Exception{
		return dao.memberDelete(dto);
	}
	
	@Override
	public int memberUpdate(MemberDTO dto) throws Exception{
		return dao.memberUpdate(dto);
	}
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kh.spring.dto.MemberDTO;
import kh.spring.interfaces.MemberDAO;
import kh.spring.interfaces.MemberService;

	
	
	@Override
	public int addMember(MemberDTO dto) {
		return dao.addMember(dto);
	}

	@Override
	public List<MemberDTO> login(MemberDTO dto) {
		return dao.login(dto);
	}
@Component
}
