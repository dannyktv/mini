package kh.spring.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import kh.spring.dto.MemberDTO;

@Repository
public class IMemberDAO {
	@Autowired
	private JdbcTemplate template;

	
	public List<MemberDTO> getAllData(String id) throws Exception {
	

		// TODO Auto-generated method stub
		String sql = "select * from members where id=?";
		return template.query(sql, new String[] {id}, new RowMapper<MemberDTO>() {

			@Override
			public MemberDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				MemberDTO tmp = new MemberDTO();
			
				return tmp;
			}
			
		});
		
	}
}
