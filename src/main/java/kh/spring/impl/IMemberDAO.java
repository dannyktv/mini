package kh.spring.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import kh.spring.dto.MemberDTO;
import kh.spring.interfaces.MemberDAO;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;




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
	@Override
	public int memberDelete(String id) throws Exception {
		String sql = "DELETE FROM MEMBERS WHERE ID =?";
		return template.update(sql,id);
	}

	@Override
	public int memberUpdate(MemberDTO dto) throws Exception {
		String sql = "UPDATE MEMBERS SET PW =?, SET NAME =? WHERE ID =?";
		return template.update(sql, dto.getPw(), dto.getName(), dto.getId());
	}


	
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
