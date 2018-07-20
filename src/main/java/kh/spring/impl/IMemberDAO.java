package kh.spring.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import kh.spring.dto.MemberDTO;
import kh.spring.interfaces.MemberDAO;

@Component
public class IMemberDAO implements MemberDAO{
	@Autowired
	private JdbcTemplate template;
	
	@Override
	public int addMember(MemberDTO dto) {
		String sql = "insert into members values(members_seq.nextval,?,?,?)";
		return template.update(sql,dto.getId(),dto.getPw(),dto.getName());
	}
	
	@Override
	   public List<MemberDTO> login(MemberDTO dto) {      
	      String sql = "select * from members where id=? and pw=?";
	      return template.query(sql, new Object[] {dto.getId(),dto.getPw()},new RowMapper<MemberDTO>() {
	         @Override
	         public MemberDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
	            MemberDTO tmp = new MemberDTO();
	            tmp.setSeq(rs.getInt(1));
	            tmp.setId(rs.getString(2));
	            tmp.setPw(rs.getString(3));
	            
	            
	            tmp.setName(rs.getString(4));
	            return tmp;
	         }
	      });
	   }
}
