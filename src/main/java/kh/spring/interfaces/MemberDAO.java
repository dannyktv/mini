package kh.spring.interfaces;

import kh.spring.dto.MemberDTO;

import java.util.List;

import kh.spring.dto.MemberDTO;

public interface MemberDAO {
	public List<MemberDTO> getAllData(String id) throws Exception;
	public int memberDelete(String id) throws Exception;
	public int memberUpdate(MemberDTO dto) throws Exception;
	public int addMember(MemberDTO dto);
	public List<MemberDTO> login(MemberDTO dto);
}
