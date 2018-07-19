package kh.spring.impl;

import org.springframework.beans.factory.annotation.Autowired;

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
	public int memberUpdate(MemberDTO dto) throws Exception{
		return dao.memberUpdate(dto);
	}
}
