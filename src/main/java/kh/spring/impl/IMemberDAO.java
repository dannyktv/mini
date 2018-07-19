package kh.spring.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import kh.spring.dto.MemberDTO;
import kh.spring.interfaces.MemberDAO;

public class IMemberDAO implements MemberDAO {
	
	@Autowired
	private JdbcTemplate template;

	@Override
	public int memberDelete(MemberDTO dto) throws Exception {
		String sql = "DELETE FROM MEMBERS WHERE ID =?";
		return template.update(sql, dto.getId());
	}

	@Override
	public int memberUpdate(MemberDTO dto) throws Exception {
		String sql = "UPDATE MEMBERS SET PW =?, SET NAME =? WHERE ID =?";
		return template.update(sql, dto.getPw(), dto.getName(), dto.getId());
	}

}
