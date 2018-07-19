package kh.spring.interfaces;

import kh.spring.dto.MemberDTO;

public interface MemberService {
	public int memberDelete(MemberDTO dto) throws Exception;
	public int memberUpdate(MemberDTO dto) throws Exception;
}
