package kh.spring.interfaces;

import java.util.List;

import kh.spring.dto.MemberDTO;


public interface MemberService {
	public int addMember(MemberDTO dto);
	public List<MemberDTO> login(MemberDTO dto);
	public int memberDelete(MemberDTO dto) throws Exception;
	public int memberUpdate(MemberDTO dto) throws Exception;
}
